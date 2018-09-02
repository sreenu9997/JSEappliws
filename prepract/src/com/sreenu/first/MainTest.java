package com.sreenu.first;

public class MainTest {
	
public static void main(String[] args) {
	
	FirstProgram fp = new FirstProgram();
	FirstProgram fp1 = new FirstProgram(1, "Sreenu", 9874);
	String res = fp1.getDetails();
	System.out.println(res);
	
}

}
