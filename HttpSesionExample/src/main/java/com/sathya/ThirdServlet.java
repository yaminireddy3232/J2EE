package com.sathya; 
 
import java.io.IOException; 
import java.io.PrintWriter; 
 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.http.HttpSession; 
 
 
@WebServlet("/ThirdServlet") 
public class ThirdServlet extends HttpServlet { 
 private static final long serialVersionUID = 1L; 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
  // TODO Auto-generated method stub 
  //total 6-details = 4-details session 2-request  
    HttpSession session = request.getSession(false); 
     
    response.setContentType("text/html"); 
    PrintWriter writer = response.getWriter(); 
    writer.println("User name..."+session.getAttribute("username")); 
    writer.println("<br>"); 
    writer.println("User Age..."+session.getAttribute("age")); 
    writer.println("<br>"); 
    writer.println("User Qualification..."+session.getAttribute("Qualification")); 
    writer.println("<br>"); 
    writer.println("User Designation..."+session.getAttribute("Designation")); 
    writer.println("<br>"); 
    writer.println("User mobile..."+request.getParameter("mobile")); 
    writer.println("<br>"); 
    writer.println("User Email..."+request.getParameter("email")); 
    
   } 
   
 
 }