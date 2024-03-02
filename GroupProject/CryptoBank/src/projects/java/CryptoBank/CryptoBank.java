package projects.java.CryptoBank;

import java.util.Scanner;

public class CryptoBank {
    private static final int MAX_ACCOUNTS = 10; 
    private static BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];
    private static int accountCount = 0; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to ALT Crypto Bank!");

        do {
            System.out.println("[1.] Create New Account");
            System.out.println("[2.] Deposit Money");
            System.out.println("[3.] Withdraw Money");
            System.out.println("[4.] Check Balance");
            System.out.println("[5.] Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createNewAccount(scanner);
                    break;
                case 2:
                    performTransaction(scanner, true); // true for deposit
                    break;
                case 3:
                    performTransaction(scanner, false); // false for withdraw
                    break;
                case 4:
                    checkBalance(scanner);
                    break;
                case 5:
                    System.out.println("Thank you for using ALT Crypto Bank!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);
    }

    private static void createNewAccount(Scanner scanner) {
        if (accountCount >= MAX_ACCOUNTS) {
            System.out.println("Maximum account limit reached.");
            return;
        }
        System.out.print("Enter Account Name: ");
        String accountName = scanner.next();
        BankAccount newAccount = new BankAccount(accountName, accountCount);
        accounts[accountCount++] = newAccount;
        System.out.println("Account created successfully. Your account number is: " + newAccount.getAccountNumber());
    }

    private static void performTransaction(Scanner scanner, boolean isDeposit) {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        if (accountNumber < 0 || accountNumber >= accountCount) {
            System.out.println("Invalid account number.");
            return;
        }
        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();
        if (isDeposit) {
            accounts[accountNumber].deposit(amount);
        } else {
            accounts[accountNumber].withdraw(amount);
        }
    }

    private static void checkBalance(Scanner scanner) {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        if (accountNumber < 0 || accountNumber >= accountCount) {
            System.out.println("Invalid account number.");
            return;
        }
        accounts[accountNumber].checkBalance();
    }

    // Change this Encapsulation OOP to different method //
    // Sabi ni Prof Jay gawin nalang daw na string array class // 
    static class BankAccount {
        private String accountName;
        private int accountNumber;
        private double balance;

        public BankAccount(String accountName, int accountNumber) {
            this.accountName = accountName;
            this.accountNumber = accountNumber;
            this.balance = 0.0;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Amount deposited successfully. Current Balance: " + balance);
            } else {
                System.out.println("Invalid amount. Please enter a positive number.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println("Amount withdrawn successfully. Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        }

        public void checkBalance() {
            System.out.println("Account Name: " + accountName + " - Current Balance: " + balance);
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        // New method to get the account name
        public String getAccountName() {
            return accountName;
        }
    }
}
