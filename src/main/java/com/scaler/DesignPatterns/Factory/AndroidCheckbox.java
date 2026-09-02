package com.scaler.DesignPatterns.Factory;

public class AndroidCheckbox implements Checkbox {
    @Override
    public void onClick() {
        System.out.println("Android checkbox clicked");
    }
}
