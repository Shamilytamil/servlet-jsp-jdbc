package com.shamily;

import java.util.UUID;

public class User {
	
	
	private UUID uuid;
	

	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private double phoneNo;
	private String city;
	
	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Double getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Double phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
}
