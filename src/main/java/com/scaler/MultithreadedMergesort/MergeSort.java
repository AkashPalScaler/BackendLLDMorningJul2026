package com.scaler.MultithreadedMergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {
    List<Integer> arrToSort;
    ExecutorService pool;
    public  MergeSort(List<Integer> arrToSort, ExecutorService pool) {
        this.arrToSort = arrToSort;
        this.pool = pool;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrToSort.size() == 1) {
            return arrToSort;
        }
        List<Integer> leftArr = new ArrayList<>();
        List<Integer> rightArr = new ArrayList<>();

        int mid = arrToSort.size() / 2;

        for(int i = 0; i < mid; i++) {
            leftArr.add(arrToSort.get(i));
        }
        for(int i = mid; i < arrToSort.size(); i++) {
            rightArr.add(arrToSort.get(i));
        }

        Future<List<Integer>> leftSortedArrayFuture = pool.submit(new MergeSort(leftArr, pool));
        Future<List<Integer>> rightSortedArrayFuture = pool.submit(new MergeSort(rightArr, pool));

        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

        List<Integer> sortedArray = merge(leftSortedArray, rightSortedArray);
        return sortedArray;
    }

    // Merging the two sorted arrays
    public List<Integer> merge(List<Integer> sortedLeftArray, List<Integer> sortedRightArray){
        int i= 0; // start of left
        int j = 0; //start of right

        ArrayList<Integer> sortedArray = new ArrayList();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;
    }
}
