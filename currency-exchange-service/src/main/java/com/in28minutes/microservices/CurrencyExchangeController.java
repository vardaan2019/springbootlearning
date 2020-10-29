package com.in28minutes.microservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.bean.ExcahngeValue;
import com.in28minutes.microservices.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ExchangeValueRepository repository;
	 
	@Autowired
	Environment env;
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExcahngeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		log.info("retrieveExchangeValue=== {}",from);
		ExcahngeValue exchangevalue=repository.findByFromAndTo(from, to);
		exchangevalue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return exchangevalue;
	}

}
