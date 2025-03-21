package com.ecom.Shipfast.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Shipfast.Entity.Employee;
import com.ecom.Shipfast.Service.EmployeeService;

@RestController
public class EmployeeController {

	
	
	@Autowired
	private EmployeeService service;
	
	
	@PostMapping("/add-emp")
	public String add(@RequestBody Employee emp)
	{
		return service.addemployee(emp);
		
	}
}
