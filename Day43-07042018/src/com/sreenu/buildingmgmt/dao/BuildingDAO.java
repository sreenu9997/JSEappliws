package com.sreenu.buildingmgmt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sreenu.buildingmgmt.pojo.BuildingPojo;
import com.sreenu.buildingmgmt.pojo.FlatPojo;
import com.sreenu.buildingmgmt.pojo.FloorPojo;
import com.sreenu.buildingmgmt.pojo.RoomPojo;

public class BuildingDAO {

	public FlatPojo getRoomDetailsByflatID(int flatid) {

		FlatPojo flatPojo = new FlatPojo();

		ArrayList<RoomPojo> roomlist = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3366/building", "root", "root");
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from flat ft join room r on r.flatid = ft.idflat where ft.idflat = ? ");
			preparedStatement.setInt(1, flatid);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				RoomPojo room = new RoomPojo();
				room.setIdroom(resultSet.getInt("idroom"));
				room.setRoomtype(resultSet.getString("roomtype"));
				roomlist.add(room);
			}
			flatPojo.setRoomlist(roomlist);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flatPojo;

	}

	public FloorPojo getFlatDetailsByFloorId(int floorid) {
		FloorPojo floorPojo = new FloorPojo();
		ArrayList<FlatPojo> flatList = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3366/building", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement(
					"select * from floor fl join flat ft on ft.floorid = fl.idfloor where fl.idfloor = ? ");
			preparedStatement.setInt(1, floorid);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				//floorPojo.setFloorname(resultSet.getString("floorname"));
				//floorPojo.setFloorlevel(resultSet.getInt("floorlevel"));

				FlatPojo flatPojo = new FlatPojo();
				flatPojo.setFlatdno(resultSet.getString("flatdno"));
				flatPojo.setFlatownername(resultSet.getString("flatownername"));
				flatPojo.setIdflat(resultSet.getInt("idflat"));
				flatList.add(flatPojo);

			}
			floorPojo.setFlatlist(flatList);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException s) {
			s.printStackTrace();
		}

		return floorPojo;

	}

	public BuildingPojo getFloorListByBuildingID(int buildingid) {

		BuildingPojo buildingPojo = new BuildingPojo();
		ArrayList<FloorPojo> floorlist = new ArrayList<>();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3366/building", "root", "root");
			;
			PreparedStatement preparedStatement = connection.prepareStatement(
					"select * from building b join floor f on f.bid=b.idbuilding where b.idbuilding = ? ");
			preparedStatement.setInt(1, buildingid);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				buildingPojo.setBarea(resultSet.getString("barea"));
				buildingPojo.setBname(resultSet.getString("bname"));
				buildingPojo.setIdbuilding(resultSet.getInt("idbuilding"));

				FloorPojo floorPojo = new FloorPojo();

				floorPojo.setFloorname(resultSet.getString("floorname"));
				floorPojo.setFloorlevel(resultSet.getInt("floorlevel"));
				floorPojo.setIdfloor(resultSet.getInt("idfloor"));
				floorlist.add(floorPojo);
			}
			buildingPojo.setFloorlist(floorlist);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}
		return buildingPojo;

	}

}
