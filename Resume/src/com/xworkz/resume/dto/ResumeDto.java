package com.xworkz.resume.dto;

public class ResumeDto {
	private String name;
	private String email;
	private String degree;
	private String FatherName;
	private int phoneNumber;
	private String dateOfBirth;
	AddressDto address;
	
	
	public ResumeDto(String name, String email, String degree, String fatherName, int phoneNumber, String dateOfBirth,
			AddressDto address) {
		super();
		this.name = name;
		this.email = email;
		this.degree = degree;
		FatherName = fatherName;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}


	@Override
	public String toString() {
		return "ResumeDto [name=" + name + ", email=" + email + ", degree=" + degree + ", FatherName=" + FatherName
				+ ", phoneNumber=" + phoneNumber + ", dateOfBirth=" + dateOfBirth + ", address=" + address + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getFatherName() {
		return FatherName;
	}


	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public AddressDto getAddress() {
		return address;
	}


	public void setAddress(AddressDto address) {
		this.address = address;
	}
}
	
	
	
	
	
	
