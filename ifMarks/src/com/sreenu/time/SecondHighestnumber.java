package com.sreenu.time;

import java.util.ArrayList;
import java.util.Collections;

public class SecondHighestnumber {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main (String [] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(15);
		arrayList.add(25);
		arrayList.add(65);
		arrayList.add(85);
		arrayList.add(89);
		arrayList.add(47);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		System.out.println("Second Highest number is :: "+arrayList.get(arrayList.size()-2));
		
		
	}

}
