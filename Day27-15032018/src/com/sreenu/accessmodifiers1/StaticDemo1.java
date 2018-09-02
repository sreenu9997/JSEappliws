package com.sreenu.accessmodifiers1;

public class StaticDemo1 {

	public static int value =20;
	public int value1 = 23;
	
	public static void testingMethod1() {
		System.out.println(" India"+value);
	}
	
	/*public static void testingMethod3() {
		// we can't call non static members in static members
		System.out.println("Okay2"+value1);
	}*/
	public void testingMethod5() {
		System.out.println("Okar8"+value);
	}
	public void testingMethod2() {
		System.out.println("OKAY"+value);
	}
	
}
