package com.driver;

import java.util.Scanner;

public class BankingSystem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);

        System.out.print("Enter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        try {
            account.withdraw(withdrawAmount);
            System.out.println("Withdrawal successful. Updated balance: " + account.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
