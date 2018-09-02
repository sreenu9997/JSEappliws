package com.sreenu.inheritance.engine;

import com.sreenu.inheritance.car.Car;
import com.sreenu.inheritance.vehicle.Vehicle;

public class VCEmainTest {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.hp = 540;
		vehicle.kw = 20;
		
		Car car = new Car();
		car.brand = "q7";
		car.manufacturer = "BMW";
		car.model = 2018;
		
		
		
	}
}
