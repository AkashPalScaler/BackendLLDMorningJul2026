package com.scaler.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Store {
    int maxsize;
    List<Object> items;
    Lock lock = new ReentrantLock();

    public Store(int maxsize) {
        this.maxsize = maxsize;
        this.items = new ArrayList<>();
    }

    public Object getItem(){
        lock.lock();
        Object temp = items.remove(items.size()-1);
        System.out.println("Consumer consumed an item , current size" + items.size());
        lock.unlock();
        return  temp;
    }

    public void addItem(Object item){
        lock.lock();
        System.out.println("Producer produced an item , current size" + items.size());
        items.add(item);
        lock.unlock();
    }

    public int  getMaxsize() {
        return maxsize;
    }
    public int getCurrentSize() {
        return items.size();
    }
}
