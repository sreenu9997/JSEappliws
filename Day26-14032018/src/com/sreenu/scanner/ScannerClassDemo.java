package com.sreenu.scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerClassDemo {

	
	
	public static void main(String[] args) throws IOException{
		
			FileWriter fileWriter  = new FileWriter("F:\\IODemo\\outdataconsole.txt",true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			Scanner scanner = new Scanner(System.in);
			
			for(int i=0;i<=4;i++) {
				
				bufferedWriter.newLine();
				System.out.println("Enter the Data : ");
				String stringValue = scanner.nextLine();
				System.out.println("The Data Is :: "+stringValue);

				bufferedWriter.write(stringValue);//
				
				}
			bufferedWriter.flush();
			fileWriter.close();
			bufferedWriter.close();
			scanner.close();
		
		
		
	}
}
