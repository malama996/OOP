💳 BankAccount OOP Lab – Java + JUnit 5
📌 Overview

This lab focuses on applying Object-Oriented Programming (OOP) principles in Java by building a BankAccount class from scratch, creating objects from it, and verifying functionality using JUnit 5 unit tests.

Rather than just learning theory, this project emphasizes practical implementation, clean code structure, and professional Git workflow.

By the end of this lab, you will have written production-style Java code, tested it using automated unit tests, and committed your work to GitHub.

🎯 Learning Objectives

By completing this lab, you will be able to:

✔ Write a Java class with instance variables and methods

✔ Create objects using the new keyword

✔ Use the dot (.) operator to access variables and call methods

✔ Understand that each object maintains independent state

✔ Write unit tests using JUnit 5

✔ Apply the Arrange–Act–Assert testing pattern

✔ Run tests in VS Code and interpret pass/fail results

✔ Commit structured, meaningful work to GitHub

🧠 Key Concepts Covered
1️⃣ Classes & Objects

The BankAccount class defines the structure and behaviour of a bank account.

Each object created from this class:

Holds its own balance

Operates independently

Encapsulates its state

2️⃣ Methods & Behaviour

Core methods implemented include:

deposit(double amount)

withdraw(double amount)

getBalance()

applyInterest(double rate)

Each method modifies or retrieves the object's internal state.

3️⃣ Unit Testing with JUnit 5

Automated tests ensure correctness and reliability.

Tests follow the Arrange – Act – Assert pattern:

// Arrange
BankAccount account = new BankAccount(1000);

// Act
account.deposit(500);

// Assert
assertEquals(1500, account.getBalance());

This guarantees predictable and verifiable behaviour.

🗂 Project Structure
week2_lab/
│
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── BankAccount.java
│   │       └── Main.java
│   │
│   └── test/
│       └── java/
│           └── BankAccountTest.java

main → Application code

test → Unit tests

pom.xml → Maven configuration

🚀 How to Run the Project
🔹 Compile & Run

Using Maven:

mvn compile
mvn exec:java
🔹 Run Tests
mvn test

Or run tests directly inside VS Code using the testing panel.

🧪 Example Test Case
@Test
void testApplyInterest() {
    BankAccount account = new BankAccount(1000);
    account.applyInterest(0.05);
    assertEquals(1050, account.getBalance());
}

This confirms that 5% interest is applied correctly.

🛠 Technologies Used

☕ Java

🧪 JUnit 5

📦 Maven

💻 VS Code

🌐 Git & GitHub

📈 Why This Lab Matters

This project bridges theory and real-world development by combining:

Clean OOP design

Automated testing

Professional project structure

Version control with Git

These are foundational skills required in real software engineering environments.

📌 Author

Arnold Malama
OOP Lab – Week 2
Classes, Objects & Your First Unit Test
