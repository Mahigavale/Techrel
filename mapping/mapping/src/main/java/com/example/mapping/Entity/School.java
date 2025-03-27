package com.example.mapping.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="School_Table")
public class School {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int schoolId;
	
	@Column(name="School_Name")
	String schoolName;
	
	String gstNumber;
	
	String schoolBoard;
	
	//String schoolAddress;
	
	@JoinColumn(name="addid")
	@ManyToOne
	@JsonBackReference
	AddressEntity address;

	public School(int schoolId, String schoolName, String gstNumber, String schoolBoard, AddressEntity address) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.gstNumber = gstNumber;
		this.schoolBoard = schoolBoard;
		this.address = address;
	}

	
	public School()
	{
		
	}


	public int getSchoolId() {
		return schoolId;
	}


	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public String getGstNumber() {
		return gstNumber;
	}


	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}


	public String getSchoolBoard() {
		return schoolBoard;
	}


	public void setSchoolBoard(String schoolBoard) {
		this.schoolBoard = schoolBoard;
	}


	public AddressEntity getAddress() {
		return address;
	}


	public void setAddress(AddressEntity address) {
		this.address = address;
	}

}
