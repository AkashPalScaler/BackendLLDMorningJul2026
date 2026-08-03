package com.scaler.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int maxsize;
    List<Object> items;

    public Store(int maxsize) {
        this.maxsize = maxsize;
        this.items = new ArrayList<>();
    }

    public Object getItem(){
        Object temp = items.remove(items.size()-1);
        System.out.println("Consumer consumed an item , current size" + items.size());
        return  temp;
    }

    public void addItem(Object item){
        System.out.println("Producer produced an item , current size" + items.size());
        items.add(item);
    }

    public int  getMaxsize() {
        return maxsize;
    }
    public int getCurrentSize() {
        return items.size();
    }
}
