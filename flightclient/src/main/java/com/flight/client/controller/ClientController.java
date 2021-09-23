package com.flight.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/clictrl")
	public String Client() {

		return "I'm Client Controller";
	}

	@GetMapping("/tocalladmin")
	public String tocalladmin() {

		// return "Calling Admin Controller";

		String url = "http://flight-admin/admin/forclient";
		return restTemplate.getForObject(url, String.class);

	}

}
