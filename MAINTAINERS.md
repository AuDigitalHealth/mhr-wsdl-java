# Maintainer guide

Paths are relative to the repository root (directory containing **`pom.xml`**).

## Release line

**Documentation convention:** README, CONTRIBUTING, CHANGELOG, and integrator-facing text use **version numbers only** — never Git branch names.

| Version | Java | APIs | `Service` stubs |
| ------- | ---- | ---- | ----------------- |
| **1.6.3** | 8 | **`javax.xml.ws`**, **`javax.xml.bind`**, **`javax.jws`** | **12** (MHR B2B) |

**Git branch (maintainers / checkout only — do not use in integrator docs):** **`java-8-javax`** or **`java-8-javax-full-wsdl`**.

**This tree (`1.6.3-SNAPSHOT`):** Java **8**, committed **`javax`** generated types, **12** primary MHR B2B **`@WebServiceClient`** services. Sources are **frozen** in Git (no **`wsimport`** in this POM). **`mhr-b2b-client-java`** (**`master`**) resolves **`pcehr-compiled-wsdl`** at **`${project.version}`** — **`mvn install`** here before an unpublished client **`verify`**. GA **`1.6.3`** pairs ship to Maven Central together. Java **11** / **Jakarta** MHR facade clients live in **[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)** **`java-11-jakarta`** — separate artifact line.

## Artifact

- **`au.gov.nehta:pcehr-compiled-wsdl`** — MHR B2B WSDL on the classpath + pre-generated JAX-WS/JAXB types.
- **Not included:** PCEHR facade clients, TLS/signing, or custom runtime WSDL resolution (**[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)** is a separate artifact and does not depend on this JAR).

## Layout

| Path | Role |
| ---- | ---- |
| `src/main/resources/wsdl/` | **`B2B_*.wsdl`** packaged under **`/wsdl/`** in the JAR |
| `src/main/java/wsdls/` | Legacy WSDL/XSD reference tree (**`wsdls/wsdl/External/`**, **`wsdls/schema/`**) |
| `src/main/java/` | Committed generated types + **`au.gov.nehta.schema.DateAdapter`** |
| `src/main/java/pcehr_override/` | xmldsig types (override package) |
| `scripts/fix-javadoc.py` | Repair wsimport Javadoc after regeneration |

There is **no** in-repo **`wsimport`** profile. Offline unit tests under **`src/test/java/au/gov/nehta/pcehrwsdl/`** (javax stack, WSDL classpath, generated binding smoke tests).

## Build (`1.6.3` line)

- **`maven.compiler.release`** **8**
- Compile deps ( **`provided`** ): **`jaxb-api` 2.3.1**, **`jaxws-api` 2.3.1**, **`javax.jws-api` 1.1** — no **`jaxws-rt`** in this POM
- **`maven-enforcer-plugin`:** bans Metro **`webservices-*`**, all **`jakarta.*`** XML APIs — not EE4J **`jaxws-rt`** (that belongs in consuming apps)
- Consumers: Eclipse EE4J **`com.sun.xml.ws:jaxws-rt` 2.3.7** (last **2.3.x** on Central for Java **8**)
- **`maven-gpg-plugin`:** skipped unless **`-Dgpg.skip=false`**
- **`maven-javadoc-plugin`:** **`doclint=all`**, **`failOnWarnings=true`**, **`detectOfflineLinks=false`**
- Javadoc fixes after wsimport: **`python scripts/fix-javadoc.py`**
- Build plugins aligned with **hi-wsdl-java** **`1.6.3`** (Java **8**–compatible latest releases)
- **No source regeneration** on **`1.6.3`** — **`src/main/java`** and **`pcehr_override/`** are committed as-is

## Release

Publishing uses **`central-publishing-maven-plugin`** (Sonatype Central Portal). Copy **`settings.xml.example`** → **`settings.xml`**, server id **`central`**.

**Parallel release lines (maintainers only):** each Git branch publishes a **different Maven version** — integrators choose by coordinate, not branch name.

| Branch | Java | types / client version | `Service` stubs |
| ------ | ---- | ---------------------- | --------------- |
| **`java-8-javax-full-wsdl`** | 8 / javax | **1.6.3** | 12 |
| **`java-11-jakarta-full-wsdl`** | 11 / Jakarta | **1.7.0** | 12 |

Release **`pcehr-compiled-wsdl`** and **`mhr-b2b-client`** at the **same GA version** on the matching branch pair before integrators upgrade.

### SNAPSHOT or manual GA

1. Update **CHANGELOG.md** (and **`pom.xml`** / SCM **`<tag>`** for manual GA).
2. **`mvn -B "-Prelease" clean verify`**
3. **`mvn -B "-Prelease" deploy`**

Git/SCM settings for **`maven-release-plugin`** live in **`pom.xml`** properties (**`scm.repo.url`**, **`release.*`**). Tags default to **`{artifactId}-{version}`** (e.g. **`pcehr-compiled-wsdl-1.7.0`**).

### Automated GA (`maven-release-plugin`)

Run on the **target branch** with a **clean** working tree. The plugin commits version bumps, creates the release tag, deploys from the tag checkout, bumps to the next **`-SNAPSHOT`**, and **pushes branch + tag** (**`pushChanges`** / **`remoteTagging`** in **`pom.xml`**). Git remote credentials (SSH or HTTPS) must work non-interactively.

```text
mvn -B "-Prelease" release:prepare release:perform -DreleaseVersion=1.7.0 -DdevelopmentVersion=1.7.1-SNAPSHOT -Dtag=pcehr-compiled-wsdl-1.7.0
```

Replace versions and **`-Dtag`** for the branch you are on (**`mhr-b2b-client-1.6.3`**, **`pcehr-compiled-wsdl-1.6.3`**, etc.). Omit **`-D…`** only if you accept interactive prompts.

**After success:** confirm the artifact on Central; repeat on the paired types/client repo. No extra Git steps unless push failed (then **`git push origin <branch>`** and **`git push origin <tag>`**).

**`-Dgpg.skip=false`** is equivalent to **`-Prelease`** for signing.

## Public commit checklist

Before pushing to a **public** remote:

1. **`git status`** — no keystores, **`settings.xml`**, or **`local.properties`** staged.
2. No **`target/`** committed.
3. **`mvn -B clean verify`** passes.
4. **CHANGELOG.md** and **`pom.xml`** version reflect the release line.

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
