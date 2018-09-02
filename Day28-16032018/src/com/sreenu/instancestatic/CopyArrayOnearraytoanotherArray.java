package com.sreenu.instancestatic;

public class CopyArrayOnearraytoanotherArray {
	
	
	
	public int[] copyArray(int[] array){
		
		int result[] =array;
		
		int copydata[]=new int [result.length];
		int index = 0;
		
		for(int i=0; i<result.length; i++)
			
			if(result[i]!=0) {
				copydata[index] = result[i];
				index++;
			}
		
		return copydata;
	}

}
