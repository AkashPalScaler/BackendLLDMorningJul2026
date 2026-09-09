package com.scaler.DesignPatterns.Strategy;

public class BikePathCalculator implements PathCalculatorStrategy {
    @Override
    public Path findPath(String source, String destination) {
        System.out.println("Finding bike path ...");
        return new Path();
    }
}
