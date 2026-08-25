# Change Log/Revision History

= 8.0.0 =
=======
- Maven **`au.gov.nehta:mhr-wsdl`** **8.0.0** (Java **8** / **`javax`**, **12** `Service` stubs). The first number of the Maven version is the targeted Java SE version. Consumers that pin **`mhr-wsdl`** to **`${project.version}`** (including **`mhr-b2b-client`**) use the same coordinate.
- Java packages and types use **`mhr`** names (`ns.mhr`, **`MHRHeader`**, **`RegisterMHRService`**). SOAP namespaces and element names remain the B2B **`pcehr`** wire contract.
- Compile: **`javax.xml.bind:jaxb-api` 2.3.1**, **`javax.xml.ws:jaxws-api` 2.3.1**, **`javax.jws:javax.jws-api` 1.1**. **`maven-enforcer-plugin`** bans Metro **`webservices-*`** and **`jakarta.*`** XML APIs. Consuming apps use **`jaxws-rt` 2.3.7** at runtime.
- POM: Sonatype Central Portal (**`central-publishing-maven-plugin`**; server id **`central`**).
- Offline unit tests: **`JavaxStackTest`**, **`MhrWsdlArtifactTest`**, **`GeneratedWsdlBindingsTest`**, **`WsdlStubContractTest`** under **`src/test/java/au/gov/nehta/mhrwsdl/`**.
- Documentation: README, CONTRIBUTING, MAINTAINERS, SECURITY.

= 1.6.3 =
=========
Historical past release (superseded by **8.0.0** on this line).
- **`1.6.3`** line: Java **8** / **`javax`** committed types and classpath WSDL (**12** `Service` stubs, MHR B2B scope).
- POM: **`provided`** compile **`jaxb-api`**, **`jaxws-api`**, **`javax.jws-api`**; **`maven-enforcer-plugin`** bans Metro **`webservices-*`** and **`jakarta.*`** (consumers use EE4J **`jaxws-rt` 2.3.7**). Build plugins aligned with **hi-wsdl-java** **`1.6.3`**.
- **`maven-gpg-plugin`:** **`gpg.skip`** defaults to **`true`** for local builds.
- Offline unit tests: **`JavaxStackTest`**, **`MhrWsdlArtifactTest`**, **`GeneratedWsdlBindingsTest`** under **`src/test/java/au/gov/nehta/mhrwsdl/`**.
- Javadoc: **`doclint=all`**, **`failOnWarnings=true`**.
- Documentation: README, CONTRIBUTING, MAINTAINERS, SECURITY.

= 1.1.1 =
=========
- Added WSDL folder and files to resources to ensure they appear in JAR.

= 1.1.0 =
=========
- Converted to Maven build to allow deployment to Maven repository

= 1.0.0 =
=========
- Initial version

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 - see **LICENSE.txt**.
