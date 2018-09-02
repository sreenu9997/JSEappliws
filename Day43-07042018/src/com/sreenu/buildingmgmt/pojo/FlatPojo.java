package com.sreenu.buildingmgmt.pojo;

import java.util.ArrayList;

public class FlatPojo {
	private int idflat;
	private String flatdno;
	private String flatownername;
	private int floorid;
	
	private ArrayList<RoomPojo> roomlist;
	
	
	public ArrayList<RoomPojo> getRoomlist() {
		return roomlist;
	}
	public void setRoomlist(ArrayList<RoomPojo> roomlist) {
		this.roomlist = roomlist;
	}
	public int getIdflat() {
		return idflat;
	}
	public String getFlatdno() {
		return flatdno;
	}
	public String getFlatownername() {
		return flatownername;
	}
	public int getFloorid() {
		return floorid;
	}
	public void setIdflat(int idflat) {
		this.idflat = idflat;
	}
	public void setFlatdno(String flatdno) {
		this.flatdno = flatdno;
	}
	public void setFlatownername(String flatownername) {
		this.flatownername = flatownername;
	}
	public void setFloorid(int floorid) {
		this.floorid = floorid;
	}
	
	
	

}
