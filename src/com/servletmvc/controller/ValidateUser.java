package com.servletmvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servletmvc.dao.UserDAO;

/**
 * Servlet implementation class ValidateUser
 */
@WebServlet("/validate.do")
public class ValidateUser extends HttpServlet {
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
		String uName = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if(new UserDAO().validateUser(uName,pass))
		{
			//success
			request.getRequestDispatcher("Success.jsp").forward(request, response);
		}
		else
		{
			//failure
			request.getRequestDispatcher("Failure.jsp").forward(request, response);
		}
	}

}
