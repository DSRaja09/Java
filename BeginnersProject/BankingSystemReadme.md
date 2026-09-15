# Simple Java Banking System
## 📌 Project Overview
The **Simple Java Banking System** is a console-based application designed to simulate basic banking operations using Object-Oriented Programming (OOP) concepts. It allows the creation of Savings and Current accounts, tracks balances via an in-memory HashMap database, and facilitates deposits, withdrawals, and account-to-account transfers.
## 🚀 Features
- **Account Management**: Supports two types of accounts: `SavingAccount` and `CurrentAccount`.
- **In-Memory Database**: Uses a static `HashMap` approach to store and update account balances mapped by Account IDs independently.
- **Deposit & Withdraw**: Allows users to securely add funds or withdraw funds (with balance limit checks).
- **Inter-Account Transfers**: 
  - Transfer money seamlessly from Savings to Current and vice versa.
  - Implements a transfer limit rule (e.g., maximum 30% of savings can be transferred at a time).
- **Exception Handling**: Prevents invalid transactions like overdrafts or transferring to non-existent accounts by throwing custom Exceptions.
## 🛠️ Technologies Used
- **Language**: Java
- **Data Structures**: `HashMap` (for rapid O(1) balance lookups and updates)
- **Concepts**: Object-Oriented Programming (Inheritance, Abstraction, Encapsulation), Exception Handling.
## ⚙️ How to Run
1. Ensure you have the Java Development Kit (JDK) installed on your system.
2. Compile the code using the command line:
   ```bash
   javac BankingSystem.java
   ```
3. Run the compiled application:
   ```bash
   java BankingSystem
   ```
