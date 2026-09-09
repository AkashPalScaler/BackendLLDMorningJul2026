package com.scaler.DesignPatterns.Strategy;

public class MapService {
    // Implement singleton
    PathCalculatorStrategy pathCalculatorStrategy;

    static MapService getInstance(){
        // HW: Double check locking
        return new MapService();
    }

    MapService setPathCalculatorStrategy(PathCalculatorStrategy pathCalculatorStrategy){
        this.pathCalculatorStrategy = pathCalculatorStrategy;
        return this;
    }

    Path findPath(String source, String destination) {
        return pathCalculatorStrategy.findPath(source, destination);
    }
}
