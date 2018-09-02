package com.sreenu.building.pojo;

import java.util.ArrayList;

public class FloorPojo {
	private int idfloor;
	private int floorlevel;
	private String floorname;
	private	ArrayList<FlatPojo> flatlist;
	public int getIdfloor() {
		return idfloor;
	}
	public int getFloorlevel() {
		return floorlevel;
	}
	public String getFloorname() {
		return floorname;
	}
	public ArrayList<FlatPojo> getFlatlist() {
		return flatlist;
	}
	public void setIdfloor(int idfloor) {
		this.idfloor = idfloor;
	}
	public void setFloorlevel(int floorlevel) {
		this.floorlevel = floorlevel;
	}
	public void setFloorname(String floorname) {
		this.floorname = floorname;
	}
	public void setFlatlist(ArrayList<FlatPojo> flatlist) {
		this.flatlist = flatlist;
	}
	
	
}
