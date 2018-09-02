package com.sreenu.readingwordcount;

public class NumberRepeatdinArray {

	public static void main(String[] args) {
		
		int [] array1 = {1,2,3,4};
		int array2[] = {1,2,5,4,2,1,3,5,2,1,2,3,2,1,4,6,5,4,5,46,54,5,4};
		
		for(int i=0;i<array1.length;i++) {
			int count =0;             
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					count++;
				}
			}System.out.println(array1[i]+"  is Repeated "+count);
			
		}
	}
}
