package com.synechron.inheritence;

import com.synechron.basics.Person;

public class Employee extends Person {
	
	String employeeName;
	String employeeID;
	String employeeEmial;
	
	Employee() {
		System.out.println("Default constructor");
	}
	
	
	public Employee(String name, String id, String email)
	{
		this.employeeName = name;
		this.employeeID = id;
		this.employeeEmial = email;
	}

	public Employee(String name, String id, String email, int age, double height, double weight)
	{
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.employeeName = name;
		this.employeeID = id;
		this.employeeEmial = email;
	}
	

	public String toString() {
		return super.toString() + "Emplyee info : \n ------------------\n Employee name " + this.employeeName + 
				"\n Employee ID " + this.employeeID + "\n Employee Email " + this.employeeEmial
				+ "\n============================================";
	}

}
