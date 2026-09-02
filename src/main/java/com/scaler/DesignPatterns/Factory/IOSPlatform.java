package com.scaler.DesignPatterns.Factory;

public class IOSPlatform implements Platform{
    @Override
    public ComponentFactory getComponentFactory() {
        return new IOSComponentFactory();
    }

//    @Override
//    public Dropdown createDropdown() {
//        return new IOSDropdown();
//    }
//
//    @Override
//    public Checkbox createCheckbox() {
//        return new IOSCheckbox();
//    }
//
//    @Override
//    public Button createButton() {
//        return new IOSButton();
//    }

    @Override
    public void setRefrestRate(double refrestRate) {

    }

    @Override
    public double getRefrestRate() {
        return 0;
    }

    @Override
    public void setTheme(String theme) {
        // Own IOS logic
    }

    @Override
    public String getTheme() {
        return "";
    }
}
