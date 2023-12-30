package com.sathya.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 //get the request data
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	//process the data
	if(username.equalsIgnoreCase("yamini")&&password.equals("yamini@12"))
	{
		RequestDispatcher dispatcher=request.getRequestDispatcher("success.html");
		dispatcher.forward(request, response);
	}
	else
	{
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		RequestDispatcher dispatcher=request.getRequestDispatcher("Login.html");
		dispatcher.include(request, response);
		writer.println("login fail.......try valid data");
	}
	}

}
