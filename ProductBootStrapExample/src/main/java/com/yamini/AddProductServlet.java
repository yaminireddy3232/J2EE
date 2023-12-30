package com.yamini;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

 
 
@WebServlet("/AddProductServlet") 
@MultipartConfig 
public class AddProductServlet extends HttpServlet { 
 private static final long serialVersionUID = 1L; 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
  String proId=request.getParameter("proId"); 
  String proName=request.getParameter("proName"); 
  double proPrice=Double.parseDouble(request.getParameter("proPrice")); 
  String proBrand=request.getParameter("proBrand"); 
  String proMadeIn=request.getParameter("proMadeIn"); 
  Date prodMfgDate=Date.valueOf(request.getParameter("proMfgDate")); 
  Date prodExpDate=Date.valueOf(request.getParameter("proExpDate")); 
  Part part=request.getPart("proImage"); 
  InputStream proImage=part.getInputStream(); 
  Product product=new Product(); 
  product.setProId(proId); 
  product.setProName(proName); 
  product.setProPrice(proPrice); 
  product.setProBrand(proBrand); 
  product.setProMadeIn(proMadeIn); 
  product.setProMfgDate(prodMfgDate); 
  product.setProExpDate(prodExpDate); 
  product.setProImage(proImage); 
       ProductDao dao = new ProductDao();
        int result = dao.saveProduct(product);
        response.setContentType("text/html");
        PrintWriter writer=response.getWriter();
        writer.println("Data inserted successfully......"+result);
	}
}
        
        
		