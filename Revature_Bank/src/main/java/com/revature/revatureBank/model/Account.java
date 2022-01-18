package com.revature.revatureBank.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {
	@Column(name = "Saving")
	private String saving;

	@Column(name = "Current")
	private double current;
	
	@Column(name = "Deposit")
	private double deposit;
	
	@Column(name = "Loan_amount")
	private double loanAmount;

	public String getSaving() {
		return saving;
	}

	public void setSaving(String saving) {
		this.saving = saving;
	}

	public double getCurrent() {
		return current;
	}

	public void setCurrent(double current) {
		this.current = current;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Account(String saving, double current, double deposit, double loanAmount) {
		super();
		this.saving = saving;
		this.current = current;
		this.deposit = deposit;
		this.loanAmount = loanAmount;
	}

	public Account() {
		super();
	}
	

}
