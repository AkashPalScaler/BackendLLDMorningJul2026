package com.scaler.DesignPatterns.Adapter;

public class Client {
    public static void main(String[] args) {
        BankAdapter bankAdapter = new HDFCBankAdapter();
        Loan loan = new Loan(bankAdapter);
        BankAccount fastCardAccount = new BankAccount("ICICI", "IC2020834034");
        FastCardRecharge fastCardRecharge = new FastCardRecharge("1212", fastCardAccount, bankAdapter);
        BankAccount myAccount = new BankAccount("HDFC", "HDFC00289383");
        loan.checkEligibility(myAccount);
        if(fastCardRecharge.rechargeCard(myAccount, 500.0f)){
            System.out.println("Recharge successfull");
        }
    }
}
