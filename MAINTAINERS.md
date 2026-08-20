# Maintainer notes

**Audience:** people changing the **`mhr-wsdl`** build, generated types, WSDL layout, or release process - not library integrators. Integrators should use **README.md**, published Javadoc, and **`pom.xml`** coordinates.

Paths are relative to the repository root (directory containing **`pom.xml`**). This Git repository is **`mhr-wsdl-java`**; the Maven artifact id remains **`mhr-wsdl`**.

## Versioning

The **first number** of **`<version>`** is the **Java SE** target of **this** types JAR.

| Maven version | Java SE |
| ------------- | ------- |
| **8.0.0.1** | **8** |
| **11.0.0.1** | **11** |
| **17.0.0.1** | **17** |
| **21.0.0.1** | **21** |
| **24.0.0.1** | **24** |

**Documentation convention:** README, CONTRIBUTING, CHANGELOG, and integrator-facing text use **version numbers only** - never Git branch names.

| Version | Java | XML APIs | `Service` stubs |
| ------- | ---- | -------- | --------------- |
| **8.0.0.1** | 8 | **`javax.xml.ws`**, **`javax.xml.bind`**, **`javax.jws`** | **12** (MHR B2B) |
| **11.0.0.1** | 11 | **Jakarta** XML WS / Bind | **12** (MHR B2B) |
| **17.0.0.1** | 17 | **Jakarta** XML WS / Bind | **12** (MHR B2B) |
| **21.0.0.1** | 21 | **Jakarta** XML WS / Bind | **12** (MHR B2B) |
| **24.0.0.1** | 24 | **Jakarta** XML WS / Bind | **12** (MHR B2B) |

**Git branch mapping (maintainers / checkout only - do not use in integrator docs):**

| Version | Official Git branch |
| ------- | ------------------- |
| **8.0.0.1** | `java-8` |
| **11.0.0.1** | `java-11` |
| **17.0.0.1** | `java-17` |
| **21.0.0.1** | `java-21` |
| **24.0.0.1** | `java-24` |

Artifact id stays **`mhr-wsdl`**; the version distinguishes the Java SE line. Downstream projects that pin **`mhr-wsdl`** to **`${project.version}`** (including **`mhr-b2b-client`**) keep the **same** version and the **same** branch names on their matching line.

On a given branch, **do not change the first number** of **`<version>`**. Next GA on **`java-8`** is **`8.0.0.2`** (then **`8.0.0.2-SNAPSHOT`**), not **`11.x`**. A new Java SE target is a **new branch**, not a bump on this one.

**This checkout (`8.0.0.1-SNAPSHOT`):** Java **8**, committed **`javax`** generated types, **12** primary MHR B2B **`@WebServiceClient`** services (no **`wsimport`** / XJC in this POM). Stack and **`.github/workflows/ci.yml`** (branch **`java-8`**, JDK **8**) below apply to **this line only**. Other branches keep their own **`pom.xml`**, CI branch filter, and JDK. Type regeneration for new MHR releases is on **11.0.0.1** and later lines.

## Artifact

- **`au.gov.nehta:mhr-wsdl`** - MHR B2B WSDL on the classpath + pre-generated JAX-WS/JAXB types.
- **Not included:** facade clients, TLS/signing, or custom runtime WSDL resolution (**[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)**).

## Layout

| Path | Role |
| ---- | ---- |
| `src/main/resources/wsdl/` | **`B2B_*.wsdl`** packaged under **`/wsdl/`** in the JAR |
| `src/main/java/wsdls/` | WSDL/XSD reference tree (**`wsdls/wsdl/External/`**, **`wsdls/schema/`**) |
| `src/main/java/` | Committed generated types + **`au.gov.nehta.schema.DateAdapter`** |
| `src/main/java/mhr_override/` | xmldsig types (override package) |
| `scripts/fix-javadoc.py` | Repair wsimport Javadoc after regeneration |

## Release scope (`8.0.0.1`)

- **Goal:** Java **8** bytecode (`maven.compiler.release` **8**) with **`javax`** generated types; **12** MHR B2B **`Service`** stubs.
- The default lifecycle does **not** run **`wsimport`**. **`src/main/java`** and **`mhr_override/`** are committed as-is.

## Contributors vs release publisher (`pom.xml`)

**Contributors (PRs, ordinary commits):** Do not change **`<version>`** (stay on **`-SNAPSHOT`** unless the maintainer requests a bump), **`<scm><tag>`**, or **`distributionManagement`**. If a maintainer requests a SNAPSHOT bump on this branch, change only the trailing numbers (**`8.0.0.2-SNAPSHOT`**), never the Java SE digit. Leave **`maven-gpg-plugin`** **`skip`** **`true`** so default **`mvn verify`** does not require a signing key. Record user-visible work under **`CHANGELOG.md`** in the **`= <pom-version> =`** block that matches **`pom.xml`** **`<version>`**.

**Release publisher:** In the release change set: set **`<version>`** to the GA coordinate (no **`-SNAPSHOT`**); set **`<scm><tag>`** to the Git tag you will publish (match existing tag naming). Move **`CHANGELOG.md`** bullets from the snapshot section into a new **`= <GA-version> =`** section; add a fresh **`-SNAPSHOT`** block for the next development cycle. Deploy via Sonatype Central Portal (**`central-publishing-maven-plugin`**; copy **`settings.xml.example`** -> **`settings.xml`**, server id **`central`**). See **Release** below.

## Release

Publishing uses **`central-publishing-maven-plugin`** (Sonatype Central Portal). Copy **`settings.xml.example`** -> **`settings.xml`**, server id **`central`**.

