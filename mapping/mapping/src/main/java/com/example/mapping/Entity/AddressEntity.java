package com.example.mapping.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class AddressEntity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int addid;
	String city;
	String pincode;
	String locality;
	String landmark;
	
	
	
	
	@OneToMany(mappedBy="address")
	@JsonManagedReference
	private List<School> school;
	
	
	
	public AddressEntity(int addid, String city, String pincode, String locality, String landmark,
			List<School> school) {
		super();
		this.addid = addid;
		this.city = city;
		this.pincode = pincode;
		this.locality = locality;
		this.landmark = landmark;
		this.school = school;
	}
	public AddressEntity(int addid, String city, String pincode, String locality, String landmark) {
		super();
		this.addid = addid;
		this.city = city;
		this.pincode = pincode;
		this.locality = locality;
		this.landmark = landmark;
	}
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	public AddressEntity()
	{
		
	}
	

}
