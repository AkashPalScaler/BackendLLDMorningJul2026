package com.scaler.DesignPatterns.Adapter;

import com.scaler.DesignPatterns.Adapter.HDFCBank.HDFCBalanceResponse;
import com.scaler.DesignPatterns.Adapter.HDFCBank.HDFCBankAPI;
import com.scaler.DesignPatterns.Adapter.HDFCBank.HDFCBankAccount;
import com.scaler.DesignPatterns.Adapter.HDFCBank.HDFCTransferResponse;

public class HDFCBankAdapter implements BankAdapter {
    HDFCBankAPI hdfcBankAPI = new HDFCBankAPI();
    @Override
    public float checkBalance(BankAccount bankAccount) {
        HDFCBankAccount hdfcBankAccount = new HDFCBankAccount(bankAccount.accountNumber, bankAccount.bankName);
        HDFCBalanceResponse balanceResponse = hdfcBankAPI.fetchBalance(hdfcBankAccount);
        return balanceResponse.getBalance();
    }

    @Override
    public boolean transferMoney(BankAccount source, BankAccount destination, float amount) {
        HDFCBankAccount sourceAccount = new HDFCBankAccount(source.accountNumber, source.bankName);
        HDFCBankAccount destinationAccount = new HDFCBankAccount(destination.accountNumber, destination.bankName);
        HDFCTransferResponse transferResponse = hdfcBankAPI.sendMoney(amount, sourceAccount, destinationAccount);
        System.out.println(transferResponse.getMessage());
        return transferResponse.getSuccess();
    }
}
