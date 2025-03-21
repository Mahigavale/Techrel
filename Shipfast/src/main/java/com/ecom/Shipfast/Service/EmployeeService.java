package com.ecom.Shipfast.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Shipfast.Entity.Employee;
import com.ecom.Shipfast.Repo.Employeerepo;

@Service
public class EmployeeService {
	
	@Autowired
	private Employeerepo repo;
	
	
	public String addemployee(Employee emp)
	{
		repo.save(emp);
		
		
		return "done:";
	}

}
