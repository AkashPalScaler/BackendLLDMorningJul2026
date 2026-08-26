package com.scaler.DesignPatterns.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService es =  Executors.newFixedThreadPool(1000);

        List<Runnable> runnables = new ArrayList<>();

        for(int i = 0; i < 10000; i++){
            runnables.add(new ReadDBObject());
        }
        for (int i = 0; i < 10000; i++){
            es.submit(runnables.get(i));
        }
    }
}
