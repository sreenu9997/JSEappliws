package com.sreenu.accessmodifiers1;

import com.sreenu.accessmodifiers.AccessModifiersDemo;

public class AccessModifiersDemo4 extends AccessModifiersDemo{
	void test() {// instance method to call protected members
		city ="india";
		//address = "ind";//private members Not accessible by "Is-A_Relationship" & "Has-A-relationship".....
	}
	

}
