package com.comp.cafe.priceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
 * @SpringBootApplication - Tells the Spring Boot framework that this class is the entry point for the
 * Spring Boot service
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PriceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceServiceApplication.class, args);
	}
}
