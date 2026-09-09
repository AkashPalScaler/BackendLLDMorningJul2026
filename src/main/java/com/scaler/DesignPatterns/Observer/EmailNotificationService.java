package com.scaler.DesignPatterns.Observer;

public class EmailNotificationService implements Subscriber{
    OrderService orderService;
    public EmailNotificationService(OrderService orderService) {
        this.orderService = orderService;
        orderService.subscribers.add(this);
    }
    @Override
    public void sendNotification(Order order) {
        // As soon as any order is placed this function gets called
        // Send email logic
        System.out.println("Email Notification Service called as order is placed");
    }

    // 10 other functions and other interfaces
}
