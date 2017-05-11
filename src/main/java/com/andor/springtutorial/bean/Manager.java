package com.andor.springtutorial.bean;

import java.util.List;

public class Manager {
	private List<Employee> listEmployee;
	private String name;
	private String designation;

	public Manager(String name, String designation, List<Employee> listEmployees) {
		this.name = name;
		this.designation = designation;
		this.listEmployee = listEmployees;
	}
	public Manager() {
	}
	public List<Employee> getListEmployee() {
		return listEmployee;
	}

	public void setListEmployee(List<Employee> listEmployee) {
		this.listEmployee = listEmployee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "\nManager Details:\n name:" + name + "\n designation:"
				+ designation + "\n list of employing under:\n" + listEmployee;
	}
}
