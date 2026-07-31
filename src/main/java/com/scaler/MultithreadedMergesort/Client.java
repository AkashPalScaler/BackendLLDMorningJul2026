package com.scaler.MultithreadedMergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> mainArrToSort = List.of(5,3,1,4,8,2,3,9,10);
        ExecutorService pool = Executors.newCachedThreadPool();
        Future<List<Integer>> sortedArrFuture = pool.submit(new MergeSort(mainArrToSort, pool));
        List<Integer> sortedArr = sortedArrFuture.get();
        System.out.println(sortedArr);
    }
}
