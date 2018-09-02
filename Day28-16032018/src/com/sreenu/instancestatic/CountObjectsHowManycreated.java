package com.sreenu.instancestatic;

public class CountObjectsHowManycreated {

	
	static int count =0;
	
	CountObjectsHowManycreated(){
		count++;
		System.out.println("Object created :"+count);
	}
}
