package com.scaler.DesignPatterns.Flyweight;

public class Client {
    public static void main(String[] args) {
        BulletType ninemm = new NineMM(); // Heavy objects (~1.1kb)
        BulletType fortyFiveCaliber = new FortyFiveCaliber();// Heavy objects (~1.1kb)

        Bullet bullet = new Bullet(ninemm);
        Bullet bullet1 = new Bullet(ninemm);
        Bullet bullet2 = new Bullet(ninemm);
        Bullet bullet3 = new Bullet(ninemm);
        Bullet bullet4 = new Bullet(ninemm);
        Bullet bullet5 = new Bullet(ninemm);
        Bullet bullet6 = new Bullet(ninemm);
        Bullet bullet7 = new Bullet(fortyFiveCaliber);
        Bullet bullet8 = new Bullet(fortyFiveCaliber);
        Bullet bullet9 = new Bullet(fortyFiveCaliber);
        Bullet bullet10 = new Bullet(fortyFiveCaliber);
        Bullet bullet11 = new Bullet(fortyFiveCaliber);
        Bullet bullet12 = new Bullet(fortyFiveCaliber);
        Bullet bullet13 = new Bullet(fortyFiveCaliber);

    }
}
