package com.sreenu.treeabstract;

public abstract class Tree {

private int leaf[];
public abstract void prepareFood();
public abstract void getWater();

}

class Banana extends Tree{
	
	public String name;
	public void prepareFood() {
		
		System.out.println("Make Banana");
	}
	public void getWater() {
		System.out.println("For Banana");
	}
	public void makeBanana() {
		System.out.println("Banana class method");
	}
}

class Mango extends Tree{
	
	private String name;
	public void prepareFood() {
		System.out.println("Mango");
	}
	public void getWater() {
		System.out.println("Mango Water");
	}
}