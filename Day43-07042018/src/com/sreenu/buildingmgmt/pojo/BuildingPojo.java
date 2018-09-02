package com.sreenu.buildingmgmt.pojo;

import java.util.ArrayList;

public class BuildingPojo {

	private int idbuilding;
	private String bname;
	private String barea;
	private ArrayList<FloorPojo> floorlist;
	
	public ArrayList<FloorPojo> getFloorlist() {
		return floorlist;
	}
	public void setFloorlist(ArrayList<FloorPojo> floorlist) {
		this.floorlist = floorlist;
	}
	public int getIdbuilding() {
		return idbuilding;
	}
	public String getBname() {
		return bname;
	}
	public String getBarea() {
		return barea;
	}
	public void setIdbuilding(int idbuilding) {
		this.idbuilding = idbuilding;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setBarea(String barea) {
		this.barea = barea;
	}
	
	
}
