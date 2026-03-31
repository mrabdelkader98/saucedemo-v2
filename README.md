# SauceDemo Hybrid Automation Framework

This project is a comprehensive automation suite for SauceDemo, designed to demonstrate a real-world testing approach integrating UI, API, and Database layers.

## Project Core
* **UI:** Selenium WebDriver + TestNG (Data-Driven).
* **API:** Rest-Assured for backend validation.
* **DB:** JDBC for SQL data integrity checks.
* **Reports:** Extent Reports for clear execution tracking.

## Real-World Challenges I Handled:
During development, I focused on solving common automation "bottlenecks" rather than just writing scripts:
* **Security Popups:** Resolved the Chrome "Password Breach" notification that usually interrupts test execution using custom `ChromeOptions`.
* **Session Management:** Forced **Incognito Mode** to ensure every test starts with a clean slate, preventing cache-related failures.
* **Data Flexibility:** Used `@DataProvider` to run the same test against multiple user profiles (standard, locked, problem users) without duplicating code.
* **API/DB Layer:** Added a backend validation layer because UI testing alone isn't enough for full confidence in a system.

## Quick Start
1. Clone: `git clone https://github.com/mrabdelkader98/saucedemo-v2.git`
2. Run `testng.xml` from IntelliJ.
3. Check `target/ExtentReport.html` for results.

---
**Mohamed Refaat Hassan** *Software QA Tester | ISTQB Certified*
