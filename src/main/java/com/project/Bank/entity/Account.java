package com.project.Bank.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Account {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountNumber;
	private String accountName;
	private String email;
	private String dateOfBirth;
	private String gender;
	private Long balance;
	
	

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", email=" + email
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", balance=" + balance + "]";
	}

	

}
