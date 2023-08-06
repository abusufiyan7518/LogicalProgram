package com.logical.string;

import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        while (true) {
            System.out.println("Bank Account System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Funds");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    createAccount(accounts, scanner);
                    break;
                case 2:
                    depositFunds(accounts, scanner);
                    break;
                case 3:
                    withdrawFunds(accounts, scanner);
                    break;
                case 4:
                    checkBalance(accounts, scanner);
                    break;
                case 5:
                    transferFunds(accounts, scanner);
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void createAccount(ArrayList<BankAccount> accounts, Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account holder's name: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        accounts.add(new BankAccount(accountNumber, accountHolder, balance));
        System.out.println("Account created successfully.");
    }

    public static void depositFunds(ArrayList<BankAccount> accounts, Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = findAccount(accounts, accountNumber);
        if (account != null) {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();
            account.balance += amount;
            System.out.println("Funds deposited successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void withdrawFunds(ArrayList<BankAccount> accounts, Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = findAccount(accounts, accountNumber);
        if (account != null) {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            if (account.balance >= amount) {
                account.balance -= amount;
                System.out.println("Funds withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void checkBalance(ArrayList<BankAccount> accounts, Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = findAccount(accounts, accountNumber);
        if (account != null) {
            System.out.println("Account balance: $" + account.balance);
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void transferFunds(ArrayList<BankAccount> accounts, Scanner scanner) {
        System.out.print("Enter source account number: ");
        String sourceAccountNumber = scanner.nextLine();
        BankAccount sourceAccount = findAccount(accounts, sourceAccountNumber);
        if (sourceAccount != null) {
            System.out.print("Enter destination account number: ");
            String destAccountNumber = scanner.nextLine();
            BankAccount destAccount = findAccount(accounts, destAccountNumber);
            if (destAccount != null) {
                System.out.print("Enter transfer amount: ");
                double amount = scanner.nextDouble();
                if (sourceAccount.balance >= amount) {
                    sourceAccount.balance -= amount;
                    destAccount.balance += amount;
                    System.out.println("Funds transferred successfully.");
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Destination account not found.");
            }
        } else {
            System.out.println("Source account not found.");
        }
    }

    public static BankAccount findAccount(ArrayList<BankAccount> accounts, String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.accountNumber.equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
