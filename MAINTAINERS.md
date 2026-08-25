# Maintainers

**Audience:** people changing the **`mhr-wsdl`** build, generated types, WSDL layout, or release process. Integrators should use **`README.md`**, published Javadoc, and **`pom.xml`** coordinates.

Paths are relative to the repository root. The Maven artifact id is **`mhr-wsdl`**.

## Release Lines

| Version | Java | XML stack | `Service` stubs |
| ------- | ---- | --------- | --------------- |
| **8.0.0** | 8 | `javax.xml.ws`, `javax.xml.bind`, `javax.jws` | 12 |
| **11.0.0** | 11 | Jakarta XML Web Services | 12 |
| **17.0.0** | 17 | Jakarta XML Web Services | 12 |
| **21.0.0** | 21 | Jakarta XML Web Services | 12 |
| **24.0.0** | 24 | Jakarta XML Web Services | 12 |

**Git branch mapping (maintainers only):**

| Version | Official Git branch |
| ------- | ------------------- |
| **8.0.0** | `java-8` |
| **11.0.0** | `java-11` |
| **17.0.0** | `java-17` |
| **21.0.0** | `java-21` |
| **24.0.0** | `java-24` |

## This Line

**`11.0.0-SNAPSHOT`**: Java **11**, Jakarta generated types, and 12 primary MHR B2B **`@WebServiceClient`** services. The default lifecycle compiles committed sources and packages classpath WSDL.

## Artifact Scope

| Artifact | Purpose |
| -------- | ------- |
| `au.gov.nehta:mhr-wsdl` | MHR B2B WSDL on the classpath plus pre-generated JAX-WS/JAXB types |
| `au.gov.nehta:mhr-b2b-client` | Facade clients, TLS, signing, and higher-level request builders |

Publish **`mhr-wsdl`** first. Any consumer that depends on **`mhr-wsdl`** at the same GA cannot complete **`verify`** until this coordinate is on Central or installed locally.

## Build Stack

- JDK **11+**
- Compile APIs: **`jakarta.xml.bind-api` 4.0.5**, **`jakarta.xml.ws-api` 4.0.3**
- Test runtime: **`com.sun.xml.ws:jaxws-rt` 4.0.5**
- Enforcer bans legacy Metro **`webservices-*`** and legacy **`javax`** JAX-WS/JAXB API dependencies
- CI branch filter: **`java-11`**, JDK **11**

## Release Command

```text
mvn -B "-Prelease" release:prepare release:perform -DreleaseVersion=11.0.0 -DdevelopmentVersion=11.0.1-SNAPSHOT -Dtag=mhr-wsdl-11.0.0
```

Omit **`-D...`** only if you accept interactive prompts.
