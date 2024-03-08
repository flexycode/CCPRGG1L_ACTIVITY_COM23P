# 💫 CCPRGG1L_FINALPROJECT_COM23P
CCPRGG1L-COMP23P Group Project for 1st semester final exam project
    
### Group Name: [Artificial Ledger](https://www.youtube.com/watch?v=dQw4w9WgXcQ)  🇵🇭
### Name: [Jay Arre Talosig](https://github.com/flexycode) 
### Subject & Section: 🧚‍♂️ [CCPRGG1L COM23P](https://www.youtube.com/watch?v=dQw4w9WgXcQ) 🧚‍♀️  
### Professor: 👦 Jay D. Abaleta          

# 📊 Table of Contents

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)


## [Introduction](#introduction)
This repository contains source code for a Java project that focuses on fundamental concepts and exercises. The code includes examples of input/output operations, arithmetic calculations, and basic Java syntax.
 
###### ⚡ Course Outline: https://nationalueduph.sharepoint.com/:w:/r/sites/FundamentalsofProgramming-CCPRGG1LCOM23P/_layouts/15/Doc2.aspx?action=edit&sourcedoc=%7B5e6c8bed-44a9-4add-a947-3c727bf33daa%7D&wdOrigin=TEAMS-MAGLEV.teamsSdk_ns.rwc&wdExp=TEAMS-TREATMENT&wdhostclicktime=1707804185955&web=1 

###### ⚡ Repository Source: https://github.com/flexycode/CCPRGG1L_FUNDAMENTALS_COM23P
###### ⚡ Object-Oriented Source Code: https://https://github.com/flexycode/BankingSystem
  
### CCPRGG1L Table lecture

| Topic                                                                  | Description                                                      |
| :--------------------------------------------------------------------- | :--------------------------------------------------------------- |
| Part 1 - Introduce Basic Programming                                    | Introduction to Basic programming Variables and Type             |
| Part 2 - Java Programming                                               | Problem-solving phases                                           |
| Part 3a - Understand the basic concepts of Object-Oriented Programming (OOP) | Compare Procedural and OOP                                |
| Part 3b - Learn how to declare and use classes and objects in Java      | Introduction to objects and classes                              |
| Part 4 - Learn how to implement user-defined methods                    | Primitive types and String Class, Basic Operators (Arithmetic, Relational, and Logical) |
| Part 5 - Identify the types of variables and its scope                  | Class Methods, Variables Scoping                                 |
| Part 6 - Sequential, conditional, and iteration structure               | Sequential Structure                                             |
| Part 7 - Learn the difference between sequential, conditional, and iteration structure | Conditional Structure                                |
| Part 8 - Learn how to use various conditional structures                | Sequential vs Conditional Structure                              |
| Part 9 - Learn the difference between sequential, conditional, and iteration structure | Sequential vs Conditional Structure                              |
| Part 10 - Learn how to use various iteration structures                 | Sequential vs Conditional Structure                              |
| Part 11 - Learn built-in mathematical function in the Java Math Class Library | String and char operations                                |
| Part 12 - Learn built-in mathematical function in the Java Math Class Library | Arrays and Array list                                             |

# Banking System

## Introduction
Welcome to the Banking System! This system allows users to perform various banking activities such as creating accounts, depositing/withdrawing money, checking balances, and displaying account details. A banking program in Java, that the users can do the following banking activities like creating accounts, depositing/withdrawing money, checking balance, and displaying account details.

## Features 
- Create new bank accounts with unique account numbers and account holder names.
- Deposit money into existing accounts.
- Withdraw money from existing accounts, with checks for sufficient balance.
- Check the current balance of an account.
- Display detailed information about an account.

### Code Structure Tree

New Version of CryptoBank diagram tree 
```bash
CryptoBank.java
├── main(String[] args)
│   ├── Scanner for input
│   └── Switch statement for menu options
├── createNewAccount(Scanner scanner)
│   ├── Checks if maximum account limit is reached
│   └── Creates a new account and adds it to the account arrays
├── performTransaction(Scanner scanner, boolean isDeposit)
│   ├── Asks for account number and amount
│   └── Performs deposit or withdrawal based on isDeposit flag
└── checkBalance(Scanner scanner)
    ├── Asks for account number
    └── Displays the balance of the specified account
```

### Previous Version when I used Encapsulation

CryptoBank diagram tree
```bash
CryptoBank.java
│
├── main(String[] args)
│   ├── Scanner for input
│   └── Switch statement for menu options
│
├── createNewAccount(Scanner scanner)
│   ├── Checks if maximum account limit is reached
│   └── Creates a new BankAccount and adds it to the accounts array
│
├── performTransaction(Scanner scanner, boolean isDeposit)
│   ├── Asks for account number and amount
│   └── Performs deposit or withdrawal based on isDeposit flag
│
├── checkBalance(Scanner scanner)
│   ├── Asks for account number
│   └── Displays the balance of the specified account
│
└── BankAccount (Static Inner Class)
    ├── Fields: accountName, accountNumber, balance
    ├── Constructor: BankAccount(String accountName, int accountNumber)
    ├── deposit(double amount)
    ├── withdraw(double amount)
    └── checkBalance()
```

