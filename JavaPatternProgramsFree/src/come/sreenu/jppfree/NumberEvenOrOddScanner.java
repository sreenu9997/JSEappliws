package come.sreenu.jppfree;

import java.util.Scanner;

public class NumberEvenOrOddScanner {

	public static void main (String [] args) {
		int x;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer : ");
		x=sc.nextInt();
		if(x%2 == 0) {
			System.out.println("Number is Even : "+x);
			}
		else {
			System.out.println("Number is Odd : "+x);
		}
	}
}
