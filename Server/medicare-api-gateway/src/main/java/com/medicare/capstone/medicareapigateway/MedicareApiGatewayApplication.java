package com.medicare.capstone.medicareapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class MedicareApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicareApiGatewayApplication.class, args);
	}

}
