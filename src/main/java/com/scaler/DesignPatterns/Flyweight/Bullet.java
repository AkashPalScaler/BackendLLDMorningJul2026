package com.scaler.DesignPatterns.Flyweight;

public class Bullet {
    BulletType type;
    double speed;
    double[] direction;
    double[] currentCoordinate;
    double[] targetCoordinate;

    public Bullet(BulletType type) {
        this.type = type;
    }
}
