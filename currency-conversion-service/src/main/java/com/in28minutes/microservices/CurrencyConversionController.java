package com.in28minutes.microservices;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.in28minutes.microservices.bean.CurrencyConversionBean;
import com.in28minutes.microservices.feignclient.CurrencyExchangeServiceProxy;

@RestController
public class CurrencyConversionController {
	Logger log=LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CurrencyExchangeServiceProxy proxy;

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyConversionBean> response = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,
				uriVariables);
		CurrencyConversionBean body = response.getBody();
		body.setQuantity(quantity);
		log.info("convertCurrency --------------------{}",to);
		return new CurrencyConversionBean(body.getId(), body.getFrom(), body.getTo(), body.getConversionMutilple(),
				quantity, body.getPort(), quantity.multiply(body.getConversionMutilple()));

	}

	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrencyfeign(@PathVariable("from") String from, @PathVariable("to") String to,
			@PathVariable BigDecimal quantity) {
		CurrencyConversionBean body=proxy.retrieveExchangeValue(from, to);;
		body.setQuantity(quantity);
		return new CurrencyConversionBean(body.getId(), body.getFrom(), body.getTo(), body.getConversionMutilple(),
				quantity, body.getPort(), quantity.multiply(body.getConversionMutilple()));

	}

}
