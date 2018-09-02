package com.sreenu.daimond;

public class DaimondTest {
	public static void main(String[] args) {
		
		
		Daimond daimond1 = new Daimond();
		daimond1.setSize(5);
		daimond1.setNumber(1);
		daimond1.setColor("Blue");
	
		Daimond daimond2 = new Daimond();
		daimond2.setSize(5);
		daimond2.setNumber(2);
		daimond2.setColor("REd");
		
		Daimond daimond3 = new Daimond();
		daimond3.setSize(5);
		daimond3.setNumber(3);
		daimond3.setColor("Orange");
		
		Daimond daimond4 = new Daimond();
		daimond4.setSize(5);
		daimond4.setNumber(4);
		daimond4.setColor("Yellow");
		
		Daimond daimond5 = new Daimond();
		daimond5.setSize(5);
		daimond5.setNumber(5);
		daimond5.setColor("Green");
		
		Daimond daimond6 = new Daimond();
		daimond6.setSize(5);
		daimond6.setNumber(6);
		daimond6.setColor("White");
		
		Daimond daimond7 = new Daimond();
		daimond7.setSize(5);
		daimond7.setNumber(7);
		daimond7.setColor("Pink");
	
		
		daimond1.setBottom(daimond3);
	
		daimond2.setRight(daimond3);
		
		daimond3.setBottom(daimond5);
		daimond3.setTop(daimond1);
		daimond3.setLeft(daimond2);
		daimond3.setRight(daimond4);
		
		daimond4.setBottom(daimond7);
		daimond4.setRight(daimond6);
		daimond4.setLeft(daimond3);
		
		daimond5.setTop(daimond3);
		daimond5.setRight(daimond7);
		
		daimond6.setLeft(daimond4);
	
		
		
		daimond7.setTop(daimond4);
		daimond7.setLeft(daimond5);
		
		/*boolean res = isAssociatedPresents(daimond1, daimond3);
		System.out.println(res);
		*/
		
		isConnected(daimond7);
	}

	public static void isConnected(Daimond daimondcon) {
		
		
		if (daimondcon.getTop() != null) {
			System.out.println("TOP SIDE :: "+daimondcon.getTop().getNumber());
		}
		if (daimondcon.getLeft() != null) {
			System.out.println("LEFT SIDE :: "+daimondcon.getLeft().getNumber());
		}
		if (daimondcon.getRight() != null) {
			System.out.println("RIGHT SIDE :: "+daimondcon.getRight().getNumber());
		}
		if (daimondcon.getBottom() != null) {
			System.out.println("BOTTOM SIDE :: "+daimondcon.getBottom().getNumber());
		}
		
	}
	
	public static boolean isAssociatedPresents(Daimond d1, Daimond d2) {
	
		boolean result = false;
		
		
		if(d1.getBottom()== d2)
			result = true;
		else if(d1.getLeft() == d2) 
			result = true;
		else if(d1.getRight()== d2)
			result = true;
		else if(d1.getTop() == d2)
			result = true;
		
					
		
		return result;
		
		
		
	}
}
