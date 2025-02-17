
---
# BDD Automation Framework (Selenium + Java + Cucumber)  

## 📌 Overview  
This is a **Selenium BDD framework** using **Java**, **Cucumber**, and **JUnit** for test automation. The framework follows **Page Object Model (POM)** and integrates reporting tools like **Extent Reports**.  

## ⚙️ **Setup & Installation**  

### **Prerequisites**  
- **Java 1.8+**  
- **Maven** installed  
- **IDE** (Eclipse/IntelliJ)  
- **Selenium WebDriver**  
- **Cucumber Plugin for IDE**  

### **Steps to Set Up the Project**  
1. Clone the repository:  
   git clone https://github.com/YogiSDET/bdd/

Open the project in Eclipse/IntelliJ.
Run the following command to install dependencies:
mvn clean install
Set up browser drivers in BaseClass.
Run the tests via TestRunner.java or Maven.
🚀 Running Tests

1️⃣ Using Maven Command
mvn test

2️⃣ Running Specific Feature File
Modify TestRunner to run the required feature file:

@CucumberOptions(features = "src/test/resources/Feature/Login.feature")
3️⃣ Running Tests with Tags

mvn test -Dcucumber.filter.tags="@SmokeTest"
📊 Reports & Logging
📌 Extent Reports
Reports are generated in the test-output folder.
Open index.html inside test-output to view detailed reports.
📌 Log4j Logging
Logs are stored in the log folder for debugging purposes.
🛠 Key Features
✅ BDD with Cucumber (Gherkin syntax)
✅ Selenium WebDriver for UI Testing
✅ Page Object Model (POM) Design
✅ Cucumber Hooks for Pre/Post Actions
✅ Maven for Dependency Management
✅ Extent Reports for Detailed Reporting
✅ Log4j for Logging


