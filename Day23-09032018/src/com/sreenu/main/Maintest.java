package com.sreenu.main;

import com.sreenu.staticmethod.SimcardStaticmethod;

public class Maintest {
	public static void main(String[] args) {
		
	SimcardStaticmethod.network = "Sree";
	SimcardStaticmethod smt = new SimcardStaticmethod();
	smt.phoneno=256897;
	
	
	SimcardStaticmethod.test2();
	smt.test2();
	
	smt.test();
	
	System.out.println(SimcardStaticmethod.network);
	System.out.println(smt.network);
	
	}
}
