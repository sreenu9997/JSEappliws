package com.sreenu.dbretrieverecords;

public class DBToConsole {

	public static void main(String[] args) {
		
		try {
			MethodClass.insert(26, "sreenu", "Hyderabad");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
