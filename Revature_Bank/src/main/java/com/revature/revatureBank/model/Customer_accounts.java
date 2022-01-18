package com.revature.revatureBank.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_accounts")
public class Customer_accounts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "cust_id")
	private long custId;

	@Column(name = "acc_id")
	private long accId;
	
	@Column(name = "account_number")
	private long accountNumber;
	
	@Column(name = "balance")
	private double balance;
	
	@Column(name = "date_of_opening")
	private Date dateOfOpening;
	
	@Column(name = "status")
	private String status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public long getAccId() {
		return accId;
	}

	public void setAccId(long accId) {
		this.accId = accId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getDateOfOpening() {
		return dateOfOpening;
	}

	public void setDateOfOpening(Date dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer_accounts(long id, long custId, long accId, long accountNumber, double balance, Date dateOfOpening,
			String status) {
		super();
		this.id = id;
		this.custId = custId;
		this.accId = accId;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.dateOfOpening = dateOfOpening;
		this.status = status;
	}

	public Customer_accounts() {
		super();
	}

}
