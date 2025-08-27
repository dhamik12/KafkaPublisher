package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.telusko.model.Customer;
import com.telusko.util.AppConstants;

@Service
public class KafkaService {
	
	@Autowired
	private KafkaTemplate<String,Customer> kafkaTemplate;
	
	
	public String addCustomerMsg (Customer customer) {
		
		
		kafkaTemplate.send(AppConstants.TOPIC_NAME, customer);
		System.out.println("Publisher Service method is running..");
		return "Customer data added in kafka server";
		
		
		
	}

}
