package com.example.mapping.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.Entity.AddressEntity;
import com.example.mapping.Service.AddressService;

@RequestMapping("/address")
@RestController
public class AddressController {
	
	
	
	private AddressService service;
	
	
	public AddressController(AddressService service)
	{
		 this.service=service;
	}
	
	
	@PostMapping("/add-add")
	public String add(@RequestBody AddressEntity entity)
	{
		
		return service.addadd(entity);
	}
	
	@GetMapping("/get-with-id/{id}")
	public AddressEntity getyid(@PathVariable("id") int id)
	{
		
		return service.getid(id);
	}

}
