package com.servletmvc.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servletmvc.dao.AddDAO;
//import com.servletmvc.object.vehicle;

/**
 * Servlet implementation class AddVehicle
 */
@WebServlet("/vehicle.add")
public class AddVehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String newVid = request.getParameter("txtvid");
		String newVno = request.getParameter("txtvnumber");
		String newVmake = request.getParameter("cmbvmake");
		String newVmodel = request.getParameter("txtvmodel");
		String newVyear = request.getParameter("cmbvyear");
		String newVowner = request.getParameter("txtvowner");
		
		System.out.println(newVno + "" + newVmake + "" + newVmodel + "" + newVyear + "" + newVowner);
		
		new AddDAO().AddVehicle(newVno, newVmake, newVmodel, newVyear, newVowner);
		
//		vehicle v;
//		ResultSet m;
		
		//m = gc.rs3;
	}

}
