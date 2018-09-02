package com.sreenu.arrays;

public class ArrayPositionEvenoddStore {

	public static void main(String[] args) {
		
		int array[] = {2,6,8,9,3,5,6,8,7,5};
		
		int even[] = new int [array.length/2];
		int odd[] = new int [array.length/2];
		int evenIndex =0;
		int oddIndex=0;
		for(int i=0; i<=array.length-1; i++) {
			
			if(i%2==0) {
				even[evenIndex] = array[i];
				evenIndex++;
			}else  {
				odd[oddIndex]=array[i];
				oddIndex++;
			}
		}
		System.out.print("Even Result : ");
		for(int j=0; j<=even.length-1;j++) {
			
			System.out.print(even[j]);
		}
		//printing the space between the even odd results
		System.out.println();
		System.out.println("*********");
		//okay
		
		System.out.print("Odd Result : ");
		for(int j=0; j<=odd.length-1;j++) {
			
			System.out.print(odd[j]);
		}
		
	}
	
}
