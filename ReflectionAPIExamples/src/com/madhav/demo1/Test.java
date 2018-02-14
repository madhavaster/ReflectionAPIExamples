package com.madhav.demo1;

import java.io.Serializable;

public class Test {

	public static void main(String[] args) {
		//how to get the class object of Employee
		//1st way
		try {
			Class c = Class.forName("com.madhav.demo1.Employee");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//2nd way
		Employee emp = new Employee();
		Class c1=emp.getClass();
		//3rd way
		Class c2=Employee.class;
	}

}

class Employee{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}