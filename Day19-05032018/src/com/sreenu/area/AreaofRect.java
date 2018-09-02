package com.sreenu.area;

public class AreaofRect {

	
	
	public AreaofRect(int a, int b) {
	
	this.a = a;
	this.b = b;
		
	}
	
	public AreaofRect() {
	
	}
	
	
	int a;
	int b;
	
	int areaofRectangle() {
		int result = (a * b)/2;
		return result;
	}	
}
