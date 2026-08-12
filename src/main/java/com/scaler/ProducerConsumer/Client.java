package com.scaler.ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        Semaphore prodSema =  new Semaphore(5);
        Semaphore consSema =  new Semaphore(0);
        for( int i=0;i<10;i++){ // Starting n number of producer threads
            System.out.println("Starting producer threads");
            Thread thread = new Thread(new Producer(store, prodSema, consSema));
            thread.start();
        }
        for( int i=0;i<7;i++){ // Starting n number consumer threads
            System.out.println("Starting consumer threads");
            Thread thread = new Thread(new Consumer(store, prodSema, consSema));
            thread.start();
        }
    }
}
