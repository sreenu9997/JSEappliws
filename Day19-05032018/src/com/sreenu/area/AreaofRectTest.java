package com.sreenu.area;

public class AreaofRectTest {
	
	public static void main(String[] args) {
		
		AreaofRect ar = new AreaofRect(25,30);
		int res = ar.areaofRectangle();
		System.out.println(res);
		
		
		AreaofRect area = new AreaofRect();
		area.a = 25;
		area.b = 50;
		int results = area.areaofRectangle();
		System.out.println(results);
	}

}
