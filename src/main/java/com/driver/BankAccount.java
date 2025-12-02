package com.driver;

public class BankAccount {
	private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
       // your code goes here
    }

    public double getBalance() {
    	// your code goes here
        return 0.0;
    }

    public void deposit(double amount) {
    	// your code goes here
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
    	// your code goes here
    }
}
