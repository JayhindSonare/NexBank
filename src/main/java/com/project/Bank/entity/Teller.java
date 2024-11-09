package com.project.Bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teller {
	
	@Id
	private int tellerId;
	private String tellerName;
	private String password;
	private int capability;

	public String getTellerName() {
		return tellerName;
	}

	public void setTellerName(String tellerName) {
		this.tellerName = tellerName;
	}

	public int getTellerId() {
		return tellerId;
	}

	public void setTellerId(int tellerId) {
		this.tellerId = tellerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCapability() {
		return capability;
	}

	public void setCapability(int capability) {
		this.capability = capability;
	}

	@Override
	public String toString() {
		return "Teller [tellerId=" + tellerId + ", tellerName=" + tellerName + ", password=" + password
				+ ", capability=" + capability + "]";
	}

}
