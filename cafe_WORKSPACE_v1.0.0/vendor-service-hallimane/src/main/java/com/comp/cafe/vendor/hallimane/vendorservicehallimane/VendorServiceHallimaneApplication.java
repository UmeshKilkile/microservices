package com.comp.cafe.vendor.hallimane.vendorservicehallimane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ukilkil
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
public class VendorServiceHallimaneApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorServiceHallimaneApplication.class, args);
	}
}
