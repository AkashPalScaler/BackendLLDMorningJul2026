package com.scaler.DesignPatterns.Adapter;

public class FastCardRecharge {
    String fastCardId;
    BankAccount fastCardAccount; // FastCard's own account number
    BankAdapter bankAdapter;

    public FastCardRecharge(String fastCardId, BankAccount fastCardAccount, BankAdapter bankAdapter) {
        this.fastCardId = fastCardId;
        this.fastCardAccount = fastCardAccount;
        this.bankAdapter = bankAdapter;
    }

    float checkBalance(){
        // to check balance on fast card
        return 0.0f;
    }

    boolean rechargeCard(BankAccount bankAccount, float amount){
        // Check balance and transfer
        if(bankAdapter.checkBalance(bankAccount) >= amount){
            System.out.println("Bank balance is sufficient");
            return bankAdapter.transferMoney(bankAccount, fastCardAccount, amount);
        }
        System.out.println("Not enough balance");
        return false;
    }
}
