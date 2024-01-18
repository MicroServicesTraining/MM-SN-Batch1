package com.servicenow.apig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SnApigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnApigServiceApplication.class, args);
	}

}
