package com.sreenu.building.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.sreenu.building.dao.FlatDao;
import com.sreenu.building.pojo.FlatPojo;
import com.sreenu.building.pojo.RoomPojo;

public class BuildingFlatMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Fjat ownername : ");
		String name = scanner.nextLine();
		
		FlatDao flatDao = new FlatDao();
		FlatPojo flatPojo = flatDao.getFlatRoomDetailsByownerName(name);
		System.out.println(flatPojo.getIdflat()+" :: " +flatPojo.getFlatdno());
		ArrayList<RoomPojo> roomlist = flatPojo.getRoomlist();
		
		for(int i=0; i<roomlist.size(); i++) {
			RoomPojo room = roomlist.get(i);
			System.out.println(room.getId()+" :: " +room.getRoomType());
		}
		
		
		
		scanner.close();
	}

}
