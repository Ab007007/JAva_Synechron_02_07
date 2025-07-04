package com.synechron.exceptions;

public class ExceptionsDemo {

	
	public static void main(String[] args) {
		System.out.println("Main Started");
		try
		{
			int result = 100 / 0;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Dont devide the number by 0");
		}
		System.out.println("Main Ended");
		
	}
}