### Tree Diagram Simple Structure
```bash
CryptoBank (Workspace Folder in Eclipse or VS Code
├── bin
└── Package
    ├── src
        └── CryptoBank.java (java file class)
```
#### Switch Statement
The switch statement in the main method controls the program's flow based on the user's menu choice. Each case corresponds to a different banking operation, calling the appropriate method:

* Case 1: Calls `createNewAccount` to create a new account.
* Case 2: Calls `performTransaction` with `true` to deposit money.
* Case 3: Calls `performTransaction` with `false` to withdraw money.
* Case 4: Calls `checkBalance` to display an account's balance.
* Case 5: Exits the program.

#### Methods for Deposit and Withdraw
* **createNewAccount(Scanner scanner)**: This method prompts the user for an account name, creates a new `BankAccount` object with a unique account number (based on `accountCount`), and adds it to the `accounts` array. It also increments `accountCount`.
  
* **performTransaction(Scanner scanner, boolean isDeposit)**: Depending on the `isDeposit` flag, this method either deposits or withdraws money from a specified account. It asks the user for the account number and the amount, then performs the requested operation.

#### Testing the Array with Temporary Data
The array `accounts` is used to store instances of the `BankAccount` class. In the main method, the program creates a new BankAccount and adds it to the accounts array when the user chooses to create a new account. This is a form of testing the array with temporary data, as it simulates the creation of new accounts in a real banking system.

#### Important Features in the Code
* **Static Inner Class**: The `BankAccount` class is defined as a static inner class within `CryptoBank`. This is a way to encapsulate the `BankAccount` class within the CryptoBank class, making it clear that BankAccount is closely related to CryptoBank.

* **Array Usage**: The `accounts` array is used to store multiple `BankAccount` instances. This is a simple way to manage a collection of accounts in a single variable.
  
* **User Input Handling**: The program uses a `Scanner` to handle user input. This is a common way to get input from the user in a console-based Java program.

* **Error Handling**: The program includes checks to ensure that the user doesn't exceed the maximum number of accounts and that the user doesn't try to deposit or withdraw from a non-existent account.

* **Encapsulation**: The `BankAccount` class encapsulates the data and operations related to a bank account. This is a fundamental principle of object-oriented programming.

* **Control Flow**: The program uses control structures like `if-else` and `switch` statements to manage the flow of the program based on user input.

* **Modularity**: The program is divided into methods, each responsible for a specific task. This makes the code easier to read, understand, and maintain.

* **Static Fields**: The `MAX_ACCOUNTS` field is declared as `static`, meaning it's shared by all instances of the `CryptoBank` class. This is used to limit the number of accounts that can be created.

* **Error Messages**: The program provides informative error messages when the user enters invalid input or when an operation can't be performed.

* **Looping**: The program uses a `do-while` loop to keep the menu running until the user chooses to exit. This ensures that the program doesn't terminate immediately after a single operation.


# 🧊 Installation 
 
### Installation ✍️      
1. Clone the repository to your local machine.
2. Open the project in your preferred programming environment.
3. Build the project to compile the source code.

### Usage ✍️
1. Run the `CryptoBank` class to start the program.  
2. Follow the on-screen menu options to perform various banking activities.
3. Enter the required information when prompted, such as account numbers, account holder names, deposit/withdrawal amounts, etc.
4. View the program's output to see the results of each operation.

# 🏆 Contributing   

### Contributing  
If you would like to contribute to the Banking System, please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Push your changes to your forked repository.
5. Submit a pull request to the main repository.

### 🧠 Submitting Changes

🧠 Contributions are welcome! If you have ideas for improvements or want to add more exercises, follow these steps:

1. Fork the repository.
2. Create a new branch.
3. Make your changes and commit them.
4. Push to your fork and submit a pull request.

### 👋 Contributors
### Special thanks to all my groupmates: 
 * ####  😎 [Jay Arre Talosig](https://github.com/flexycode)
 * ####  😃 [Gabriel Angelo Viñas](https://github.com/IYB-Mata) 
 * ####  🥰 [Anilove Tiquio](https://github.com/tiquioani) 
 * ####  🤗 [Kristine Vine Navarro](https://github.com/Kristine2811) 
 * ####  😌 [Joshua Maquilan](https://github.com/Primorion) 
 * ####  😋 [Vince Erol Pangilinan](https://github.com/vinceeee4)
   
### 🛸 Reporting Issues

###### 🤖 If you encounter any issues or have suggestions, please open an issue to let us know.

# 🔑 License 
 
## License
The Banking System is licensed under the [MIT License](https://opensource.org/licenses/MIT) and [ALT Licence](https://github.com/flexycode/BankingSystem/blob/main/LICENSE).
This project is licensed under the MIT License and Artificial Ledger Technology.


# 📫 Changelogs     
## [1.4.10] - 2024-03-02     
### Added 
- 📫 Uploaded the Project Requirements
- 📫 Created the Project Documentation
- 📫 Added breakdown and documentation
- 📫 Added a function for default Bank Account profile. 
- 📫 Added Final revision for CryptoBank.

### Changed
- 📫 Revised all java source code file
- 📫 Changed some variable and array
- 📫 Changed the value and function for class method in the BankingProgram.java 

### Fixed
- 📫 Fixed some error in java methods and classes
- 📫 Fixed the name of the Main Branch for debugging and run the code. BankingProgram will be the main branch while BankingSystem will be the sub-branch.

### Problem
- 📫 There's an overall issue from this code

#### [Back to Table of Content](#introduction)
