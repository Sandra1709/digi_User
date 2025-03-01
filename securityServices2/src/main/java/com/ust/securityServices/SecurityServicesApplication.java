package com.ust.securityServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SecurityServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityServicesApplication.class, args);
	}

}
