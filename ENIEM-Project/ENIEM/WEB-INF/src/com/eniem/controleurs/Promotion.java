package com.eniem.controleurs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Promotion extends HttpServlet{
	
	


	public void doGet(	HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException 
	{
		request.getRequestDispatcher("Promotion.jsp").forward(request, response);		
		
	}


}
