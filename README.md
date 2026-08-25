# MHR WSDL library

Maven artifact **`au.gov.nehta:mhr-wsdl`** - My Health Record **B2B WSDL resources** and **pre-generated Jakarta JAX-WS / JAXB types** for MHR client development.

For facade clients, TLS, and signing, use **[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)**. This repository supplies the generated type layer and classpath WSDL only.

## Dependency

Published releases are consumed from **[Maven Central](https://central.sonatype.com/)**. Use a **`<version>`** that matches your JDK.

```xml
<dependency>
  <groupId>au.gov.nehta</groupId>
  <artifactId>mhr-wsdl</artifactId>
  <version>17.0.0</version>
</dependency>
```

**This line (`17.0.0`):** Java **17**, **Jakarta XML APIs**, **12** MHR B2B **`Service`** stubs, and committed generated types. Consuming SOAP clients add Eclipse EE4J **`com.sun.xml.ws:jaxws-rt`** **4.0.5** at runtime. Do not use legacy Metro **`webservices-*`** bundles.

When **`mhr-b2b-client`** is also on the classpath, use the same Maven version for both artifacts.

## Versioning

The first number of the Maven version is the Java SE version that this types JAR targets. Downstream artifacts that pin **`mhr-wsdl`** to **`${project.version}`** use that same coordinate on a given line.

| Maven version | Java SE | XML stack | `Service` stubs |
| ------------- | ------- | --------- | --------------- |
| **8.0.0** | **8** | **`javax.*`** / EE4J **`jaxws-rt` 2.3.x** at runtime in consumers | **12** (MHR B2B) |
| **11.0.0** | **11** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | **12** (MHR B2B) |
| **17.0.0** | **17** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | **12** (MHR B2B) |
| **21.0.0** | **21** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | **12** (MHR B2B) |
| **24.0.0** | **24** | **Jakarta** / EE4J **`jaxws-rt` 4.0.x** at runtime in consumers | **12** (MHR B2B) |

Java packages and type names use **`mhr`** (`au.net.electronichealth.ns.mhr`, **`MHRHeader`**, **`RegisterMHR`**, **`mhr_override`**). SOAP/XML namespaces, element names, and operation names stay the published B2B wire contract (`http://ns.electronichealth.net.au/pcehr/...`, **`PCEHRHeader`**, **`registerPCEHR`**).

## Local Development

This repository builds **`17.0.0-SNAPSHOT`**. The default lifecycle compiles committed types only.

```text
mvn -B "-Dgpg.skip=true" clean install
```

Consumers that declare **`au.gov.nehta:mhr-wsdl`** at **`${project.version}`** need that install, or a Central GA, before their **`verify`**.

## What Is In The JAR

| Content | Location in repo |
| ------- | ---------------- |
| MHR B2B WSDL (classpath) | `src/main/resources/wsdl/B2B_*.wsdl` |
| WSDL/XSD reference tree | `src/main/java/wsdls/` |
| Generated stubs (Jakarta) | `src/main/java/` (excluding `wsdls/`) |
| Date adapter | `src/main/java/au/gov/nehta/schema/DateAdapter.java` |
| xmldsig override types | `src/main/java/mhr_override/org/w3/` |

The published JAR includes **22** WSDL files under **`/wsdl/`**: 12 service WSDLs plus 10 interface-only **`B2B_*Interface.wsdl`** files. Integrators load them from the classpath, for example **`ClassLoader.getResource("wsdl/B2B_MHRProfile.wsdl")`**, or pass an explicit **`URL`** to generated **`Service`** constructors.

Generated **`Service`** stubs cover 12 primary MHR B2B operations: document registry/repository; get audit, change-history, individual-details, representative-list, and view; get/search template; MHR profile; register MHR; remove document. That set is the full vendor B2B contract used by **mhr-b2b-client** / **mhr-b2b-client-dotnet** (15 logical facades, **getView** + **7** clinical views). Offline tests lock PortType wire operations and view request types.

## Building From Source

Prerequisites: **JDK 17+**, **Maven 3.6+**. All JAX-WS/JAXB types are committed in **`src/main/java`**; the build compiles them only.

```text
mvn -B "-Dgpg.skip=true" clean verify
```

See **`CONTRIBUTING.md`** for **`mvn install`** when testing unpublished snapshots locally.

## Related Repositories

| Repository | Role |
| ---------- | ---- |
| [mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java) | MHR facade clients (depends on this artifact) |
| [hi-wsdl-java](https://github.com/AuDigitalHealth/hi-wsdl-java) | HI WSDL/types (separate domain) |

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
