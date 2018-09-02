package com.sreenu.buildingmgmt.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.sreenu.buildingmgmt.dao.BuildingDAO;
import com.sreenu.buildingmgmt.pojo.BuildingPojo;
import com.sreenu.buildingmgmt.pojo.FlatPojo;
import com.sreenu.buildingmgmt.pojo.FloorPojo;
import com.sreenu.buildingmgmt.pojo.RoomPojo;

public class BuildingMain {
	
	
	public static void main(String[] args) {
		
		int floorcount = 1;
		int flatcount = 1;
		int roomcount = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Building Id ");
		int buildingId = scanner.nextInt();
		System.out.println(" ");
		
		
		BuildingDAO buildingDAO = new BuildingDAO();
		
		BuildingPojo buildingPojo = buildingDAO.getFloorListByBuildingID(buildingId);
		
		System.out.println("$$$$$$$$$ Building Details $$$$$$$$$$$");		
		System.out.println(buildingPojo.getBname() +" :: "+ buildingPojo.getBarea()+" :: "+buildingPojo.getIdbuilding());
		System.out.println("  ");
		
	ArrayList<FloorPojo> flist = buildingPojo.getFloorlist();
	
	for(int i = 0; i<flist.size(); i++) {
		
		FloorPojo fpojo = flist.get(i);
		
		System.out.println("======== "+floorcount+ " Floor Details===========");
		System.out.println(fpojo.getIdfloor()+" :: "+fpojo.getFloorname()+" :: "+fpojo.getFloorlevel());
		System.out.println("  ");
		
		
		FloorPojo floorforflat = buildingDAO.getFlatDetailsByFloorId(flist.get(i).getIdfloor());
		ArrayList<FlatPojo> flatl = floorforflat.getFlatlist();
		
		for(int j = 0; j<flatl.size(); j++) {
		
			FlatPojo flat = flatl.get(j);
			System.out.println("+++++++++ "+flatcount+ " Flat Details +++++++++++");
			System.out.println(flat.getIdflat()+" == "+flat.getFlatownername()+" == "+flat.getFlatdno());			
			
			System.out.println(" ");
			
			FlatPojo flatForRoom = buildingDAO.getRoomDetailsByflatID(flatl.get(j).getIdflat());
			ArrayList<RoomPojo> rlist = flatForRoom.getRoomlist();
			
			for(int k=0; k<rlist.size(); k++) {
				RoomPojo roomp = rlist.get(k);
				System.out.println("************ "+roomcount+ " Room Details ***********");
				System.out.println(roomp.getIdroom()+ " **** "+roomp.getRoomtype());
				
				
				roomcount++;
				
			}
			System.out.println(" ");
			flatcount++;
		}
		System.out.println(" ");
		floorcount++;
	}
	scanner.close();
	}

}
