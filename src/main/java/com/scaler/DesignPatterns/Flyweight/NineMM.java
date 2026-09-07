package com.scaler.DesignPatterns.Flyweight;

public class NineMM extends BulletType{
    public NineMM(Color color, double weight, double radius, int maxDamage, int maxRange, byte[] image) {
        super(color, weight, radius, maxDamage, maxRange, image);
    }

    public NineMM() {
        super();
    }
}
