package com.scaler.AdderSubtractorSynchronizedBlock.AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Value v;

    public Subtractor(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {

        for(int i=0;i<10000;i++){
            v.decrement(i);
        }

        return null;
    }
}
