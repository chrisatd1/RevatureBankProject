package com.revature.revatureBank.model;
import javax.persistence.Entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "DOB")
	private Date dob;
	
	@Column(name = "phone_number")
	private long mobileNumber;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "street_address")
	private String address;
	
	private String password;
	
	public Customer() {
		
	}
	
	public Customer(long id, String name, Date dob, long mobileNumber, String emailId, String address,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.address = address;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
