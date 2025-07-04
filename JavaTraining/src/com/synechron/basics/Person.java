package com.synechron.basics;

public class Person {
	public String name ;
	public int age;
	public double height;
	public double weight;
	public static String country="INDIA";

	
	public String toString() {
	String value = "This is Person class Object with below values\n"
			+ "\nName =" + this.name
			+ "\nAge =" + this.age
			+ "\nHeight =" + this.height
			+ "\nWeight =" + this.weight
			+ "\nCountry =" + country + " \n\n";
		return value;
	}


	public void canSpeakRegionalLanguage() {
		// TODO Auto-generated method stub
		
	}
}
