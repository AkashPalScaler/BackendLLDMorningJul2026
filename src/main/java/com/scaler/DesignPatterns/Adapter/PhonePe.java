package com.scaler.DesignPatterns.Adapter;

public class PhonePe {
    BankAccount bankAccount;
    Loan loan;
    FastCardRecharge fastCardRecharge;

    public PhonePe(BankAccount bankAccount, Loan loan, FastCardRecharge fastCardRecharge) {
        this.bankAccount = bankAccount;
        this.loan = loan;
        this.fastCardRecharge = fastCardRecharge;
    }
}
