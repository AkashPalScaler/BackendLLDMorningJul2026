package com.scaler.DesignPatterns.Factory;

public interface Platform {
    void setRefrestRate(double refrestRate);
    double getRefrestRate();
    void setTheme(String theme);
    String getTheme();

//    // Factory Method (can be removed from here and from implementing classes(IOSPLatform and AndroidPlatform)after abstract factory implementation)
//    Button createButton();
//    Dropdown createDropdown();
//    Checkbox createCheckbox();

    // Abstract factory method
    ComponentFactory getComponentFactory();
}
