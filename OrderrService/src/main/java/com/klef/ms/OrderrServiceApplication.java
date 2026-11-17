package com.klef.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@EnableDiscoveryClient
public class OrderrServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderrServiceApplication.class, args);
		System.out.println("Order Service is running");
	}

}
