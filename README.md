# 🚀 REST API Automation Framework | Java | REST Assured | TestNG | Maven | Extent Reports | Log4j2

<p align="center">

![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge&logo=openjdk)
![REST API](https://img.shields.io/badge/REST%20API-Automation-success?style=for-the-badge)
![TestNG](https://img.shields.io/badge/TestNG-Framework-red?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge&logo=apachemaven)
![Extent Reports](https://img.shields.io/badge/Extent-Reports-purple?style=for-the-badge)
![Log4j2](https://img.shields.io/badge/Log4j2-Logging-orange?style=for-the-badge)
![GitHub](https://img.shields.io/badge/Open-Source-black?style=for-the-badge&logo=github)
![Java](https://img.shields.io/badge/Java-REST%20Assured-red?style=for-the-badge&logo=openjdk)

</p>

---

# 📌 Project Overview

Modern software applications rely heavily on REST APIs for communication between services. Ensuring these APIs are reliable, secure, and performant is a critical responsibility for QA Automation Engineers and SDETs.

This repository demonstrates a **production-ready REST API Automation Framework** built using **Java, REST Assured, TestNG, Maven, Log4j2, and Extent Reports**. The framework follows modular design principles to support scalable, maintainable, and reusable automated API testing.

It is designed to reflect the architecture and coding practices commonly used in enterprise software projects.

---

# 🎯 Project Objectives

The primary goals of this framework are to:

- Automate REST API testing efficiently
- Improve test maintainability through modular architecture
- Enable reusable request payloads and endpoint management
- Support data-driven testing
- Generate detailed execution reports
- Capture centralized logs for easier debugging
- Provide a CI/CD-ready framework for enterprise environments

---

# 🚀 Framework Highlights

✔ REST Assured based API automation

✔ Modular project architecture

✔ Page Object–like Endpoint Layer

✔ POJO-based Request Payload Models

✔ TestNG Test Execution

✔ Data-Driven Testing

✔ Excel & JSON Test Data

✔ Extent HTML Reports

✔ Log4j2 Logging

✔ Maven Build Management

✔ Parallel Test Execution

✔ CI/CD Ready (Jenkins / GitHub Actions)

✔ Easily Extendable for Large Projects

---

# 🏗 Framework Architecture

The framework follows a layered architecture to improve scalability and code maintainability.

```
                Test Classes
                      │
                      ▼
               Endpoint Layer
                      │
                      ▼
              Request Payloads
                      │
                      ▼
               REST Assured APIs
                      │
                      ▼
              Response Validation
                      │
        ┌─────────────┴──────────────┐
        ▼                            ▼
   Extent Reports               Log4j2 Logs
```

---

# 📸 Framework Structure

> Enterprise-style REST Assured Automation Framework

*(Insert your framework architecture image here)*

---

# 📂 Project Structure

```text
REST-API-Automation-Framework
│
├── Reports
│     └── Extent HTML Reports
│
├── TestData
│     ├── JSON Files
│     ├── Excel Files
│
├── logs
│     └── Log4j2 Execution Logs
│
├── src
│
│   └── test
│
│       ├── java
│       │
│       ├── API
│       │
│       │     ├── Endpoints
│       │     ├── Payloads
│       │     ├── Test
│       │     └── Utilities
│       │
│       └── resources
│
│             └── log4j2.xml
│
├── test-output
│
├── pom.xml
├── testng.xml
└── README.md
```

---

# ⚙ Technology Stack

| Category | Technology |
|-----------|------------|
| Language | Java |
| API Automation | REST Assured |
| Test Framework | TestNG |
| Build Tool | Maven |
| Reporting | Extent Reports |
| Logging | Log4j2 |
| Version Control | Git |
| Repository | GitHub |
| CI/CD | Jenkins / GitHub Actions |

---

# ✨ Framework Components

## 🔹 Endpoint Layer

Contains all REST API endpoint definitions.

Benefits:

- Centralized API management
- Easy maintenance
- Better readability

---

## 🔹 Payload Layer

POJO classes representing request payloads.

Benefits:

- Cleaner code
- Reusable request models
- Easier serialization

---

## 🔹 Test Layer

Contains TestNG test cases responsible for:

- Sending requests
- Validating responses
- Assertions
- Business validations

---

## 🔹 Utilities Layer

Reusable helper classes including:

- Excel Reader
- JSON Utilities
- Data Providers
- Report Generation
- Common Methods

---

## 🔹 Reporting

Extent Reports provide:

- Execution Summary
- Passed Tests
- Failed Tests
- Screenshots (if integrated)
- Execution Time
- Environment Details

---

## 🔹 Logging

Log4j2 enables:

- Detailed execution logs
- Exception tracking
- Debug information
- API request/response logging

---

# 📊 Skills Demonstrated

This project showcases practical experience with:

- REST API Testing
- REST Assured
- API Request Validation
- API Response Validation
- JSON Parsing
- POJO Serialization
- TestNG
- Maven
- Extent Reports
- Log4j2
- Data-Driven Testing
- Framework Design
- Java Programming
- Enterprise Automation Frameworks

---

# 🧪 API Testing Capabilities

The framework supports validation of:

- HTTP Status Codes

- Response Body

- Response Headers

- JSON Path Assertions

- Authentication

- CRUD Operations

- Request Payload Validation

- Query Parameters

- Path Parameters

- Data-Driven API Testing

- API Regression Testing

---

# 🚀 How to Execute

## Clone Repository

```bash
git clone https://github.com/ArpitChoubey/REST-API-Automation-Framework-JAVA-Rest-Assured.git
```

---

## Install Dependencies

```bash
mvn clean install
```

---

## Execute Tests

Using Maven

```bash
mvn clean test
```

Or execute using

```
testng.xml
```

---

# 📈 Reports Generated

After execution:

```
Reports/
```

Contains

- Extent HTML Report

---

Execution Logs

```
logs/
```

Contains

- Log4j2 Logs

---

# 🌍 Enterprise Applications

This framework can be extended to automate APIs for:

- Banking Applications

- Healthcare Platforms

- Insurance Systems

- Retail & E-Commerce

- Telecom Applications

- CRM Platforms

- ERP Systems

- Microservices Architecture

- Cloud-native Applications

---

# 🎯 Ideal For

This project is valuable for:

- QA Engineers

- API Automation Engineers

- Software Development Engineers in Test (SDETs)

- Automation Test Engineers

- Java Developers

- Manual Testers transitioning to Automation

- Students preparing for Automation Interviews

---

# 💼 Why Recruiters & Hiring Managers Should Review This Repository

This project demonstrates:

✅ Strong Java Programming

✅ REST API Automation

✅ Enterprise Framework Design

✅ Scalable Architecture

✅ Clean Code Principles

✅ Reporting & Logging

✅ Data-Driven Testing

✅ CI/CD Readiness

✅ Industry Best Practices

These are essential capabilities expected from experienced QA Automation Engineers and SDETs working on enterprise-grade software products.

---

# 🚀 Future Enhancements

Planned improvements include:

- OAuth 2.0 Authentication

- JWT Token Handling

- API Schema Validation

- Docker Integration

- GitHub Actions Pipeline

- Jenkins Pipeline

- Allure Reporting

- Parallel API Execution

- Environment Configuration

- API Mocking

- Contract Testing

- Performance Testing Integration

---

# 👨‍💻 About the Author

## Arpit Choubey

**SDET | QA Automation Engineer | Java | REST Assured | Selenium | Playwright | Appium | TestNG | Maven | SQL | Jenkins | Docker**

Passionate about designing scalable automation frameworks, improving software quality, and sharing practical learning resources with the automation testing community.

---

# 🌐 Connect With Me

### GitHub

https://github.com/ArpitChoubey

### LinkedIn

https://www.linkedin.com/in/arpitchoubey/

### Medium

https://medium.com/@ArpitChoubey9

---

# ⭐ Support

If you found this repository useful, please consider giving it a **Star ⭐**.

Your support motivates me to continue building enterprise-grade automation frameworks and open-source learning resources for the QA community.

---

## 💡 *"Quality APIs power modern software. Great automation frameworks ensure they remain reliable, scalable, and production-ready."*

