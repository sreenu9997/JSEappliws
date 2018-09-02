package com.sreenu.instancestatic;

public class MainTestForCopyArrayData {
	
	
	public static void main(String[] args) {
		
		
		CopyArrayOnearraytoanotherArray copyArrayOnearraytoanotherArray = new CopyArrayOnearraytoanotherArray();
		int[] data = {2,3,5,6,5,4,85};
		
		int [] result = copyArrayOnearraytoanotherArray.copyArray(data);
		
		
		for(int i=0; i<result.length; i++ ) {
			
			System.out.println("Result ["+i+"] :: "+result[i]);
		}
	}

}
