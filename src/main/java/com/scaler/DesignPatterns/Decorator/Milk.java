package com.scaler.DesignPatterns.Decorator;

public class Milk extends AddOn{
    public Milk(Beverage baseBeverage) {
        super(baseBeverage);
    }

    @Override
    public Double getPrice() {
        if(baseBeverage instanceof Milk){ // is BaseBeverage a Milk object
            return 10.0 + baseBeverage.getPrice();
        }
        return 20.0 + baseBeverage.getPrice();
        // MilkPromotion class - multiple promotion
    }

    @Override
    public String getDescription() {
        return baseBeverage.getDescription() + "- A shot of milk";
    }
}
// Promotion engine (Rule engine for promotions)
