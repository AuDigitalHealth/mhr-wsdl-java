# Change Log/Revision History

= 11.0.0 =
=======
- Maven **`au.gov.nehta:mhr-wsdl`** **11.0.0** (Java **11** / **Jakarta**, **12** `Service` stubs). The first number of the Maven version is the targeted Java SE version. Consumers that pin **`mhr-wsdl`** to **`${project.version}`** use the same coordinate.
- Java packages and types use **`mhr`** names (`ns.mhr`, **`MHRHeader`**, **`RegisterMHRService`**). SOAP namespaces and element names remain the B2B **`pcehr`** wire contract.
- Compile: **`jakarta.xml.bind:jakarta.xml.bind-api` 4.0.5** and **`jakarta.xml.ws:jakarta.xml.ws-api` 4.0.3**. Tests use **`com.sun.xml.ws:jaxws-rt` 4.0.5**. **`maven-enforcer-plugin`** bans Metro **`webservices-*`** and legacy **`javax`** JAX-WS/JAXB APIs.
- POM: Sonatype Central Portal (**`central-publishing-maven-plugin`**; server id **`central`**).
- Offline unit tests: **`JakartaStackTest`**, **`MhrWsdlArtifactTest`**, **`GeneratedWsdlBindingsTest`**, **`WsdlStubContractTest`** under **`src/test/java/au/gov/nehta/mhrwsdl/`**. **`MhrWsdlArtifactTest`** also locks interface WSDLs, PortType wire ops, and the **7** getView request types against the **mhr-b2b-client-dotnet** B2B set.
- Documentation: README, CONTRIBUTING, MAINTAINERS, SECURITY.

= 1.1.1 =
=========
- Added WSDL folder and files to resources to ensure they appear in JAR.

= 1.1.0 =
=========
- Converted to Maven build to allow deployment to Maven repository.

= 1.0.0 =
=========
- Initial version.

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 - see **LICENSE.txt**.
