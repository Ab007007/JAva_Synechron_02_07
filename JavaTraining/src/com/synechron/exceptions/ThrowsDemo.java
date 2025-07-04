package com.synechron.exceptions;

import java.util.Scanner;

public class ThrowsDemo {

	
//	public static void divide100ByNum(int num)
//	{
//		try
//		{
//			System.out.println("Dividing the number by " + num);
//			int result = 100 / num;
//			System.out.println("Output : " + result);
//		}
//		catch(ArithmeticException ex)
//		{
//			System.out.println("Don't devide the number by 0");
//		}
//	}
	
	
	public static void divide100ByNum(int num) throws ArithmeticException, Exception
	{
		System.out.println("Dividing the number by " + num);
		int result = 100 / num;
		System.out.println("Output : " + result);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		Scanner sc = new Scanner(System.in);
		String choice;
		do
		{
			try
			{
				System.out.println("Enter valid integer to perform division ");
				int num = sc.nextInt();
				divide100ByNum(num);
			}
			catch(ArithmeticException ex)
			{
				System.out.println("ArithmeticException please check ur inputs");
			}
			catch(Exception ex)
			{
				System.out.println("Generic Exception");
			}
			finally {
				System.out.println("ALWAYS!!!!!!!!!!!!!!!!!!!!!!!!!");
			}
			
			System.out.println("do you want to continue... y/n");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("y"));
			System.out.println("Main Ended");
	}
}
