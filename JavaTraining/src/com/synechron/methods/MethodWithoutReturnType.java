package com.synechron.methods;

public class MethodWithoutReturnType {

	public void sum(int a , int b)
	{
		System.out.println("Sum of " + a + " and " + b + " is " + (a+b));
	}
	
	public static void sum(int a,int b,int c)
	{
		int sum = a + b + c;
		System.out.printf("a = %d, b = %d, c = %d, sum = %d \n",  a, b, c , sum );
	}
}
