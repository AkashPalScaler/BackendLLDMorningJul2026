package com.scaler.DesignPatterns.Factory;

public class IOSDropdown implements Dropdown {
    @Override
    public void setOptions(String[] options) {
        System.out.println("IOS Set options");
    }
}
