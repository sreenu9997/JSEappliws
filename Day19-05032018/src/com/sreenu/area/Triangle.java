package com.sreenu.area;

public class Triangle {

	
	int l;
	int b;
	int h;
	private Triangle(int a, int b, int c) {
	this.l = a;
	this.b = b;
	this.h= c;
		
	}
	
	int area(){
		int result =  l*b*h;
		return result;
	}
}
