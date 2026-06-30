package com.example.SpringCoreDemoApplication;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    PaymentService service;
    OrderService(PaymentService service){
        this.service=service;
    }
    void placeOrder(){
        service.pay();
        System.out.println("Order Placed");
    }
}
