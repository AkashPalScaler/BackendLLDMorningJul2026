package com.scaler.DesignPatterns.Factory;

public class AndroidButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Android button clicked");
    }
}
