package com.synechron.strings;

public class StringDemo {

	
	public static void main(String[] args) {
		
		String str = "   Aravind is a Trainer  ";
		
//		String strObject = new String();
//		strObject = strObject.concat("abc");
//		System.out.println(strObject);
//		System.out.println(strObject.hashCode());
//		strObject = strObject.concat("123");
//		System.out.println(strObject);
//		System.out.println(strObject.hashCode());
//		
		
		System.out.println("str.charAt(0)--->  " + str.charAt(0));
		System.out.println("Index of a char -->  " + str.indexOf("v"));
		String[] words = str.split(" ");
		System.out.println(words[3]);
		System.out.println("Length function " + str.length());
		System.out.println("sub string  " + str.substring(0,5));
		System.out.println("sub string  " + str.substring(0,str.indexOf(" ")));
		System.out.println("Length afer removing space " + str.trim().length());
		System.out.println("Actual string : " + str);
		System.out.println("Lower : " + str.toLowerCase());
		System.out.println("Upper : " + str.toUpperCase());
		System.out.println("replace "  + str.replace("Aravind", "ARU"));
		
	
	}
}
