package com.synechron.methods;

public class MethodsDemo
{
	public static void main(String[] args) 
	{
		MethodWithoutReturnType mr = new MethodWithoutReturnType();
		mr.sum(55, 55);
		mr.sum(22, 22);
		mr.sum(60, 6, 6);
		MethodWithoutReturnType.sum(22, 22, 22);
	}


}
