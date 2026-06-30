package com.example.DemoApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
    PaymentProperties paymentProperties;

    PaymentGateway(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }
    // we can also set default value
//    @Value("${paymentGateway.type:Mobikwik}")
//    private String type;
//    @Value("${paymentGateway.retryCount}")
//    private int retryCount;

//    public PaymentGateway(@Value("${paymentGateway.type}")String type, @Value("${paymentGateway.retryCount}") int retryCount) {
//        this.type = type;
//        this.retryCount = retryCount;
//    }

//    public int getRetryCount() {
//        return retryCount;
//    }
//
//    public void setRetryCount(int retryCount) {
//        this.retryCount = retryCount;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
}
