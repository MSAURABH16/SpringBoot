package com.example.SpringCoreDemoApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringCoreDemoApplication.class, args);

		OrderService order = context.getBean(OrderService.class);
		order.placeOrder();
	}

}
