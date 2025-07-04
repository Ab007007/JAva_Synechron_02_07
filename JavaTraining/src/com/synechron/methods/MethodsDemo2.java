package com.synechron.methods;

public class MethodsDemo2
{
	public static void main(String[] args) 
	{
		MethodWithReturnType mr = new MethodWithReturnType();
		int num1 = mr.sum(55, 55);
		int num2 = mr.sum(22, 22);
		int num3 = mr.sum(60, 6, 6);
		int num4 = MethodWithReturnType.sum(22, 22, 22);
		
		System.out.println("Sum of all sums is " + (num1 + num2 + num3 + num4 ));
	}


}
