package com.eniem.controleurs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Conjoint extends HttpServlet{

	public void doGet(	HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException 
	{
		request.getRequestDispatcher("WEB-INF/src/vues/Conjoint.jsp").forward(request, response);		
		
	}

}
