package com.scaler.DesignPatterns.Decorator;

public abstract class AddOn implements Beverage{
    public Beverage baseBeverage;

    public AddOn(Beverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    @Override
    public abstract Double getPrice();

    @Override
    public abstract String getDescription();
}
