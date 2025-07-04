package com.synechron.constructors;

public class Employee {
	
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
	

	public String toString() {
		return "Emplyee info : \n ------------------\n Employee name " + this.employeeName + 
				"\n Employee ID " + this.employeeID + "\n Employee Email " + this.employeeEmial
				+ "\n============================================";
	}

}
