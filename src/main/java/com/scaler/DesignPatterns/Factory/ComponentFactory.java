package com.scaler.DesignPatterns.Factory;

public interface ComponentFactory {
    Button createButton();
    Dropdown createDropdown();
    Checkbox createCheckbox();
}
