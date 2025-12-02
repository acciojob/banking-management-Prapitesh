package com.driver.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import com.driver.*;

public class TestCases {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("12345", "John", 1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    public void testWithdrawSuccess() throws InsufficientBalanceException {
        BankAccount account = new BankAccount("12345", "John", 1000);
        account.withdraw(400);
        assertEquals(600, account.getBalance());
    }

    @Test
    public void testWithdrawInsufficientBalance() {
        BankAccount account = new BankAccount("12345", "John", 300);
        assertThrows(InsufficientBalanceException.class, () -> {
            account.withdraw(500);
        });
    }

    @Test
    public void testDepositInvalidAmount() {
        BankAccount account = new BankAccount("12345", "John", 1000);
        account.deposit(0);
        assertEquals(1000, account.getBalance()); // balance should not change
    }

    @Test
    public void testWithdrawInvalidAmount() {
        BankAccount account = new BankAccount("12345", "John", 1000);
        assertThrows(Exception.class, () -> {
            if (true) {
                account.withdraw(0); // prints invalid amount but does not throw custom exception
            }
        });
    }
}
