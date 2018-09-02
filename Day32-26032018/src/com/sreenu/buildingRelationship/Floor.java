package com.sreenu.buildingRelationship;

public class Floor {
	
	private String floorName; 
	private String floorNumber;
	private Flats[] flats;
	
	
	public String getFloorName() {
		return floorName;
	}
	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	public String getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}
	public Flats[] getFlats() {
		return flats;
	}
	public void setFlats(Flats[] flats) {
		this.flats = flats;
	}
	

}
