package com.scaler.ProducerConsumer;

public class Producer implements Runnable{
    Store store;
    Producer(Store store){
        this.store = store;
    }
    @Override
    public void run() {
        while(true){
            if((store.getCurrentSize() < store.getMaxsize())){
                store.addItem(new Object());
            }
        }
    }
}
