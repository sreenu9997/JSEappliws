package com.sreenu.main;

import com.sreenu.branch.Branch;
import com.sreenu.mango.MangoTree;

public class TMBABMainTest {

	
	public static void main(String[] args) {
		
		
		
		Branch branch = new Branch();
		MangoTree mangoTree = new MangoTree();
		mangoTree.mango = "Banginapalli";
		mangoTree.mangoMethod();
		mangoTree.branch= branch;
		mangoTree.branch.branchMethod();//Has A Relationship
	}
}
