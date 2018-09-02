package com.sreenu.prepract;

	import java.util.Scanner;

		public class FourMethodswithScanner {

		public static void main(String[] args) {
			int a ; int b;
			int c = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a value :");
			a=sc.nextInt();
			
			System.out.println("Enter a value :");
			b=sc.nextInt();
			
			
			c= addMethod(a, b);
			System.out.println(c);
			c=substractionMethod(a, b);
			System.out.println(c);
			c= multiplicationMethod(a, b);
			System.out.println(c);
			c= divisionMethod(a, b);
			System.out.println(c);
			sc.close();
		}
		
		
		public static int addMethod(int a1, int a2) {
			
			int a3 = a1 +a2;
			return a3;
		}
		public static int substractionMethod(int s1, int s2) {
			int s3 = s1- s2;
			return s3;
		}
		public static int multiplicationMethod(int m1, int m2) {
			int m3 = m1*m2;
			return m3;
		}
		public static int divisionMethod(int d1, int d2) {
			int d3 = d1/d2;
			return d3;
		}
	}

	

