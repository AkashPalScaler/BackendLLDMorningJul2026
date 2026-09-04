package com.scaler.DesignPatterns.Adapter.YesBank;

import com.scaler.DesignPatterns.Adapter.BankAccount;

// Written by Yes bank devs
public class YesBankAPI {
    public double getBalance(String accountNumber) {
        // Actually checking bank account internally
        return 145000;
    }
    public Integer sendMoney(double amount, String accountNumberSource, String accountNumberDestination) {
        // Actual transfer internally
        return 1;
    }
}
