package com.synechron.strings;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Aravind is a Trainer");
//		str.append("abc");
//		System.out.println(str.hashCode());
//		System.out.println(str);
//		str.append("123");
//		System.out.println(str.hashCode());
//		System.out.println(str);
		
		
		//Replce : ARAVIND is a Trainer SSSSS
		
		System.out.println("Insert : " + str.insert(str.length(), " SSSSS"));
		System.out.println("reverse : " + str.reverse());
		System.out.println("reverse : " + str.reverse());
		System.out.println("Replce : " + str.replace(0, 7, "ARAVIND"));
		System.out.println("Delete : " + str.delete(str.indexOf("S"),str.length()));
		
		System.out.println("str.charAt(0)--->  " + str.charAt(0));
		System.out.println("Index of a char -->  " + str.indexOf("v"));
		System.out.println("Last Index of a char -->  " + str.lastIndexOf("v"));
		System.out.println("Length function " + str.length());
		System.out.println("sub string  " + str.substring(0,5));
		System.out.println("sub string  " + str.substring(0,str.indexOf(" ")));
		System.out.println("Actual string : " + str);
		

	}

}
