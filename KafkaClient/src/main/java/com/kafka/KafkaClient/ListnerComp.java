package com.kafka.KafkaClient;

import java.util.concurrent.CountDownLatch;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListnerComp {
	private CountDownLatch latch = new CountDownLatch(1);
	
	@KafkaListener(topics = "baeldung", groupId = "foo" ,containerFactory = "fooKafkaListenerContainerFactory")
	public void listenGroupFoo(String message) {
		System.out.println("Received Message in group foo: " + message);
		latch.countDown();
	}

	public CountDownLatch getLatch() {
		return latch;
	}
	




}
