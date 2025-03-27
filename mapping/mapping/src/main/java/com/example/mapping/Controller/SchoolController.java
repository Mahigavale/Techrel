package com.example.mapping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.Entity.School;
import com.example.mapping.Service.SchoolService;

@RestController
@RequestMapping("/School")
public class SchoolController {
	
	@Autowired
	private SchoolService service;
	
	
	@PostMapping("/add-school")
	public String addschool(@RequestBody School school ) throws Exception
	{
		return service.saveSchool(school);
	}
	
	@GetMapping("/get-all")
	public List<School> getallschool(@RequestParam String name)
	{
		return service.getschool(name);
	}

}
