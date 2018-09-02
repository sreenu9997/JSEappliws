package com.sreenu.hr;

import java.util.Scanner;

public class StringConcatDemo {
	
	

	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();
        System.out.println(number+i);
        double double1 = scan.nextDouble();
        System.out.println(double1+d);
        
        String strung = scan.nextLine();
        if(strung != null) {
        	strung = scan.nextLine();
        }
        System.out.println(s.concat(strung));
        
        
        
        
    }
}
