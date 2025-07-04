package com.synechron.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	
	public static void main(String[] args) {
		
		Set s = new LinkedHashSet();
		s.add("abcd");
		s.add("abcd");
		s.add("abcd");
		s.add("cd");
		s.add("xy");
		s.add("pq");
		s.add("mn");
		System.out.println("Total elements of a Set " + s.size());
		
		printCollection(s);
	}
	
	private static void printCollection(Set s) {
		System.out.println("*******************************************");
		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("*******************************************");
	}
}
