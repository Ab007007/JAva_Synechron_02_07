package com.synechron.inheritence;

public class EmployeeManager {

	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Priyanka", "Syn123", "priyanka@synechron.com",26,5.5,45);
		Employee e2 = new Employee("Neha", "Syn124", "Neha@synechron.com",26,5.5,45);
		Employee e3 = new Employee("Anitha", "Syn125", "Anitha@synechron.com",26,5.5,45);
		Employee e4 = new Employee("Yamini", "Syn126", "Yamini@synechron.com",26,5.5,45);
		
		Employee e5 = new Employee();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		
	}
}
