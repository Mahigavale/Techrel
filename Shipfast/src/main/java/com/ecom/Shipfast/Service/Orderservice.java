package com.ecom.Shipfast.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ecom.Shipfast.Entity.Orderentity;
import com.ecom.Shipfast.Repo.Orderrepo;

@Service
public class Orderservice {
	
	
	
	@Autowired
	private Orderrepo repo;
	
	public String addOrder(Orderentity Order)
	{
		
		
		System.out.println("recieved values from controller...");
		System.out.println(Order.getName());
		System.out.println("adding to db");
		repo.save(Order);
		System.out.println("Value added in side the db");
		System.out.println("step 2");
		return "sucessfull:";
		
		
	}
	
	
	public String getOrderbyid(int id)
	{
		return id+"found";
	}
	
	
	
	public String modifyorder()
	{
		return "order modified !";
	}
	
	
	public String deleteOrder(int id)
	{
		return "order deleted:"+id;
	}
}
