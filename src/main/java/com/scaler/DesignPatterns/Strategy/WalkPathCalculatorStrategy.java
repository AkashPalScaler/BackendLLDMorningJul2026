package com.scaler.DesignPatterns.Strategy;
// Are they expensive objects to create? - Need singleton or not?
public class WalkPathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public Path findPath(String source, String destination) {
        System.out.println("Calculating walk path...");
        return new Path();
    }
}
// Strategy class have a need for singleton?
// DB connection needed, any 3d model loaded, any bulk data loaded
// Pre-calculations - Pre maps, pre sum arrays (more popular in case of strategy)