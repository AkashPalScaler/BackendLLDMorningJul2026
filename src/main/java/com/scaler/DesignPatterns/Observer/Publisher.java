package com.scaler.DesignPatterns.Observer;

import java.util.Observer;

public interface Publisher {
    void publishAll(Order order);
    void registerSubscriber(Subscriber subscriber);
    void unregisterSubscriber(Subscriber subscriber);
}
