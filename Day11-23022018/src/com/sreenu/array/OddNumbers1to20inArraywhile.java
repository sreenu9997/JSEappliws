package com.sreenu.array;

public class OddNumbers1to20inArraywhile {

	public static void main(String[] args) {
		
		int odd[] = new int[10];
		int count = 0;
		int i =1;
		int j=0;
		while(i<=20) {
			
			
			if(i%2 == 1) {
				odd[count] = i;
				count++;
			}
			i++;
		}
		
		while(j<=odd.length-1) {
			System.out.println(odd[j]);
			j++;
		}
	}

}