# 🚀 API Automation Framework (Rest Assured)

This repository contains a **robust and scalable API Automation Framework** built using **Rest Assured**, **TestNG**, **Maven**, **Log4j2**, and **Extent Reports**. The framework is designed for maintainability, readability, and reusability.

---

## 📘 **Overview**

This framework automates REST API testing using modular components:

* **Endpoints Layer** – All API endpoints
* **Payload Layer** – Request bodies (POJO classes)
* **Test Layer** – Test scripts using TestNG
* **Utilities Layer** – Common helper utilities, Excel readers, data providers
* **Reports** – HTML Extent Reports
* **Logging** – Log4j2 centralized logs

---

## ✨ **Key Features**

* ✔ Rest Assured-based API automation
* ✔ Modular and scalable folder structure
* ✔ Detailed **Extent Reports**
* ✔ Configurable **Log4j2 logging**
* ✔ TestNG with parallel execution support
* ✔ Data-driven testing (Excel, JSON)
* ✔ CI-ready with GitHub → Jenkins integration

---

## 📂 **Folder Structure**

```
API-Automation-Framework/
│
├── Reports/                     # Extent report HTML files
├── TestData/                    # External test data (JSON/Excel)
├── logs/                        # Log4j2 logs
│
├── src/test/java/API/
│   ├── Endpoints/               # Endpoint classes
│   ├── Payloads/                # POJO payload models
│   ├── Test/                    # Test classes
│   ├── Utilities/               # Helpers (DataProviders, Excel Utility, Reports)
│
├── src/test/resources/
│   └── log4j2.xml               # Log4j2 configuration
│
├── pom.xml                      # Maven dependencies
├── testng.xml                   # TestNG suite configuration
└── README.md                    # Project documentation
```

---

## 📸 **Rest Assured Framework Design**

Below is the architecture diagram representing the framework:

<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/d8611f16-7efc-4df1-8abd-b9decbb5d7e2" />


---

## 🧪 **Tools & Technologies Used**

* **Java**
* **Rest Assured**
* **TestNG**
* **Maven**
* **Extent Reports**
* **Log4j2**
* **Git / GitHub**
* **Jenkins (CI/CD)**

---

## ▶️ **How to Run Tests**

### **Using Maven**

```
mvn clean test
```

### **Using TestNG**

Run via `testng.xml` file.

---

## 📊 **Reports & Logs**

After execution:

* HTML report → `/Reports/`
* Logs → `/logs/`

---

## 👨‍💻 **Author**

**Arpit Choubey** — SDET | QA | Automation Engineer
🔗 **LinkedIn** | **Medium**

---

## ⭐ **Support**

If this repository helped you, please **Star ⭐ the repo**!

