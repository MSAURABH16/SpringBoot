package com.example.DemoApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
//		PaymentProperties paymentProperties = context.getBean(PaymentProperties.class);
//		paymentProperties.print();
//		paymentGateway.setType("PayTm");
//		paymentGateway.setRetryCount(3);
//		System.out.println(paymentGateway.getType());
//		paymentGateway.getRetryCount();
	}

}
