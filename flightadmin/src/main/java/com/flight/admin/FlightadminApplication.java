package com.flight.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FlightadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightadminApplication.class, args);
	}

}
