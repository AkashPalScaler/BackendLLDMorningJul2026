package com.scaler.DesignPatterns.Observer;

public interface Subscriber {
    void sendNotification(Order order); // equivalent of a webhook of on ordered place
}
