package com.sreenu.buildingRelationship;

public class BuildingMainTest {
	
	public static void main(String[] args) {
		
		
		Building building = new Building();
		building.setName("Sreenu Apartment");
		building.setAddress("Hyderabad");
		
		
		Floor floor1 = new Floor();
		floor1.setFloorName("SreenuFloor");
		floor1.setFloorNumber("FLOOR-1");
				
		Flats flats1 = new Flats();
		flats1.setFlatNumber("FLAT-101");
		flats1.setFlatName("SreenuFlat1");
		
		Room room1 = new Room();
		room1.setRoomType("RooM-1-BedRoom");
		room1.setLength(650);
		room1.setWidth(150);
		
		Room room2 = new Room();
		room2.setRoomType("RooM-2-BedRoom");
		room2.setLength(650);
		room2.setWidth(150);
		
		
		
		Room roomsArray1[] = new Room[2];
		roomsArray1[0]=room1;
		roomsArray1[1]=room2;
		
		flats1.setRooms(roomsArray1);
		
		
		
		Flats flats2 = new Flats();
		flats2.setFlatNumber("FLAT-102");
		flats2.setFlatName("SreenuFlat2");
		
		Room room3 = new Room();
		room3.setRoomType("RooM-3-BedRoom");
		room3.setLength(550);
		room3.setWidth(250);
		
		Room room4 = new Room();
		room4.setRoomType("RooM-4-BedRoom");
		room4.setLength(550);
		room4.setWidth(250);
		
		Room roomsArray2[] = new Room[2];
		roomsArray2[0]=room3;
		roomsArray2[1]=room4;
		
		flats2.setRooms(roomsArray2);
		
		Flats flatsArray1[] = new Flats[2];
		flatsArray1[0] = flats1;
		flatsArray1[1]=flats2;
		
		floor1.setFlats(flatsArray1);
		
		
		
		Floor floorsArray1[] = new Floor[1];
		floorsArray1[0] = floor1;
		
		
		
		building.setFloors(floorsArray1);
		
		Room roomResult[] = flats1.getRooms();
		Flats flatResult[] = floor1.getFlats();
		Floor result[] = building.getFloors();
		
		for(int i=0; i<result.length; i++) {
			System.out.println(building.getName()+" :: "+building.getAddress()+" :: "+result[i].getFloorName()+" :: "+ result[i].getFloorNumber());
		System.out.println(":::::::::::!!!!!!!!!!!!!!!!!!!!!!!!!!!::::::::::::");
		
			for(int j=0; j<flatResult.length; j++) {
				
				System.out.println(flatResult[j].getFlatName()+"  ::  "+flatResult[j].getFlatNumber());
				System.out.println("::::::::::::==============================:::::::::::");
				for(int k=0; k<roomResult.length; k++) {
					System.out.println(roomResult[k].getRoomType()+"  :: "+roomResult[k].getLength()+"  :: "+roomResult[k].getWidth());
					System.out.println(":::::::::::::+++++++++++++++++++++++++++::::::::::");
				}
			}
		
		
		}
		
		
		//=============
		
		System.out.println("Second Floor In Building");
		
		//==============second floor===========
		
		Floor floor2 = new Floor();
		floor2.setFloorName("SreenuFloor");
		floor2.setFloorNumber("FLOOR-2");
				
		Flats flats3 = new Flats();
		flats3.setFlatNumber("FLAT-301");
		flats3.setFlatName("SreenuFlat3");
		
		Room room5 = new Room();
		room5.setRoomType("RooM-5-BedRoom");
		room5.setLength(650);
		room5.setWidth(150);
		
		Room room6 = new Room();
		room6.setRoomType("RooM-6-BedRoom");
		room6.setLength(650);
		room6.setWidth(150);
		
		
		
		Room roomsArray3[] = new Room[2];
		roomsArray3[0]=room5;
		roomsArray3[1]=room6;
		
		flats3.setRooms(roomsArray3);
		
		
		
		Flats flats4 = new Flats();
		flats4.setFlatNumber("FLAT-202");
		flats4.setFlatName("SreenuFlat4");
		
		Room room7 = new Room();
		room7.setRoomType("RooM-7-BedRoom");
		room7.setLength(550);
		room7.setWidth(250);
		
		Room room8 = new Room();
		room8.setRoomType("RooM-8-BedRoom");
		room8.setLength(550);
		room8.setWidth(250);
		
		Room roomsArray4[] = new Room[2];
		roomsArray4[0]=room3;
		roomsArray4[1]=room4;
		
		flats4.setRooms(roomsArray4);
		
		Flats flatsArray2[] = new Flats[2];
		flatsArray2[0] = flats1;
		flatsArray2[1]=flats2;
		
		floor2.setFlats(flatsArray2);
		
		
		
		Floor floorsArray2[] = new Floor[1];
		floorsArray2[0] = floor1;
		
		
		
		building.setFloors(floorsArray2);
		
		Room roomResult1[] = flats4.getRooms();
		Flats flatResult1[] = floor2.getFlats();
		Floor result1[] = building.getFloors();
		
		for(int i=0; i<result1.length; i++) {
			System.out.println(building.getName()+" :: "+building.getAddress()+" :: "+result1[i].getFloorName()+" :: "+ result1[i].getFloorNumber());
		System.out.println(":::::::::::!!!!!!!!!!!!!!!!!!!!!!!!!!!::::::::::::");
		
			for(int j=0; j<flatResult1.length; j++) {
				
				System.out.println(flatResult1[j].getFlatName()+"  ::  "+flatResult1[j].getFlatNumber());
				System.out.println("::::::::::::==============================:::::::::::");
				for(int k=0; k<roomResult1.length; k++) {
					System.out.println(roomResult1[k].getRoomType()+"  :: "+roomResult1[k].getLength()+"  :: "+roomResult1[k].getWidth());
					System.out.println(":::::::::::::+++++++++++++++++++++++++++::::::::::");
				}
			}
		
		
		}
		
		
	}

}
