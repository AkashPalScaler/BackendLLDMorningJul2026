package com.scaler.DesignPatterns.Flyweight;

public class FortyFiveCaliber extends BulletType{
    public FortyFiveCaliber(Color color, double weight, double radius, int maxDamage, int maxRange, byte[] image) {
        super(color, weight, radius, maxDamage, maxRange, image);
    }

    public FortyFiveCaliber() {
    }
}
