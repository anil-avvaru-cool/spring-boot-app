package com.fm.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    // Field injection
//    @Autowired
    private PaymentService paymentService;

    public OrderService(){

    }
    // Constructor injection
    //@Autowired
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    // Setter injection
    //@Autowired
    public void SetPaymentService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
