package com.sreenu.instancestatic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = scanner.nextInt();
		int temprorynumber =number;
		int total=0;
		while (number!=0) {
			int digit = number%10;
			number = number/10;
			total = total+(digit*digit*digit);
		}
		if(total == temprorynumber) {
			System.out.println("It is a ArmStrongNumber :: "+temprorynumber);
		}
		else {
			System.out.println("It is Not ArmStrongNumber :: "+temprorynumber);
		}
		scanner.close();
	}
}
