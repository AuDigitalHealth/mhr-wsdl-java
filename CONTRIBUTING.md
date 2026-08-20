# Contributing

**Audience:** developers building or changing **this repository**. Integrators should use **README.md** and Maven Central coordinates. See **SECURITY.md** before committing.

## Prerequisites

- **JDK 8+** with **`JAVA_HOME`** set (see **`maven.compiler.release`** in **`pom.xml`**).
- **Maven 3.6+** on **`PATH`**.

Dependencies resolve from **[Maven Central](https://central.sonatype.com/)** unless you are installing a **local SNAPSHOT** (below). This POM has no sibling Maven modules.

## Versioning

The **first number** of **`au.gov.nehta:mhr-wsdl`** is the **Java SE** version that this types JAR targets. **8.0.0.1** is **`javax`** with **12** `Service` stubs; **11.0.0.1** and later are **Jakarta** with **12** stubs. See **`README.md`**.

Consumers that pin **`mhr-wsdl`** to **`${project.version}`** (including **`mhr-b2b-client`**) must use the **same** version as this **`pom.xml`**.

## Build

From the project root:

```text
mvn -B "-Dgpg.skip=true" clean verify
```

This line (**`8.0.0.1`**) compiles **committed** types - it does **not** run **`wsimport`**.

| Goal | Command |
| ---- | ------- |
| Compile + attach sources/Javadoc | `mvn -B "-Dgpg.skip=true" clean verify` |
| Skip tests | `mvn -B "-Dgpg.skip=true" clean verify "-DskipTests=true"` |
| Install SNAPSHOT to the local Maven repository | `mvn -B "-Dgpg.skip=true" clean install` |

GPG signing is skipped by default (**`-Dgpg.skip=true`**). Release builds: **`-Dgpg.skip=false`**.

## Dependencies

- Compile: **`javax.xml.bind:jaxb-api` 2.3.1**, **`javax.xml.ws:jaxws-api` 2.3.1**, and **`javax.jws:javax.jws-api` 1.1**.
- Runtime SOAP stack: **`com.sun.xml.ws:jaxws-rt`** **2.3.7** in **consuming** applications (this JAR does not ship it).
- **`maven-enforcer-plugin`** rejects Metro **`webservices-*`** and **`jakarta.*`** XML API coordinates on the classpath.

## Local builds (unpublished artifacts)

**`mvn install`** here is enough for any unpublished consumer of **`au.gov.nehta:mhr-wsdl`** at **`${project.version}`**. Integrators using GA versions from Maven Central do not need a source checkout.

Maintainer notes: **MAINTAINERS.md**.

## Regenerating sources

Generated Java under **`src/main/java`** (outside **`wsdls/`**) is **committed**. The root **`pom.xml`** does **not** run **`wsimport`**.

To refresh types after a WSDL change on this line:

1. Regenerate from the WSDL/XSD in **this** repository (**`src/main/resources/wsdl/`**, **`src/main/java/wsdls/`**) using **`wsimport`** on Java **8** / **`javax`**.
2. Preserve public API: same class names, packages, and **`mhr_override`** xmldsig layout.
3. Fix known JAXB Javadoc issues (for example replace **`{@link byte[]}`** with **`{@code byte[]}`** in **`mhr_override/`**).
4. Run **`mvn -B "-Dgpg.skip=true" clean verify`** and update **CHANGELOG.md**.

Type regeneration for new MHR releases on **Jakarta** lines is on **11.0.0.1** and later.

## Repository hygiene

- **Do not commit** keystores, production MHR URLs, populated **`settings.xml`** with release credentials, or **`local.properties`** with secrets. See **SECURITY.md**.
- **`8.0.0.1`:** generated Java under **`src/main/java`** is frozen - this POM has no **`wsimport`** / XJC profile.
- **Line endings:** the repository uses **LF** (see **`.gitattributes`**). On **Windows**, run **`git config core.autocrlf false`** in your clone before committing.
