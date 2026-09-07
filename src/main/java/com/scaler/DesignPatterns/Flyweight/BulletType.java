package com.scaler.DesignPatterns.Flyweight;

public class BulletType {
    Color color;
    double weight;
    double radius;
    int maxDamage;
    int maxRange;
    byte[] image;

    public BulletType(Color color, double weight, double radius, int maxDamage, int maxRange, byte[] image) {
        this.color = color;
        this.weight = weight;
        this.radius = radius;
        this.maxDamage = maxDamage;
        this.maxRange = maxRange;
        this.image = image;
    }

    public BulletType() {
    }
}
