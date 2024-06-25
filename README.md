# OpenCart Test Automation 

This repository contains an automation testing project written in **Java** using **Selenium WebDriver** and **TestNG** to test the [OpenCart]([https://katalon-demo-cura.herokuapp.com/](https://awesomeqa.com/ui/index.php?route=account/logout)), an eCommerce website.

Project Structure<br>
The project is structured as follows:

```

|-- TestSuite
|-- src
|   |-- main
|   |   |-- java
|   |   |   |-- resources
|   |   |   |-- pagesobjects
|               |-- CheckoutPage.java
|               |-- HeaderPage.java
|               |-- ...
|   |   |   |-- resources
|   |
|   |-- test
|       |-- java
|           |-- Test
|               |-- OrderItemsTest.java
|               |-- RegisterTest.java
|           |-- TestComponents
|               |-- BaseTest.java
|-- .classpath
|-- .project
|-- README.md
|-- pom.xml

```

<br><br>
## Prerequisites
To run the automation tests in this project, you'll need to have the following software installed on your machine:

- Java Development Kit (JDK)  version used: Java 21
- Apache Maven
- Selenium WebDriver
- TestNG
