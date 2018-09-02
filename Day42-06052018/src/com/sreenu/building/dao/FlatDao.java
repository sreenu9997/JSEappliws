package com.sreenu.building.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sreenu.building.pojo.FlatPojo;
import com.sreenu.building.pojo.RoomPojo;

public class FlatDao {
	
	
	public FlatPojo getFlatRoomDetailsByownerName(String name) {
		
		
		FlatPojo flatPojo = new FlatPojo();
		ArrayList<RoomPojo> roomslist = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3366/building", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM flat f join room r on r.flatid=f.idflat where f.flatownername= ? ");
		preparedStatement.setString(1, name);
ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				
				RoomPojo roomPojo = new RoomPojo();
				roomPojo.setId(resultSet.getInt("idroom"));
				roomPojo.setRoomType(resultSet.getString("roomtype"));
				
				roomslist.add(roomPojo);
				flatPojo.setIdflat(resultSet.getInt("idflat"));
				flatPojo.setFlatdno(resultSet.getString("flatdno"));
			}
			flatPojo.setRoomlist(roomslist);	
			resultSet.close();
			preparedStatement.close();
			connection.close();
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return flatPojo;
	}

}
