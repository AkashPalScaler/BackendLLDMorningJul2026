package com.scaler.DesignPatterns.Factory;

public class AndroidPlatform implements Platform{
    @Override
    public void setRefrestRate(double refrestRate) {

    }

    @Override
    public double getRefrestRate() {
        return 0;
    }

    @Override
    public void setTheme(String theme) {

    }

    @Override
    public String getTheme() {
        return "";
    }

    @Override
    public ComponentFactory getComponentFactory() {
        return new AndroidComponentFactory();
    }

//    @Override
//    public Button createButton() {
//        return new AndroidButton();
//    }
//
//    @Override
//    public Dropdown createDropdown() {
//        return new AndroidDropdown();
//    }
//
//    @Override
//    public Checkbox createCheckbox() {
//        return new AndroidCheckbox();
//    }
}
