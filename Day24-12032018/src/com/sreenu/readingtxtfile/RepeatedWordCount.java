package com.sreenu.readingtxtfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RepeatedWordCount {
	
	public static void main(String[] args) {
		int p=0;
		try {
			
			FileReader fileReader = new FileReader("F:\\repeatedwords.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String string = bufferedReader.readLine();
			while(string!=" ") {
				String []array=string.split(",");
				for(int i=0;i<=array.length-1;i++) {
					
				System.out.println(array[i]);
			/*	if(string =array[i]) {
					
					repeatedwords++;
				}*/
			}
			}
		}catch (IOException ie ) {
			System.out.println(ie);
		}
	}

}
