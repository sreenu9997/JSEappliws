package com.sreenu.arrays;

public class FindEvenOddPrimeinArray {

	
	
	public static void main(String[] args) {
		
		
		int array[] = {5,6,8,25,6,3,5,4,6,89,27,29,15,23};
		int even[]= new int[array.length/2];
		int odd[] = new int[array.length/2];
		int prime[] = new int [array.length/2];
		int evenCount = 0;
		int oddCount = 0;
		int primeCount = 0;
		int evenIndex=0;
		int oddIndex=0;
		int primeIndex=0;
		for(int i=0;i<=array.length-1;i++) {
			if(array[i]%2==0) {
				even[evenIndex]=array[i];
				evenCount++;
			}
			else if(array[i]%2==1) {
				odd[oddIndex] = array[i];
				oddCount++;
			}
			else if(array[i]%2==0) {
				
			}
		}
	}
}
