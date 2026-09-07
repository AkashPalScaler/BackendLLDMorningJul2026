package com.scaler.DesignPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        Beverage item = new Espresso();
        item = new Milk(item);
        item = new Milk(item);
        item =  new WhippedCream(item);

        System.out.println(item.getDescription());
        System.out.println(item.getPrice());
    }
}
