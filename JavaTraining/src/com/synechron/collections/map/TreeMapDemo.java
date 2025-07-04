package com.synechron.collections.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	
	public static void main(String[] args) {
		
		Map mp = new TreeMap();
		mp.put("name", "Aravind");
		mp.put("age", 42);
		mp.put("location", "Bangalore");
		
		System.out.println("Total elements of a Set " + mp.size());
		
		printCollection(mp);
	}
	
	private static void printCollection(Map mp) {
		System.out.println("*******************************************");
		Set keys = mp.keySet();
		Iterator it  =  keys.iterator();
		while(it.hasNext())
		{
			String key = it.next().toString();
			System.out.println(key + " : " + mp.get(key));
		}
		System.out.println("*******************************************");
	}
}
