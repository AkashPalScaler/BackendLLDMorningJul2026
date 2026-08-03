package com.scaler.ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        for( int i=0;i<1;i++){ // Starting n number of producer threads
            System.out.println("Starting producer threads");
            Thread thread = new Thread(new Producer(store));
            thread.start();
        }
        for( int i=0;i<1;i++){ // Starting n number consumer threads
            System.out.println("Starting consumer threads");
            Thread thread = new Thread(new Consumer(store));
            thread.start();
        }
    }
}
