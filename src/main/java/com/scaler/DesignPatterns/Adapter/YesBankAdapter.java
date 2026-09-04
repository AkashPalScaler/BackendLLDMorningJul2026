package com.scaler.DesignPatterns.Adapter;

import com.scaler.DesignPatterns.Adapter.YesBank.YesBankAPI;

public class YesBankAdapter implements BankAdapter {
    YesBankAPI api =  new YesBankAPI();
    @Override
    public float checkBalance(BankAccount bankAccount) {
        // input formatted/converted for yesbank request
        // actual yes bank api/function call
        // output formatted/converted from yes bank response
        String accountNumber = bankAccount.getAccountNumber();
        double amount = api.getBalance(accountNumber);
        float responseAmount = (float) amount;
        return responseAmount;
    }

    @Override
    public boolean transferMoney(BankAccount source, BankAccount destination, float amount) {
        String sourceAccountNumber = source.getAccountNumber();
        String destinationAccountNumber = destination.getAccountNumber();
        Integer success = api.sendMoney((double)amount, sourceAccountNumber, destinationAccountNumber);
        boolean successful = success == 1;
        return successful;
    }
}
