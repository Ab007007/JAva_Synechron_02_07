package com.synechron.collections.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.synechron.basics.Person;

public class ArrayListPersonDemo {

	public static void main(String[] args) {
		
		List<Person> al = new ArrayList<Person>();
		//add the elements to the arraylist
		
		al.add(new Person("Aravind",22,70,5.8));
		al.add(new Person("Anil",22,70,5.8));
		al.add(new Person("Praveen",22,70,5.8));
		al.add(new Person("Priyanka",22,70,5.8));
		al.add(new Person("Shrihari",22,70,5.8));
		
		printCollection(al);
	}

	private static void printCollection(List al) {
		System.out.println("*******************************************");
			//print all elements
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println("Element at index " + i + " is " + al.get(i));
			
		}
		System.out.println("*******************************************");
	}
}
