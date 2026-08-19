#!/usr/bin/env python3
"""Fix wsimport-generated Javadoc so doclint=all passes on Java 8."""
from __future__ import annotations

import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
SRC = ROOT / "src" / "main" / "java"

PARAM_DESCRIPTIONS = {
    "pcehrHeader": "PCEHR request header",
    "parameters0": "SOAP response holder",
    "timestampHeader": "timestamp SOAP header",
    "parameters": "request payload",
    "signatureHeader": "signature SOAP header holder",
    "message": "exception message",
    "faultInfo": "SOAP fault detail",
    "cause": "underlying cause",
    "value": "field value",
    "body": "SOAP request body",
    "partName": "SOAP part name",
    "features": "web service features",
}


def camel_to_words(name: str) -> str:
    spaced = re.sub(r"([a-z0-9])([A-Z])", r"\1 \2", name)
    return spaced.lower()


def param_description(name: str) -> str:
    if name in PARAM_DESCRIPTIONS:
        return PARAM_DESCRIPTIONS[name]
    return f"{camel_to_words(name)} parameter"


def throws_description(exc: str) -> str:
    return f"if the service returns a {exc} fault"


def fix_javadoc_line(line: str) -> str:
    if not re.match(r"\s+\*", line):
        return line
    line = line.replace("{@code byte[]}", "{@link byte[]}")
    line = line.replace("{@code >}", "&gt;")
    if "&lt;" in line:
        out: list[str] = []
        i = 0
        while i < len(line):
            ch = line[i]
            if ch == ">" and (i == 0 or line[i - 1] != "-"):
                if i >= 4 and line[i - 4 : i] == "&gt":
                    out.append(">")
                else:
                    out.append("&gt;")
            else:
                out.append(ch)
            i += 1
        line = "".join(out)

    m = re.match(r"^(\s+\*)\s@param\s+(\w+)\s*$", line)
    if m:
        return f"{m.group(1)} @param {m.group(2)} {param_description(m.group(2))}"

    m = re.match(r"^(\s+\*)\s@throws\s+(\w+)\s*$", line)
    if m:
        return f"{m.group(1)} @throws {m.group(2)} {throws_description(m.group(2))}"

    m = re.match(r"^(\s+\*)\s@return\s*$", line)
    if m:
        return f"{m.group(1)} @return the result"

    return line


def merge_empty_p_tags(lines: list[str]) -> list[str]:
    result: list[str] = []
    i = 0
    while i < len(lines):
        line = lines[i]
        if re.match(r"^\s+\*\s*<p>\s*$", line.rstrip("\n\r")):
            if i + 1 < len(lines):
                nxt = lines[i + 1].rstrip("\n\r")
                nxt_match = re.match(r"^(\s+\*)\s*(.+)$", nxt)
                if nxt_match:
                    prefix, content = nxt_match.groups()
                    if content.startswith("<pre>"):
                        i += 1
                        continue
                    eol = lines[i + 1][len(nxt) :]
                    result.append(f"{prefix} <p>{content}{eol}")
                    i += 2
                    continue
            i += 1
            continue
        result.append(line)
        i += 1
    return result


def fix_return_with_following_line(lines: list[str]) -> list[str]:
    result: list[str] = []
    i = 0
    while i < len(lines):
        line = lines[i]
        if re.match(r"^\s+\*\s@return\s*$", line.rstrip("\n\r")) and i + 1 < len(lines):
            nxt = lines[i + 1].rstrip("\n\r")
            m = re.match(r"^\s+\*\s+returns fault bean:\s*(.+)$", nxt)
            if m:
                prefix = re.match(r"^(\s+\*)", line.rstrip("\n\r")).group(1)
                eol = line[len(line.rstrip("\n\r")) :]
                result.append(f"{prefix} @return SOAP fault detail bean: {m.group(1)}{eol}")
                i += 2
                continue
        result.append(line)
        i += 1
    return result


def return_description(block: str, method_name: str) -> str:
    if "Create an instance of" in block or method_name.startswith("create"):
        return "newly created instance"
    if method_name.startswith("get") or method_name.startswith("is"):
        return "field value"
    return "the result"


def insert_before_block_close(block: str, tag_line: str) -> str:
    m = re.search(r"\n(\s+)\*/\s*$", block)
    if not m:
        return block
    indent = m.group(1)
    return block[: m.start()] + f"\n{indent}* {tag_line}\n{indent}*/"


def add_missing_method_tags(content: str) -> str:
    block_pattern = re.compile(
        r"(/\*\*(?:(?!\*/).)*?\*/)\s*(?:@[\w.]+(?:\([^)]*\))?\s*)*"
        r"public\s+([\w<>,\[\]\s.?extends]+)\s+(\w+)\s*\(([^)]*)\)",
        re.DOTALL,
    )

    def replacer(match: re.Match[str]) -> str:
        block, ret_type, method_name, params = match.groups()
        new_block = block
        if "value" in params and "@param value" not in block:
            new_block = insert_before_block_close(new_block, "@param value field value")
        if ret_type.strip() != "void" and "@return" not in block:
            desc = return_description(block, method_name)
            new_block = insert_before_block_close(new_block, f"@return {desc}")
        if new_block != block:
            return new_block + match.group(0)[len(block) :]
        return match.group(0)

    return block_pattern.sub(replacer, content)


def fix_file(path: Path) -> bool:
    original = path.read_text(encoding="utf-8")
    lines = original.splitlines(keepends=True)
    lines = merge_empty_p_tags(lines)
    lines = fix_return_with_following_line(lines)
    interim = "".join(lines)
    interim = add_missing_method_tags(interim)
    changed = interim != original
    lines = interim.splitlines(keepends=True)
    if not lines or not lines[-1].endswith("\n"):
        if lines:
            lines[-1] = lines[-1] + "\n"
    fixed: list[str] = []
    for line in lines:
        new_line = fix_javadoc_line(line.rstrip("\n\r"))
        if new_line != line.rstrip("\n\r"):
            changed = True
        fixed.append(new_line + line[len(line.rstrip("\n\r")) :])
    if changed:
        path.write_text("".join(fixed), encoding="utf-8", newline="\n")
    return changed


def main() -> None:
    count = 0
    for path in sorted(SRC.rglob("*.java")):
        if fix_file(path):
            count += 1
    print(f"Updated {count} file(s)")


if __name__ == "__main__":
    main()
