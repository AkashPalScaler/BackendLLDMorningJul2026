package com.scaler.DesignPatterns.Factory;

public class IOSCheckbox implements Checkbox {
    @Override
    public void onClick() {
        System.out.println("IOS checkbox clicked");
    }
}
