package com.synechron.interfaces;

public class Circle extends Geometry
{
	int radius = 5;
	final double PI = 2.147;
	
	@Override
	void area() {
		System.out.println("Area of the circle is " + (PI * radius* radius));
		
	}
	
	public static void main(String[] args) {
		new Circle().area();
	}

}
