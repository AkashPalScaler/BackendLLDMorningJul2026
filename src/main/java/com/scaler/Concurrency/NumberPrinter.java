package com.scaler.Concurrency;

public class NumberPrinter implements Runnable {
    int i;
    public NumberPrinter(int i){
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println("Printing " + i + " numbers using " + Thread.currentThread().getName());
    }
}
