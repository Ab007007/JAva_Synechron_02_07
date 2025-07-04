package com.synechron.interfaces;

public class Triiangle extends Geometry
{
	
	int b = 10;
	int h  = 5;
	
	@Override
	void area() {
		System.out.println("Area of triangle is " + (.5 * b * h));
		
	}
	
	public static void main(String[] args) {
		new Triiangle().area();
	}

}
