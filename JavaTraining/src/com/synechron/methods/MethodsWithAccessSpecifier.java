package com.synechron.methods;

public class MethodsWithAccessSpecifier {

	
	private int sum(int a , int b)
	{
		int sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is " + sum);
		return sum;
	}
	
	private String sum(String a , String b)
	{
		String sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is " + sum);
		return sum;
	}
	
	
	int sum(int a,int b,int c)
	{
		int sum = a + b + c;
		System.out.printf("a = %d, b = %d, c = %d, sum = %d \n",  a, b, c , sum );
		return sum;
	}
	
	protected int sum(int a , int b,int a1 , int b1)
	{
		int sum = a + b + a1 + b1;
		System.out.printf("a = %d, b = %d, c = %d, d = %d, sum = %d \n",  a, b, a1 , b1 , sum );
		return sum;
	}
	
	public int sum(int a)
	{
		int sum = a ;
		System.out.println("Sum of " + a + " is " + sum);
		return sum;
	}
	
}
