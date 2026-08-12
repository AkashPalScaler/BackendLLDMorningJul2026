package com.scaler.Lambda;

public class Client {
    public static void main(String[] args) {
        // Way 1: traditional way
        Runnable task = new HelloWorldPrinter();
        Thread thread = new Thread(task);
        thread.start();

        // Way 2: Anonymouse class
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World -> " + Thread.currentThread().getName());
            }
        };
        Thread thread2 = new Thread(task2);
        thread2.start();

        // Way 2: Anonymous class (with multiple abstract function example)
        TestInterface obj = new TestInterface() {
            @Override
            public void fun1() {
                System.out.println("Fun1 World -> " + Thread.currentThread().getName());
            }
            @Override
            public void fun2() {
                System.out.println("Fun2 World -> " + Thread.currentThread().getName());
            }
        };
        System.out.println("debug");
        // Way 3: Lambda class
        Runnable task3 = () -> {
            System.out.println("Hello World -> " + Thread.currentThread().getName());
        };
        Thread thread3 = new Thread(task3);
        thread3.start();
        System.out.println("debug");


        // Way 3: One more syntactical sugar:
        Thread thread4 = new Thread(() -> {
            System.out.println("Hello World -> " + Thread.currentThread().getName());
        });
        thread4.start();

        // Only works with function interfaces
//        TestInterface obj2 = () -> {
//            System.out.println("Hello World -> " + Thread.currentThread().getName());
//        };
    }
}
//Break till 8:15 AM
