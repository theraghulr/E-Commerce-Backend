package com.example.Ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);

		ApplicationContext ctx = SpringApplication.run(EcommerceApplication.class, args);
		Scanner sc = new Scanner(System.in);

		EcommerceApplication ref = ctx.getBean(EcommerceApplication.class);

		System.out.println("Hello, there");
	}



}
