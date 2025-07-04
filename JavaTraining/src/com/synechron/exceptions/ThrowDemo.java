package com.synechron.exceptions;

import java.util.Scanner;


public class ThrowDemo 
{
	public static int balance = 10000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice ;
		int tempBalance;
		do {
			tempBalance = balance;
			System.out.println("Please enter the amount you want to withdraw");
			int amount = sc.nextInt();
			tempBalance = tempBalance - amount;
			if(tempBalance < 0)
			{
				try {
					throw new BalanceInsufficientException(balance);
				}
				catch(BalanceInsufficientException ex)
				{
					System.out.println("Insufficient Balance");
				}
			}
			else
			{
				balance = tempBalance;
			}
			
			System.out.println("your new balance is : " + balance);
			System.out.println("Do you want to continue one more transaction ? y/n");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("y"));
	}

}
