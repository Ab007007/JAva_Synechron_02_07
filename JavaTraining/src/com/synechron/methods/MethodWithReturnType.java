package com.synechron.methods;

public class MethodWithReturnType {

	public int sum(int a , int b)
	{
		int sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is " + sum);
		return sum;
	}
	
	public static int sum(int a,int b,int c)
	{
		int sum = a + b + c;
		System.out.printf("a = %d, b = %d, c = %d, sum = %d \n",  a, b, c , sum );
		return sum;
	}
}
