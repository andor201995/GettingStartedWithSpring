package com.andor.springtutorial.bean;

import java.util.Map;

public class Employee {
	private String name;
	private Long phNumber;
	private Address address;
	private Map<String, Object> otherInfo;
	
	public Employee(String name ,Long phNumber ,Address address ,Map<String,Object> otherInfo) {
		this.name=name;
		this.phNumber=phNumber;
		this.address=address;
		this.otherInfo=otherInfo;
	}
	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(Long phNumber) {
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

	@Override
	public String toString() {
		return "\nEmployee Details:\n"+name+"\n"+phNumber+"\n"+address+"\n"+otherInfo+"\n";
	}

}
