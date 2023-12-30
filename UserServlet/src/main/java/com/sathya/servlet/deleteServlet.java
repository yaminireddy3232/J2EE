package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the requested data
		String userId = request.getParameter("userId");
		//give the data to DAO layer
		UserDao dao=new UserDao();
		int result=dao.deleteById(userId);
		request.setAttribute("result", result);
		//forward the request to jsp file
		RequestDispatcher dispatcher=request.getRequestDispatcher("deleteuser.jsp");
		dispatcher.forward(request, response);
		

	}

}
