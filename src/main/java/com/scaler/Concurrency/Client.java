package com.scaler.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        System.out.println("Hello World using " + Thread.currentThread().getName());
//        for (int i = 1; i < 100; i++) {
//            System.out.println("Printing " + i + " numbers using " + Thread.currentThread().getName());
//        }

//        for (int i = 1; i <= 1000000; i++) {
//            NumberPrinter printer = new NumberPrinter(i);
//            Thread thread = new Thread(printer);
//            thread.start(); // Internally it will call the run function of the runnable task
//        }
//
//        ExecutorService executor = Executors.newFixedThreadPool(10);
//
//        for (int i = 1; i <= 1000000; i++) {
//            executor.execute(new NumberPrinter(i));
//            if(i == 1000 || i == 6000){
//                System.out.println("DEBUG");
//            }
//
//        }
//        executor.shutdown(); // 2 siblings(variations)

        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 1000000; i++) {
            executor.execute(new NumberPrinter(i));
            if(i == 6000){
                System.out.println("DEBUG");
            }
        }
        executor.shutdown(); // 2 siblings(variations) - shutdownNow, asyncTermination

    }
}