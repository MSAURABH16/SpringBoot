package com.example.DemoApplication;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements ApplicationRunner {
    PaymentGateway paymentGateway;

    public DemoRunner(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        paymentGateway.paymentProperties.print();
    }
}

/*
ApplicationRunner interface give a run method that is called automatically when SpringBoot application is started
 */
