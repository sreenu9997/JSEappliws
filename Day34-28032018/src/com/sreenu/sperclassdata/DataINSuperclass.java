package com.sreenu.sperclassdata;

public class DataINSuperclass {
	
	public static void main(String[] args) {
		//same class reference  same class object
		Bsuperclass bsuperclass = new Bsuperclass();
		
		bsuperclass.getClassdata();
		
		
		CSubclass cSubclass = new CSubclass();
		cSubclass.getSubclassData();
		
		
		//super class reference sub class object
		Bsuperclass	bsuperclass4 = new 	CSubclass();
		
	bsuperclass4.getClassdata();
		
			
	}

}
class Bsuperclass{
	
	public void getClassdata() {
		
		System.out.println("Getting Data from Super class");
	}
}

class CSubclass extends Bsuperclass{
	
	public void getSubclassData() {
		System.out.println("Getting Data from sub class");
	}
}