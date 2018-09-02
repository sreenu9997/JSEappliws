package com.sreenu.arrays;

public class CopyoneArraytoAnotherArray {

	
	public static void main(String[] args) {
		
		int [] array = {2,6,8,2,4,6,3};
		int [] array2 = new int[array.length];
		
		// System.out.print("array2 = {");
		for(int i=0; i<array.length; i++) {
			
			array2[i] = array[i];
		//System.out.println(array2[i]+",");
		}
		// System.out.print("};");
		System.out.print("array2 = {");
		for(int j=0; j<array2.length; j++) {
			System.out.print(array2[j]+",");
		}
		System.out.print("};");
	}
	
	
}
