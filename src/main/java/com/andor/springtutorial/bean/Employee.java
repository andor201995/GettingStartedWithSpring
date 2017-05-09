package com.andor.springtutorial.bean;

import java.util.Map;

public class Employee {
	private String name;
	private String phNumber;
	private Address address;
	private Map<String ,Object> otherInfo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Map<String, Object> getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(Map<String, Object> otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	
	
	
}
