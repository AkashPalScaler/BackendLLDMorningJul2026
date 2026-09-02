package com.scaler.DesignPatterns.Factory;

public class IOSComponentFactory implements ComponentFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Checkbox createCheckbox() {
        return new IOSCheckbox();
    }
}
