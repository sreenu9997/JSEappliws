package com.sreenu.arrays;

public class RevesrestoringArray {

	public static void main(String[] args) {
		
	int array[] = {5,6,8,2,3,45,2};
	int array2[]= new int [array.length]; 
int position = array2.length-1;
for(int i=0;i<=array.length-1;i++) {
	array2[position] = array[i];
	position--;
			}

for (int j=0; j<=array2.length-1; j++) {
	System.out.print(array2[j]+",");
			}
		}
}