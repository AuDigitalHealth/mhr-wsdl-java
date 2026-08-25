# MHR WSDL library

Maven artifact **`au.gov.nehta:mhr-wsdl`** - My Health Record **B2B WSDL resources** and **pre-generated JAX-WS / JAXB types** for MHR client development.

For facade clients, TLS, and signing, use **[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)**. This repository supplies the **generated type layer** and classpath WSDL only. The pairing is the same as **`hi-wsdl`** / **`hi-b2b-client`**: same Maven version, types JAR first.

## Dependency

Published releases are consumed from **[Maven Central](https://central.sonatype.com/)**. Use a **`<version>`** that matches your JDK (see **Versioning**).

```xml
<dependency>
  <groupId>au.gov.nehta</groupId>
  <artifactId>mhr-wsdl</artifactId>
  <version>8.0.0</version>
</dependency>
```

**This line (`8.0.0`):** Java **8**, **`javax.xml.ws`** / **`javax.xml.bind`**, **12** MHR B2B **`Service`** stubs, **committed** generated types (no **`wsimport`** in the build). Add Eclipse EE4J **`com.sun.xml.ws:jaxws-rt`** **2.3.7** at runtime in your application when you invoke SOAP endpoints. This JAR does not bundle **`jaxws-rt`**. Do **not** use legacy Metro **`webservices-*`** bundles.

When **`mhr-b2b-client`** is also on the classpath, use the **same** Maven version for both artifacts.

---

## Versioning

The **first number** of the Maven version is the **Java SE** version that this types JAR targets. Downstream artifacts that pin **`mhr-wsdl`** to **`${project.version}`** (including **`mhr-b2b-client`**) use that same coordinate on a given line.

| Maven version | Java SE | XML stack | `Service` stubs |
| ------------- | ------- | --------- | --------------- |
| **8.0.0** | **8** | **`javax.*`** / EE4J **`jaxws-rt` 2.3.x** at runtime in consumers | **12** (MHR B2B) |
| **11.0.0.1** | **11** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | **12** (MHR B2B) |
| **17.0.0.1** | **17** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | **12** (MHR B2B) |
| **21.0.0.1** | **21** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | **12** (MHR B2B) |
| **24.0.0.1** | **24** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | **12** (MHR B2B) |

Pick the coordinate that matches your JDK. Do not mix **`mhr-wsdl`** versions with a consumer that expects a different line. All published versions are on **[Maven Central](https://central.sonatype.com/)**.

Java packages and type names use **`mhr`** (`au.net.electronichealth.ns.mhr`, **`MHRHeader`**, **`RegisterMHR`**, **`mhr_override`**). SOAP/XML namespaces, element names, and operation names stay the published B2B contract (`http://ns.electronichealth.net.au/pcehr/...`, **`PCEHRHeader`**, **`registerPCEHR`**).

---

## Note

The **8.0.0** JAR ships **12** MHR B2B **`Service`** stubs on **`javax`**. **11.0.0.1** and later lines use **Jakarta** with the same stub count.

---

## Local development (SNAPSHOT)

This repository builds **`8.0.0-SNAPSHOT`**. The default lifecycle compiles **committed** types only. To make an unpublished JAR resolvable for other local projects:

```text
mvn -B "-Dgpg.skip=true" clean install
```

Consumers that declare **`au.gov.nehta:mhr-wsdl`** at **`${project.version}`** (including **`mhr-b2b-client-java`**) need that install (or a Central GA) before their **`verify`**.

If Maven warns that a **GA** POM is missing (for example **`8.0.0`** before Central publish), clear stale **`au/gov/nehta/mhr-wsdl`** entries in your **local Maven repository** (folders with only **`.lastUpdated`** files) and reinstall the SNAPSHOT. **`mvn clean`** in this project does not clear the local repository cache.

## What is in the JAR

| Content | Location in repo |
| ------- | ---------------- |
| MHR B2B WSDL (classpath) | `src/main/resources/wsdl/B2B_*.wsdl` |
| WSDL/XSD reference tree | `src/main/java/wsdls/` |
| Generated stubs (`javax`) | `src/main/java/` (excluding `wsdls/`) |
| Date adapter | `src/main/java/au/gov/nehta/schema/DateAdapter.java` |
| xmldsig override types | `src/main/java/mhr_override/org/w3/` |

The published JAR includes **22** WSDL files under **`/wsdl/`**: 12 service WSDLs plus 10 interface-only **`B2B_*Interface.wsdl`** files. Integrators load them from the classpath, for example **`ClassLoader.getResource("wsdl/B2B_MHRProfile.wsdl")`**, or pass an explicit **`URL`** to generated **`Service`** constructors.

Generated **`Service`** stubs cover 12 primary MHR B2B operations: document registry/repository; get audit, change-history, individual-details, representative-list, and view; get/search template; MHR profile; register MHR; remove document.

## Building from source

**Audience:** contributors changing this repository - not integrators adding a Maven dependency.

Prerequisites: **JDK 8+**, **Maven 3.6+**. All JAX-WS/JAXB types are **committed** in **`src/main/java`**; the build compiles them only.

```text
mvn -B "-Dgpg.skip=true" clean verify
```

See **`CONTRIBUTING.md`** for **`mvn install`** when testing unpublished snapshots locally.

## Related repositories

| Repository | Role |
| ---------- | ---- |
| [mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java) | MHR facade clients (depends on this artifact) |
| [hi-wsdl-java](https://github.com/AuDigitalHealth/hi-wsdl-java) | HI WSDL/types (separate domain) |

Confirm your organisation's redistribution terms for MHR B2B WSDL before mirroring this repository. MHR B2B WSDL/XSD in this repository are part of the published open-source artifact.

## Documentation

| Document | Audience |
| -------- | -------- |
| **README.md** (this file) | Integrators |
| **CONTRIBUTING.md** | Contributors |
| **MAINTAINERS.md** | Releases and tooling |
| **SECURITY.md** | Secrets and reporting |
| **CHANGELOG.md** | Release history |
| **LICENSE.txt** | Apache License 2.0 + ADHA terms |

## License

Apache License 2.0. See **LICENSE.txt**.
