package com.scaler.ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Store store;
    Semaphore prodSema;
    Semaphore consSema;
    Producer(Store store, Semaphore prodSema, Semaphore consSema){
        this.store = store;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }
    @Override
    public void run() {
        while(true){
            try {
                prodSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //pre-processing
            store.addItem(new Object());
            //post-cleanup
            consSema.release();
        }
    }
}
// Break till 8:20 AM