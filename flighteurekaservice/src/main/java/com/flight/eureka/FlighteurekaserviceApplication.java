package com.flight.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FlighteurekaserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlighteurekaserviceApplication.class, args);
	}

}
