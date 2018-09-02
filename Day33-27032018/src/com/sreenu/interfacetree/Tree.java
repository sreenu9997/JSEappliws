package com.sreenu.interfacetree;

interface Tree {
	
	public void getWater();
	public void getFood();
	

}
class Banana implements Tree{
	
	public String name;
	public void getWater() {
		System.out.println("Banana Water");
	}
	public void getFood() {
		System.out.println("Banana Food");
	}
}