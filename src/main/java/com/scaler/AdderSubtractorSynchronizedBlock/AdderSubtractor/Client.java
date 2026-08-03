package com.scaler.AdderSubtractorSynchronizedBlock.AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Object someobj = new Object();
        v.i = 0;

        ExecutorService pool = Executors.newCachedThreadPool();

        Future<Void> voidFutureAdder =  pool.submit(new Adder(v));
        Future<Void> voidFutureSubtractor =  pool.submit(new Subtractor(v));

        voidFutureAdder.get();
        voidFutureSubtractor.get();

        System.out.println("Value of i :" + v.i);
        pool.shutdown();
    }
}
