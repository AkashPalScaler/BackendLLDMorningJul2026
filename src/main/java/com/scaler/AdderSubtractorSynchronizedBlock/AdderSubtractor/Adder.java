package com.scaler.AdderSubtractorSynchronizedBlock.AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Value v;

    public Adder(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {

        for(int i=0;i<10000;i++){
            v.increment(i);
        }

        return null;
    }
}
// Wrapper classes
// int -> Integer
// float -> Float
// boolean -> Boolean
// void -> Void
