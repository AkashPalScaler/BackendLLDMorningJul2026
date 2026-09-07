package com.scaler.DesignPatterns.Decorator;

public class Espresso implements Beverage {
    @Override
    public Double getPrice() {
        return 100.0;
    }

    @Override
    public String getDescription() {
        return "Our world famous espresso";
    }
}
