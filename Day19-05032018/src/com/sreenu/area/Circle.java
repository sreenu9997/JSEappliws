package com.sreenu.area;

public class Circle {

	
	int r;
	float i= 3.14f;
	public Circle() {
		
	}
	
	Circle(int r){
		this.r =r;
			}
	
	float area() {
		float result = i*r*r;
		return result;
	}
}
