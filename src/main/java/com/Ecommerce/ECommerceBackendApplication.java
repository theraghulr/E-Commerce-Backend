package com.Ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext; 
import java.util.Scanner;

@SpringBootApplication
public class ECommerceBackendApplication {

	public static void main(String[] args) {
		// Start the Spring Boot application and return the application context
		ApplicationContext ctx = SpringApplication.run(ECommerceBackendApplication.class, args);

		Scanner sc = new Scanner(System.in);

		// Get the main application bean (only needed if you have logic in this class)
		ECommerceBackendApplication app = ctx.getBean(ECommerceBackendApplication.class);

		System.out.println("Application started");
	}
}

