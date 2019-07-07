package com.servletmvc.dao;

//import java.sql.ResultSet;
import java.sql.SQLException;

import com.servletmvc.connection.GetConnection;

public class AddDAO {
	
	public boolean AddVehicle(String Vno, String Vmake, String Vmodel, String Vyear, String Vowner)
	{
		String sql3 ="INSERT INTO vehicles(vno,make,model,year,owner) VALUES(?,?,?,?,?)";
		//System.out.println(sql3);
		
		GetConnection gc = new GetConnection();
		
		try {
			gc.ps3 = GetConnection.getMySQLConnection().prepareStatement(sql3);
			
			gc.ps3.setString(1, Vno);
		    gc.ps3.setString(2, Vmake);
		 	gc.ps3.setString(3, Vmodel);
			gc.ps3.setString(4, Vyear);
			gc.ps3.setString(5, Vowner);
			
						
			gc.rs3 = gc.ps3.executeUpdate();
			
			//System.out.println(gc.rs2.next());
			
			return true ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
