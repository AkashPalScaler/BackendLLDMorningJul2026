package com.scaler.DesignPatterns.Factory;

import java.util.List;

public class Dashboard {
    Platform platform;
    public Dashboard(Platform platform) {
        this.platform = platform;
    }

    void renderSearchBox(){
//        if(platform instanceof IOSPlatform){
//            Dropdown d = new IOSDropdown();
//            Button b = new IOSButton();
//        }

            // Only factory method
//        Button button = platform.createButton();
//        Dropdown dropdown = platform.createDropdown();
//        Checkbox checkbox = platform.createCheckbox();
//
//        button.onClick();
//        dropdown.setOptions(null);

        // With Abstract factory
        Button button = platform.getComponentFactory().createButton();
        Dropdown dropdown = platform.getComponentFactory().createDropdown();
        Checkbox checkbox = platform.getComponentFactory().createCheckbox();
         button.onClick();
    }
}
