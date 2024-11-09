package com.project.Bank.model;

import jakarta.persistence.Id;

public class DebitCreditModel {
	
	@Id
	private int accountNumber;
	private long amount;
	private String transactionType;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	
	@Override
	public String toString() {
		return "DebitCreditModel [accountNumber=" + accountNumber + ", amount=" + amount + ", transactionType="
				+ transactionType + "]";
	}
	
	
	
	
	
}
