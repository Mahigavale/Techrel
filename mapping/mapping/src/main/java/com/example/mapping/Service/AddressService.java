package com.example.mapping.Service;

import org.springframework.stereotype.Service;

import com.example.mapping.Entity.AddressEntity;
import com.example.mapping.Repository.AddressRepo;

@Service
public class AddressService {
	
	
	private AddressRepo repo;
	
	public AddressService( AddressRepo repo)
	{
		this.repo=repo;
	}

	
	
	public String addadd( AddressEntity entity)
	{
		
		repo.save(entity);
		
		return "done!";
	}
	
	public AddressEntity getid(int id)
	{
		return repo.findById(id).get()
				;
	}
	
	
}
