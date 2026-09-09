package com.scaler.DesignPatterns.Observer;

public class InvoiceService implements Subscriber{
    OrderService orderService;

    public InvoiceService(OrderService orderService) {
        this.orderService = orderService;
        orderService.registerSubscriber(this);
    }


    @Override
    public void sendNotification(Order order) {
        // On order placed - invoice generation logics
        System.out.println("Invoice Notification Service called as order is placed");
    }
}
