package com.scaler.AdderSubtractorSynchronizedBlock.AdderSubtractor;

public class Value {
    int i;

    public synchronized void increment(int i) { // this.lock.lock()
        this.i += i;
    }//this.lock.unlock();

    public synchronized void decrement(int i) {
        this.i -= i;
    }
}
