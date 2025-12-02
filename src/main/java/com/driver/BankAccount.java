package com.driver;

public class BankAccount {
	private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
       this.accountNumber=accountNumber;
       this.accountHolderName=accountHolderName;
       this.balance=initialBalance;
    }

    public double getBalance() {
    	// your code goes here
        return balance;
    }

    public void deposit(double amount) {
    	// your code goes here
            if (amount < 1) {
                System.out.print("invalid amount");
                return;
            }
            balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
    	// your code goes here
         if (amount < 1) {
                System.out.print("invalid amount");
                return;
            }
        if(amount>balance){
            throw new InsufficientBalanceException("insufficient balance");
        }
        balance-=amount;
    }
}
