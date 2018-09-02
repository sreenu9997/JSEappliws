package come.sreenu.functions;

import java.util.Scanner;

public class FourMethodswithIfelsecalc {

	
	public static void main(String[] args) {
		
		int a = 20; int b = 10;
		int c = 0;
		int choice =0;
	Scanner sc =  new Scanner(System.in);
	System.out.print("Enter Operator value :"); 
	choice = sc.nextInt();
		
		if (choice == 1) {
			c = addition(a, b);
			System.out.println(c);
		}
		else if( choice ==2) {
			c = substraction(a, b);
			System.out.println(c);
		}else if(choice == 3) {
			c = multiplication(a, b);
			System.out.println(c);
		}else {
			c = division(a, b);
			System.out.println(c);
		}
		sc.close();
		
	}
	
	
	
	public static int addition(int a1, int a2) {
		int a3 = a1+ a2;
		return a3;
	}
	public static int substraction( int s1, int s2) {
		int s3 = s1- s2;
		return s3;
		}
	public static int multiplication(int m1, int m2) {
		int m3 = m1*m2;
		return m3;
	}
	public static int division(int d1, int d2) {
		int d3 = d1/d2;
		return d3;
	}
}
