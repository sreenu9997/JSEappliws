package com.sreenu.buildingRelationship;

public class Building {
	
	private String address;
	private String name;
	private Floor[] floors;
	private Flats[] flats;
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Floor[] getFloors() {
		return floors;
	}
	public void setFloors(Floor[] floors) {
		this.floors = floors;
	}
	public Flats[] getFlats() {
		return flats;
	}
	public void setFlats(Flats[] flats) {
		this.flats = flats;
	}
	

}
