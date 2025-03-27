package com.example.mapping.ServiceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mapping.Entity.School;
import com.example.mapping.Service.SchoolService;

import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
public class Schoolservicetest {
	
	@Autowired
	private SchoolService service;
	
//	
//	@Test
//	public void Addschooltest()
//	{
//		
//		//Arrange
//		School school=new School("RGV","GST454","State","Latur");
//		
//		//Act
//		String response=service.saveSchool(school);
//		
//		
//		//Assert
//		assertEquals("School  added !",response);
//		//assertNull(response);
//	}
//	
	
//	@Test
//	public void GetallschoolTest()
//	{
//		//Arrange
//		
//		School school=new School("RGV","GST454","State","Latur");
//		
//		School schoool2=new School("MGV","Gst123","Icse","solapur");
//		
//		
//		//Act
//		service.saveSchool(school);
//		service.saveSchool(schoool2);
//		
//		
//		//Assert
//		
//		List<School> response=service.getall();
//		
//		//assertFalse(response.isEmpty());
//		
//		assertEquals(2,response.size());
//		
//	}
//	
//	
//	@Test
//	public void getbynametest()
//	{
//		School school=new School("RGV","GST454","State","Latur");
//		
//		service.saveSchool(school);
//		
//		List<School> response=service.getschool("RGV");
//		
//		for(School res:response)
//		{
//			assertEquals("RGV", res.getSchoolName());
//		}
//		
//		
//	}

}
