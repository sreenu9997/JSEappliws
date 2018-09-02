package com.sreenu.prepract;

public class NumberPatterndecrementopposite {

	
/*	
	654321
	65432
	6543
	654
	65
	6

*/	
	
	
	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print(j);
			}System.out.println();
		}
	}
}
