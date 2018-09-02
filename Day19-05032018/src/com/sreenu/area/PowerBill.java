package com.sreenu.area;

public class PowerBill {

	int previousReading;
	int currentReading;
	
	
	
	
	public PowerBill() {
	
	}
	
	PowerBill(int previousReading, int currentReading){
		this.previousReading = previousReading;
		this.currentReading = currentReading;
	}
	
	
	int billingUnits() {
		int result = currentReading-previousReading;
		return result;
	}
	int billCategery() {
		int units = billingUnits();
	
		if(units<100) {
			return 1;
		}
		else if(units>=100 & units<200) {
			return 2;
		}
		else if(units>=200 & units<300) {
			return 3;
			}
		else {
			return 4;
		}
	}
	
	int billAmount() {
		
		int units = billingUnits();
		int categery = billCategery();
		int amount = units*categery;
		return amount;
	}
	
	
	
}
