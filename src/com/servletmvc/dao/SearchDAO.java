package com.servletmvc.dao;

import java.sql.SQLException;

import com.servletmvc.connection.GetConnection;

public class SearchDAO {
	
	public boolean matchedVehicle(String VNo)
	{
		String sql2 ="SELECT * FROM vehicles WHERE vno=?";
		//System.out.println(sql2);
		
		GetConnection gc = new GetConnection();
		
		try {
			gc.ps2 = GetConnection.getMySQLConnection().prepareStatement(sql2);
			gc.ps2.setString(1, VNo);
			
						
			gc.rs2 = gc.ps2.executeQuery();
			
			//System.out.println(gc.rs2.next());
			
			return gc.rs2.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
