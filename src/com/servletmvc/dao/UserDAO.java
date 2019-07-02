package com.servletmvc.dao;

import java.sql.SQLException;

import com.servletmvc.connection.GetConnection;

public class UserDAO {

	public boolean validateUser(String uName, String pass)
	{
		String sql ="SELECT * FROM user WHERE uname=? AND pass=?";
		//System.out.println(sql);
		
		GetConnection gc = new GetConnection();
		
		try {
			gc.ps = GetConnection.getMySQLConnection().prepareStatement(sql);
			gc.ps.setString(1, uName);
			gc.ps.setString(2, pass);
			
			gc.rs = gc.ps.executeQuery();
			
			return gc.rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
