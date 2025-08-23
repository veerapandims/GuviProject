# Contact Management Automation Framework (POM + Cucumber + TestNG)

## What is included
- Maven `pom.xml` with required dependencies (Selenium, Cucumber, TestNG, WebDriverManager, ExtentReports).
- Page Object Model skeleton under `src/main/java/pages`.
- Step Definitions, Runner, and Utils under `src/test/java`.
- Example `.feature` files under `src/test/resources/features`.
- `testng.xml` to run the Cucumber TestNG runner.

## How to use
1. Unzip the project.
2. Import as a Maven project in your IDE (IntelliJ/Eclipse).
3. Update `config.properties` in `src/test/resources` with target URL and browser.
4. Run `mvn clean test` or run `TestRunner` via TestNG.

## Notes
- This is a starter skeleton. You should add more page objects and step definitions mapped to your PDF test scenarios.
- WebDriverManager handles browser driver binaries automatically.
