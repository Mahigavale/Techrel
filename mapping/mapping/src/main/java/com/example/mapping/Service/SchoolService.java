package com.example.mapping.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mapping.Entity.School;
import com.example.mapping.Repository.Schoolrepo;

@Service
public class SchoolService {
	
	
	private Schoolrepo repo;
	
	public SchoolService(Schoolrepo repo)
	{
		
		this.repo=repo;
	}

	
	
	public String saveSchool(School school)
	{
//		
//		if(school==null)
//		{
//			throw new Exception("Error");
//		}
	
		repo.save(school);
		
		return "School  added !";
	}
	
	
	
	public List<School> getschool(String name)
	{
		return repo.getbyName(name);
		
	}
	
	
	public List<School> getall()
	{
		return repo.findAll();
	}
}
