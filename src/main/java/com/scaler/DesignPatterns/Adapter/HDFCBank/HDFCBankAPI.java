package com.scaler.DesignPatterns.Adapter.HDFCBank;

public class HDFCBankAPI {
    public HDFCBalanceResponse fetchBalance(HDFCBankAccount bankAccount) {
        // Actually checking bank account internally
        return new HDFCBalanceResponse(145000.0f);
    }
    public HDFCTransferResponse sendMoney(double amount, HDFCBankAccount sourceAccount, HDFCBankAccount DestinationAccount) {
        // Actual transfer internally
        return new HDFCTransferResponse(true, "Transfer successful");
    }
}
