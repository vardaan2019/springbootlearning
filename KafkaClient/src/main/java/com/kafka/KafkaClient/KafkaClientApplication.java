package com.kafka.KafkaClient;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaClientApplication {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	@Autowired
	private ListnerComp comp;

	public static void main(String[] args) {
		SpringApplication.run(KafkaClientApplication.class, args);
	}

	@GetMapping("v1/send/{topicname}")
	public String sendMessage(@PathVariable String topicname) throws InterruptedException {
		kafkaTemplate.send("baeldung", "new message by krishna kumar singh send");
		// listenGroupFoo();
		comp.getLatch().await(10, TimeUnit.SECONDS);
		return topicname;

	}

	
}
