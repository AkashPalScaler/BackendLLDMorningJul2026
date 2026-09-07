package com.scaler.DesignPatterns.Decorator;

public class HouseBlend implements Beverage {
    @Override
    public Double getPrice() {
        return 200.0;
    }

    @Override
    public String getDescription() {
        return "Our in house blended coffee";
    }
}
