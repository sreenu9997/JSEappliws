package com.sreenu.readingwordcount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingWordCount {
	
	
	
	public static void main(String[] args) {
		
		try {
			
			
			FileReader fileReader = new FileReader("F:\\vijay.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String readLines = bufferedReader.readLine();
			
			int lineCount = 0;
			int wordCount = 0;
			while(readLines!=null) {
				lineCount++;
				String []array = readLines.split(",");
				wordCount = wordCount+array.length;
				readLines = bufferedReader.readLine();
			}
			System.out.println("No of words ::"+wordCount);
			System.out.println("No of lines ::"+lineCount);
			bufferedReader.close();
		}catch (IOException ie) {
			System.out.println(ie);
		}
	}

}
