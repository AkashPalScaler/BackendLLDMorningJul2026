package com.scaler.DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class OrderService implements Publisher {
    List<Subscriber> subscribers;

    public OrderService() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void publishAll(Order order) {
        for(Subscriber subscriber : subscribers){
            subscriber.sendNotification(order);
        }
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unregisterSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    void onOrderPlaced(Order order){
        // Other logic critical to onOrderPlaced
        publishAll(order);
    }
}
