package com.sreenu.first;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingData {

	
	public static void main(String[] args) {
		try {
		FileReader fileReader = new FileReader("F:\\vijay.txt");
		BufferedReader br = new BufferedReader(fileReader);
		String res = br.readLine();
		int lineCount =0;
		int wordCount = 0;
		while(res!=null) {
			lineCount++;
			String [] array = res.split(",");
			wordCount = wordCount + array.length;
					
			res =br.readLine();
			
		}
		

		System.out.println("No of Lines "+lineCount);

		System.out.println("No of words "+wordCount);
		
	}catch (IOException ie) {
		System.out.println(ie);
	}
		
	}
}
