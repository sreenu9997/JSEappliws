package com.sreenu.first;

public class StringRepeated {
	
	public static void main(String[] args) {
		
		String s1 = "Hello World";
		String s2 = "Hello World Java World Hello welcome World";
	
			String[] array1 = s1.split(" ");
			String [] array2 = s2.split(" ");
			
			for(int i=0;i<array1.length; i++) {
				int count = 0;
				String res =array1[i];
				
				for(int j=0; j<array2.length; j++) {
					if(res.equals(array2[j])) {
						count++;
					}
					
				}System.out.println(res+" is repeated "+count);
			}
	
	
	
	
	}

}
