package com.scaler.ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    Store store;
    Semaphore prodSema;
    Semaphore consSema;
    Consumer(Store store, Semaphore prodSema, Semaphore consSema){
        this.store = store;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }
    @Override
    public void run() {
        while(true){
            try {
                consSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // pre-fetch
            store.getItem();
            // post-process
            prodSema.release();
        }
    }
}
