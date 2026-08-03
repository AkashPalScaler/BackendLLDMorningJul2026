package com.scaler.AdderSubtractor;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        v.i = 0;

        ExecutorService pool = Executors.newCachedThreadPool();
        Lock lock = new ReentrantLock();

        Future<Void> voidFutureAdder =  pool.submit(new Adder(v, lock));
        Future<Void> voidFutureSubtractor =  pool.submit(new Subtractor(v, lock));

        voidFutureAdder.get();
        voidFutureSubtractor.get();

        System.out.println("Value of i :" + v.i);
        pool.shutdown();
    }
}
