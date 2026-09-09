package com.scaler.DesignPatterns.Observer;

public class Amazon {
    public static void main(String[] args) {
        OrderService  orderService = new OrderService();
        EmailNotificationService emailNotificationService = new EmailNotificationService(orderService);
        InvoiceService invoiceService = new InvoiceService(orderService);
        orderService.onOrderPlaced(new Order());

    }
}
