package com.comp.cafe.vendor.ovenfresh.vendorserviceovenfresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ukilkil
 *
 */

/*
 * @SpringBootApplication - Tells the Spring Boot framework that this class is
 * the entry point for the Spring Boot service
 */
@SpringBootApplication

/*
 * @EnableDiscoveryClient - Tells the service that it should register itself
 * with a Eureka service discovery agent and that service calls are to use
 * service discovery to “lookup” the location of remote services
 */
@EnableDiscoveryClient

/*
 * @EnableCircuitBreaker - Enables the service to use the Hystrix and Ribbon
 * libraries
 */
//@EnableCircuitBreaker

public class VendorServiceOvenfreshApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorServiceOvenfreshApplication.class, args);
	}
}
