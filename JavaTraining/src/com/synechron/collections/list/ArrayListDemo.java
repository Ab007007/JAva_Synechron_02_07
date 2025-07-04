package com.synechron.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List al = new ArrayList();
		//add the elements to the arraylist
		al.add(123);
		al.add("abcd");
		al.add(true);
		al.add('A');

		//retrieve the elements 
		System.out.println(al.get(0));
		
		//total elemetns
		System.out.println(al.size());
		
		printCollection(al);
		
		al.add(0, "ARAVIND");
		
		
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