**Parallel release lines (maintainers only):** each Git branch of **this** repository publishes a **different Maven version** of **`mhr-wsdl`**. Integrators choose by coordinate, not branch name. The first number of that version is the targeted Java SE version. Run **`release:prepare` / `release:perform`** (or manual deploy) **on that branch** (not detached HEAD).

| Branch | Java | `mhr-wsdl` | `Service` stubs |
| ------ | ---- | --------------------- | --------------- |
| **`java-8`** | 8 / javax | **8.0.0.1** | 12 |
| **`java-11`** | 11 / Jakarta | **11.0.0.1** | 12 |
| **`java-17`** | 17 / Jakarta | **17.0.0.1** | 12 |
| **`java-21`** | 21 / Jakarta | **21.0.0.1** | 12 |
| **`java-24`** | 24 / Jakarta | **24.0.0.1** | 12 |

**Order:** publish **this artifact** first. Any consumer that depends on **`mhr-wsdl`** at the same GA (including **`mhr-b2b-client`**) cannot complete **`verify`** / **`release:perform`** until this coordinate is on Central (or installed locally).

**`-DdevelopmentVersion`:** keep the same first number as **`-DreleaseVersion`** (example on this line: **`8.0.0.1`** then **`8.0.0.2-SNAPSHOT`**).

### SNAPSHOT or manual GA

1. Update **CHANGELOG.md** (and **`pom.xml`** / SCM **`<tag>`** for manual GA).
2. **`mvn -B "-Prelease" clean verify`**
3. **`mvn -B "-Prelease" deploy`**

Git/SCM settings for **`maven-release-plugin`** live in **`pom.xml`** properties (**`scm.repo.url`**, **`release.*`**). Tags default to **`{artifactId}-{version}`** (e.g. **`mhr-wsdl-8.0.0.1`**).

### Automated GA (`maven-release-plugin`)

Run on the **target branch** with a **clean** working tree. The plugin commits version bumps, creates the release tag, deploys from the tag checkout, bumps to the next **`-SNAPSHOT`**, and **pushes branch + tag** (**`pushChanges`** / **`remoteTagging`** in **`pom.xml`**). Git remote credentials (SSH or HTTPS) must work non-interactively.

```text
mvn -B "-Prelease" release:prepare release:perform -DreleaseVersion=8.0.0.1 -DdevelopmentVersion=8.0.0.2-SNAPSHOT -Dtag=mhr-wsdl-8.0.0.1
```

Replace **`-DreleaseVersion`**, **`-DdevelopmentVersion`**, and **`-Dtag`** for the branch you are on (same first number; e.g. **`mhr-wsdl-11.0.0.1`** on **`java-11`**). Omit **`-D...`** only if you accept interactive prompts.

**After success:** confirm **`mhr-wsdl`** GA on Central. Downstream artifacts that pin this coordinate can then cut their matching GA. No extra Git steps unless push failed; then from the release branch:

`git push origin java-8` (or **`java-11`**, **`java-17`**, **`java-21`**, **`java-24`**) and **`git push origin <tag>`**.

**`-Dgpg.skip=false`** is equivalent to **`-Prelease`** for signing.

## Changelog and releases

**`CHANGELOG.md`** uses **`= version =`** section headers. Match the snapshot header to **`pom.xml`** **`<version>`** until the publisher cuts GA.

## New Java SE line

When adding a line (e.g. Java **25**): create **`java-25`** in **this** repository from the nearest existing types line; set **`<version>`** first number to **25** (e.g. **`25.0.0.1-SNAPSHOT`**); set **`maven.compiler.release`**, JAX-WS / JAXB coordinates, CI **`java-version`** / branch filter, WSDL/stub inventory, and docs to that line. Do not retarget an existing branch.

Consumers that pin **`mhr-wsdl`** to **`${project.version}`** need a matching line of their own once this artifact exists.

## Build (`8.0.0.1` line)

This subsection is **this `java-8` checkout**. Other lines document their stack in their own **MAINTAINERS** / **`pom.xml`**.

- **`maven.compiler.release` 8**
- Compile deps: **`jaxb-api` 2.3.1**, **`jaxws-api` 2.3.1**, **`javax.jws-api` 1.1** - no **`jaxws-rt`** in this POM
- **`maven-enforcer-plugin`:** bans Metro **`webservices-*`** and all **`jakarta.xml.*`** / **`jakarta.jws`** API coordinates (**`javax`** compile deps only)
- Consuming applications add **`com.sun.xml.ws:jaxws-rt` 2.3.7** (Eclipse EE4J, last **2.3.x** on Central for Java **8**)
- **`maven-gpg-plugin`:** skipped unless **`-Dgpg.skip=false`**
- **`maven-javadoc-plugin`:** **`doclint=all`**, **`failOnWarnings=true`**, **`detectOfflineLinks=false`**
- Javadoc fixes after wsimport: **`python scripts/fix-javadoc.py`**
- **No source regeneration** on **`8.0.0.1`** - **`src/main/java`** and **`mhr_override/`** are committed as-is
- **`.github/workflows/ci.yml`:** GitHub Actions **`mvn verify`** on **`java-8`**, JDK **8**

## Public commit checklist

Before pushing to a **public** remote:

1. **`git status`** - no keystores, **`settings.xml`**, or **`local.properties`** staged.
2. No **`target/`** committed.
3. **`mvn -B "-Dgpg.skip=true" clean verify`** passes.
4. **CHANGELOG.md** and **`pom.xml`** version reflect the release line.

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 - see **LICENSE.txt**.
