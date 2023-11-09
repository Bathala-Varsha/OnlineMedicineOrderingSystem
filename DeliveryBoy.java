package com.medicine.entity;
import jakarta.persistence.Entity;


import jakarta.persistence.Id;
@Entity
public class DeliveryBoy {
	@Id
	private String loginid;
	private String password;
	
	//getters and setters
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
