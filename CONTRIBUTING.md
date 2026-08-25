# Contributing

Thank you for helping maintain **`au.gov.nehta:mhr-wsdl`**. This repository publishes My Health Record B2B WSDL resources and committed Jakarta JAX-WS/JAXB generated types.

## Build

Prerequisites: **JDK 17+** and **Maven 3.6+**.

```text
mvn -B "-Dgpg.skip=true" clean verify
```

The default lifecycle compiles committed sources only. It does not run **`wsimport`**.

## Local Snapshot Install

Use **`install`** when a sibling project needs the unpublished local coordinate:

```text
mvn -B "-Dgpg.skip=true" clean install
```

Consumers that pin **`mhr-wsdl`** to **`${project.version}`** must use the same version as this **`pom.xml`**.

## Source Layout

| Path | Purpose |
| ---- | ------- |
| `src/main/java/au/net/electronichealth/ns/mhr/` | Generated MHR B2B service and schema types |
| `src/main/java/mhr_override/` | xmldsig override types |
| `src/main/java/wsdls/` | WSDL/XSD reference tree |
| `src/main/resources/wsdl/` | Classpath WSDL packaged in the JAR |
| `src/test/java/au/gov/nehta/mhrwsdl/` | Offline build and binding checks |

## Generated Sources

Regeneration is a maintainer task. Preserve public package names, class names, WSDL filenames, and the **`mhr_override`** layout. Generated Java in this line uses Jakarta XML Web Services imports.

## Release Notes

Update **`CHANGELOG.md`** for public changes. Integrator-facing docs use Maven versions, not Git branch names.
