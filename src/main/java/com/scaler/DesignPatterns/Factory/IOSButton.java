package com.scaler.DesignPatterns.Factory;

public class IOSButton implements Button {
    @Override
    public void onClick() {
        System.out.println("IOS button clicked");
    }
}
