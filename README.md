# SauceDemo Automation Framework 

This is a robust **Web Automation Testing Framework** built for the [SauceDemo](https://www.saucedemo.com/) website. The project demonstrates a professional approach to UI testing, focusing on scalability, clean code, and advanced reporting.

##  Tech Stack & Tools
* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Runner:** TestNG
* **Build Tool:** Maven
* **Reporting:** Extent Reports (Interactive HTML reports)
* **Design Pattern:** Data-Driven Testing (DDT)

##  Key Features & Enhancements
* **Security Bypass:** Implemented a custom fix for the Chrome "Password Breach" popup using `ChromeOptions` to ensure uninterrupted test execution.
* **Data-Driven Testing:** Utilized TestNG `@DataProvider` to test multiple user personas (standard, locked_out, problem, etc.) in a single test run.
* **Incognito Mode:** Tests run in Incognito mode to ensure a clean session for every execution.
* **Professional Reporting:** Integrated **Extent Reports** to provide detailed visual feedback, pass/fail status, and execution times.
* **Synchronization:** Implemented global implicit waits to handle dynamic element loading effectively.

##  Test Scenarios Covered
1. **Login Module:** Validating successful logins, invalid credentials, and locked-out users.
2. **E-commerce Flow:** Automating the full cycle from adding items to the cart to successful checkout and validation.

##  How to Run
1. Clone the repository:
   `git clone https://github.com/mrabdelkader98/saucedemo-v2.git`
2. Open the project in IntelliJ IDEA or any Java IDE.
3. Run the `testng.xml` file.
4. Check the `target/ExtentReport.html` for the execution results.

---
**Developed by Mohamed Refaat** *Software Quality Assurance Engineer*
