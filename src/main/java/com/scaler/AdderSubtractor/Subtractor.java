package com.scaler.AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Callable<Void> {
    Value v;
    Lock lock;
    public Subtractor(Value v, Lock lock) {
        this.v = v;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {

        for(int i=0;i<10000;i++){

            lock.lock();
            System.out.println("Decrementing i by "+ i);
            v.i -= i;
            lock.unlock();
        }

        return null;
    }
}
