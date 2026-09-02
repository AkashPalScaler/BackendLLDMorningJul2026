package com.scaler.DesignPatterns.Factory;

public class AndroidDropdown implements Dropdown {
    @Override
    public void setOptions(String[] options) {
        System.out.println("Android Dropdown set options");
    }
}
