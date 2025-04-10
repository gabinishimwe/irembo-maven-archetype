# Irembo Maven Archetype

This project is a custom Maven archetype for quickly bootstrapping new Spring Boot projects with Irembo's default conventions and structure.

---

## 📘 Full Setup Guide (Notion)

📄 A complete guide for installation, usage, and customization is available on Notion:  
👉 [View the Installation Guide on Notion](https://www.notion.so/irembo/Irembo-Maven-Archetype-1d14e31d0fcf80e98bf0e4c15459f746?pvs=4)

---

## 🚀 Features

- Spring Boot 3.4.4
- Java 17
- Optional Spring Web, JPA, Lombok, Testcontainers support (via Velocity conditions)
- Preconfigured plugins: JaCoCo, Spotless, Swagger OpenAPI, JUnit 5, Mockito

---

## 📦 Installation

To install the archetype locally (make it available in your local Maven cache):

```bash
git clone https://github.com/your-org/irembo-archetype.git
cd irembo-archetype
mvn clean install -Darchetype.test.skip=true
```
---
## ⚙️ Generate Project
```bash
mvn archetype:generate \
  -DarchetypeGroupId=com.irembo.project \
  -DarchetypeArtifactId=irembo-archetype \
  -DarchetypeVersion=1.0-SNAPSHOT \
  -DgroupId=com.mycompany.app \
  -DartifactId=my-service \
  -Dversion=0.0.1-SNAPSHOT \
  -Dwith-spring-web=true \
  -Dwith-spring-jpa=true \
  -Dwith-lombok=true \
  -Dwith-testcontainers=false \
  -DinteractiveMode=false
