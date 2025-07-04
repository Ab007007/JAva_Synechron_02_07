package com.synechron.basics;

public class PersonManager {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.name = "Shrihari";
		p1.age =35;
		p1.height = 5.2;
		p1.weight = 85;
		
		p2.name = "Anil";
		p2.age =32;
		p2.height = 5.7;
		p2.weight = 55;
		
		p3.name = "Neha";
		p3.age =38;
		p3.height = 5.5;
		p3.weight = 85;
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
