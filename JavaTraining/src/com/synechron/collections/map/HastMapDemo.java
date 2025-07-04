package com.synechron.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HastMapDemo {

	
	public static void main(String[] args) {
		
		Map mp = new HashMap();
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
