package com.sreenu.area;


public class Circletest {

	
	public static void main(String[] args) {
		
		
		Circle circle = new Circle(6);
		float res = circle.area();
		System.out.println(res);
		
		
		
		Circle cr = new Circle();
		cr.r = 25;
		float result = cr.area();
		System.out.println(result);
	}
}
