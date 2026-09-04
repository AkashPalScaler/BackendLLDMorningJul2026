package com.scaler.DesignPatterns.Adapter;

public interface BankAdapter {
    float checkBalance(BankAccount bankAccount);
    boolean transferMoney(BankAccount source, BankAccount destination, float amount);
}