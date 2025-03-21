package com.ecom.Shipfast.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Shipfast.Entity.Orderentity;
import com.ecom.Shipfast.Service.Orderservice;



@CrossOrigin(allowedHeaders = "*")
@RestController
public class Ordercontroller {
	
	
	
	
	@Autowired
	private Orderservice service;
	
	
	@PostMapping("/add-order")
	public String Add(@RequestBody Orderentity Order)
	{
		
		System.out.println("controller called !");
		System.out.println(":took values from user ... passing to service");
		System.out.println("Step 1");
		return service.addOrder(Order);
	}
	
	
	

	
	
}
