Propolingo is an educational game gamified, targeting undergraduate students with propositional logic.

First, download the zip file and then extract your administrations to your current computer. The latest updated Zip file is propolinfo(6)
Technologies Used
JavaFX SDK: 20.0.0 This is used when advanced graphics or UI components are required.
Java Runtime Environment: The JRE is version 1.7.0, compatible with Java 17 code with a runtime for the JavaFX application.
Maven: 3.0 was used to handle project dependencies and build.

Development Environment
The following application was written and debugged using:

IntelliJ IDEA is the integrated development environment you can use to create Java and JavaFX-based applications. This course uses the 2024 Community Edition.

Operating Systems:
Ubuntu 20.04 system distributionErotica:
Windows 11 Home

Libraries and Dependencies
The code extended the project's capabilities by making use of the following libraries:

SQLite: This is used to connect with databases in Java and to store data.
FontAwesome: GTIN Font and Version 8-for application icons and visual assets.
Tweety Project: The project aimed to support propositional logic operations in the application.

Revision Control
GitHub: This was a version control medium that provided source code management; allowed collaboration in code development and mediated tracking of code history.

Testing
JUnit: JUnit was utilised in the development of this application to test many parts. The JUnit library has been used only for development and does not form part of the overall package.
This project includes JUnit tests for several controllers in the com.propolingo.propolinfo.controllers package. The controllers tested include:

SymbolsExerciseController
StatementsExerciseController
EquivalenceExerciseController
EntailmentExerciseController
These tests validate the functionality of user input fields and ensure that the expected answers produce the correct visual feedback.
Each controller test checks the following:

Validates correct answers by setting input fields and asserting that the background color changes to light green.
Validates incorrect answers (for StatementsExerciseController) by setting input fields and asserting that the background color changes to light coral.

The tests are built using JUnit 5
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.8.1</version>
    <scope>test</scope>
</dependency>
You can run the tests using your IDE's built-in testing tools or from the command line.
mvn test


Getting Started
To clone and run the application on your local machine:

Install Java 17 or later, JavaFX SDK 20.0.0 and Maven 3.0.
Clone the repository from GitHub:
bash Copy code git clone https://github.com/Baleni-BG/Propolingo.git
Import project in IntelliJ IDEA. Build and execute the application by using Maven.
