package com.synechron.collections.list;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		List al = new Vector();
		//add the elements to the arraylist
		al.add(123);
		al.add("abcd");
		al.add(true);
		al.add('A');

		//total elemetns
		printCollection(al);
		System.out.println("inserting element at 0 index");
		al.add(0, "ARAVIND");
		printCollection(al);
		
		System.out.println("removing element at 0 index");
		al.remove(0);
		printCollection(al);
		
	}

	private static void printCollection(List al) {
		System.out.println("*******************************************");
		System.out.println("total elements in collection " + al.size());
		
			//print all elements
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println("Element at index " + i + " is " + al.get(i));
			
		}
		System.out.println("*******************************************");
	}
}
