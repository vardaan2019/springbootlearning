package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.LimitConfiguration;
import com.in28minutes.microservices.limitsservice.config.Configuration;

@RestController
public class LimitsConfigurationController {
	@Autowired
	private Configuration config;
	@GetMapping("/limits")
	public LimitConfiguration retrivelLimitsFromConfiguration() {
		return new LimitConfiguration(config.getMin(),config.getMax());
	}

}
