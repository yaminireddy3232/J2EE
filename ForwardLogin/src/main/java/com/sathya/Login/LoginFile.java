package com.sathya.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("served at: ").append(request.getContextPath());
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(username.equalsIgnoreCase("yamini")&&password.equals("yamini@12"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("successfile.html");
			dispatcher.forward(request, response);
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			RequestDispatcher dispatcher=request.getRequestDispatcher("failedfile.html");
			dispatcher.forward(request, response);
			writer.println("login fail ...try with valid data");
		}
	}

}
