package com.scaler.DesignPatterns.Strategy;

import java.nio.file.Paths;

public class GoogleMap {
    public static void main(String[] args) {
       Path path =  MapService
               .getInstance()
               .setPathCalculatorStrategy(
                       PathCalculatorFactory
                       .getPathCalculatorStrategy(TravelMode.WALK)
               )
               .findPath("source", "destination");
    }
}
