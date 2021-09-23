package com.flight.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	
	@GetMapping("/adminctrl")
	public String admin() {
		return "Admin controller";
	}
	
	@GetMapping("/forclient")
	public String forclient() {
		logger.info("Logging into forclient method {} and  {}" ,2,3);
		logger.error("Logging into Error forclient method {} and  {}" ,"ERROR FOUND",logger.getClass().getMethods());
		return "I'm from Admin Controller";
	}
	
}
