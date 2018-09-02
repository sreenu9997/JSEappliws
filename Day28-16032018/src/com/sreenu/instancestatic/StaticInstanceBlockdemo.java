package com.sreenu.instancestatic;

public class StaticInstanceBlockdemo {

	
	public int a =getDataA();
	static int ab= getDataB();
	
	
	
	public StaticInstanceBlockdemo() {
	System.out.println("I'm in default constructor "+a);
	}
	
	
	{
		System.out.println("I am in instance block "+a);
	}
	static {
		System.out.println("I'm in Static block ");
	}
	
	public int getDataA() {
		System.out.println("Im in getDataA method");
		return 25;
	}
	public static int getDataB() {
		System.out.println("static method calling here for getDataB() ");
		return 63;
	}
	
	
}
