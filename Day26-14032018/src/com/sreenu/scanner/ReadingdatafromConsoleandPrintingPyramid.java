package com.sreenu.scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadingdatafromConsoleandPrintingPyramid {
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\IODemo\\Pyramid.txt", true));
		Scanner scanner = new Scanner(System.in);
		
	System.out.print("Enter Number : ");
	
	
	int n = scanner.nextInt();
	bufferedWriter.write("Enter Number : "+n);
	bufferedWriter.newLine();
	int count = n-1;
	
	for(int i=1; i<=n;i++) {
		
		
		for(int j=0;j<=count;j++) {
			System.out.print(" ");
			bufferedWriter.write(" ");
			
			
		}
			
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
				bufferedWriter.write("* ");
				
			}
			
		count --;
		System.out.println();
		bufferedWriter.newLine();
		}	
	bufferedWriter.flush();
	bufferedWriter.close();
	scanner.close();
	  }

	}
