package com.sreenu.arrays;

public class RevesreArray {

	
	public static void main(String[] args) {
		
		int array[] = {2,3,6,5,8,2,6};
		int array2[] = new int[array.length];
		int index = 0;
		
		System.out.print("Array Revesre {");
		for(int i = array.length-1; i>=0;i--) {
			array2[index] = array[i];
			
			System.out.print(array2[index]+",");
			index++;
		}
		System.out.println("};");
	}
}
