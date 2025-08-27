package com.telusko.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Customer;
import com.telusko.service.KafkaService;

@RestController
public class CustomerRestController {
	
	@Autowired
	private KafkaService service;
	
	
	@PostMapping("/add-cus")
	public String addCustomer(@RequestBody Customer customer) {
		System.out.println("Publisher Controller method is running..");
		return service.addCustomerMsg(customer);
		
		
	}

}
