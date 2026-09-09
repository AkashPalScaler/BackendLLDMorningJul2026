package com.scaler.DesignPatterns.Strategy;

public class PathCalculatorFactory {
    static PathCalculatorStrategy getPathCalculatorStrategy(TravelMode mode){
        if(mode.equals(TravelMode.WALK)){
            return new WalkPathCalculatorStrategy();
        } else if (mode.equals(TravelMode.BIKE)) {
            return new BikePathCalculator();
        }else{
            throw new  IllegalArgumentException("Unknown TravelMode "+mode);
        }
    }
}
