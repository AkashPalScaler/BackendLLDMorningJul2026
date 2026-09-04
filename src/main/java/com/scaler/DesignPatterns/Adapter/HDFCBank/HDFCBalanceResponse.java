package com.scaler.DesignPatterns.Adapter.HDFCBank;

public class HDFCBalanceResponse {
    float balance;

    public HDFCBalanceResponse(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
