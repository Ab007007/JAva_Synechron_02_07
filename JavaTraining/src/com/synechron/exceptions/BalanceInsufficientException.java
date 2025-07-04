package com.synechron.exceptions;

public class BalanceInsufficientException extends Exception
{
	
	public BalanceInsufficientException() {
		System.out.println("Your balance is too low");
	}
	
	public BalanceInsufficientException(int balance) {
		System.out.println("Your balance is low, you have only " + balance + "  in your account");
	}
}
