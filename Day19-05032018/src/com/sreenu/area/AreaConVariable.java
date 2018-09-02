package com.sreenu.area;

public class AreaConVariable {

	public AreaConVariable(int a) {
		this.a = a;
	System.out.println(a);
	}
	int a ;
	
	int area() {
		int result = a *a;
		return result;
	}
}
