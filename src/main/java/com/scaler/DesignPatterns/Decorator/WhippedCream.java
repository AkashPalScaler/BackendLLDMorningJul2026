package com.scaler.DesignPatterns.Decorator;

public class WhippedCream extends AddOn{
    public WhippedCream(Beverage baseBeverage) {
        super(baseBeverage);
    }

    @Override
    public Double getPrice() {
        return 50.0 + baseBeverage.getPrice();
    }

    @Override
    public String getDescription() {
        return baseBeverage.getDescription() + "- A dash of sweetened whipped cream";
    }
}
