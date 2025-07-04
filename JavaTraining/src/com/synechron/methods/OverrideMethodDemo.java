package com.synechron.methods;

public class OverrideMethodDemo extends OverridingDemo
{
	
	void test() 
	{
		System.out.println("Child class OverrideMethodDemo");
	}
	
	public static void main(String[] args) {
		OverridingDemo od = new OverridingDemo();
		OverrideMethodDemo omd = new OverrideMethodDemo();
		System.out.println("Output from parent");
		od.test();
		
		System.out.println("output from child");
		omd.test();
	}

}
