package com.synechron.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

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
		
		
		al.add(123);
		al.add("abcd");
		al.add(true);
		al.add('A');
		al.add(0, "ARAVIND");
		printCollection(al);
		
	}

	private static void printCollection(List al) {
		System.out.println("*******************************************");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("*******************************************");
	}
}
