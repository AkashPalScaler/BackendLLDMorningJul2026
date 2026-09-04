package com.scaler.DesignPatterns.Adapter;

public class Loan {
    BankAdapter bankAdapter;
    final float thresholdAmount =  100000;
    public Loan(BankAdapter bankAdapter) {
        this.bankAdapter = bankAdapter;
    }
    boolean checkEligibility(BankAccount bankAccount) {
        // logic to check eligibility
        if(bankAdapter.checkBalance(bankAccount) >= thresholdAmount){
            System.out.println("Eligible loan");
            return true;
        }
        System.out.println("Not eligible loan");
        return false;
    };
}
