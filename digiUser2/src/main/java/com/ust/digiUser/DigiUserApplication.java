package com.ust.digiUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

@EnableDiscoveryClient
public class DigiUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigiUserApplication.class, args);
	}

}
