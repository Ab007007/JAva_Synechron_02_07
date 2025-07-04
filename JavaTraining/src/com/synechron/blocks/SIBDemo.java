package com.synechron.blocks;

public class SIBDemo 
{
	static 
	{
		System.out.println("i'm executing before main-1");
	}
	
	static 
	{
		System.out.println("i'm executing before main-2");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("main started");
		
		System.out.println("main ended");
	}

}
