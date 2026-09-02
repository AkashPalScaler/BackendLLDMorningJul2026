package com.scaler.DesignPatterns.Factory;

public class AndroidComponentFactory implements ComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Checkbox createCheckbox() {
        return new AndroidCheckbox();
    }
}
