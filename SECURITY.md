# Security

## If you integrate this library

**`mhr-wsdl`** provides WSDL resources and generated types. Do **not** embed mutual-TLS private keys, keystore passwords, or production MHR endpoint URLs in **your** application's source control.

## Reporting issues

Report security-sensitive findings through your organisation's usual channel for **ADHA / AuDigitalHealth** repositories (do not open a public issue with exploit details before it is triaged).

## This repository

- **Do not commit secrets to git.** That includes passwords, API tokens, private keys, real mutual-TLS keystores, production or staging MHR endpoint URLs with embedded credentials, and vendor registration material - even inside comments, test fixtures, or tracked documentation.
- **`local.properties`** is gitignored. Never commit real MHR credentials or keystores.
- **`settings.xml`** at the repository root is gitignored when it contains release credentials; do not commit populated copies. Use **`settings.xml.example`** as the template (server id **`central`**).
- **B2B WSDL and XSD** under **`src/main/resources/wsdl/`** and **`src/main/java/wsdls/`** are part of this open-source MHR types artifact (not separately licensed like **HI** WSDL). Confirm redistribution terms with ADHA before mirroring to a public fork.
- Generated Java under **`src/main/java/`** is safe to commit; it contains no credentials.
- In property files, prefer **forward slashes** in filesystem paths so the same values work on **Windows**, **macOS**, and **Linux**.
