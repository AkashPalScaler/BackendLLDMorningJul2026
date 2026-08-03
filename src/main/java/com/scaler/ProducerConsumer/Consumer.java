package com.scaler.ProducerConsumer;

public class Consumer implements Runnable{
    Store store;
    Consumer(Store store){
        this.store = store;
    }
    @Override
    public void run() {
        while(true){
            if((store.getCurrentSize() > 0)){
                store.getItem();
            }
        }
    }
}
