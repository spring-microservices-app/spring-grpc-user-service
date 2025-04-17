package com.example.stockplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringGrpcUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGrpcUserServiceApplication.class, args);
	}

}
