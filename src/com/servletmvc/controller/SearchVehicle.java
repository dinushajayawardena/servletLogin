package com.servletmvc.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servletmvc.connection.GetConnection;
import com.servletmvc.dao.SearchDAO;
import com.servletmvc.object.vehicle;

/**
 * Servlet implementation class SearchVehicle
 */
@WebServlet("/vehicle.show")
public class SearchVehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String VNo = request.getParameter("vno");
	
		//System.out.println(VNo);
		if(new SearchDAO().matchedVehicle(VNo))
		{
			vehicle v;
			ResultSet m;
			//success
			/////////////////
			String sqlsearch = "SELECT * FROM vehicles WHERE vno="+"'"+VNo+"'";
			
			GetConnection gc = new GetConnection();
			
			
			try {
					gc.ps2 = GetConnection.getMySQLConnection().prepareStatement(sqlsearch);
					
					m = gc.ps2.executeQuery();
					
					if(m.next())
					{
						String vid = Integer.toString(m.getInt(1));
						String vno = m.getString(2);
						String vmake = m.getString(3);
						String vmodel = m.getString(4);
						String vyear = m.getString(5);
						String vowner = m.getString(6);
						
						System.out.println(vid);
						
						v =new vehicle(vid, vno, vmake, vmodel, vyear, vowner);
						
						request.setAttribute("vehicle", v);
						RequestDispatcher dispatcher = request.getRequestDispatcher("Results.jsp");
						dispatcher.forward(request, response);
						
					}
					
				} catch (SQLException e) {
				
				e.printStackTrace();
				}
				/////////////////
				//request.getRequestDispatcher("Results.jsp").forward(request, response);
				//System.out.println(VNo);
		}
		else
		{
			//failure
			request.getRequestDispatcher("Failure.jsp").forward(request, response);
		}
	}

}
