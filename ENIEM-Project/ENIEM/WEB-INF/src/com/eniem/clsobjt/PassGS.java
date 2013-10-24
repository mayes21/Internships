package com.eniem.clsobjt;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.models.CoupleUser;

@SuppressWarnings("serial")
public class PassGS extends HttpServlet{
	
	private CoupleUser utilisateur = new CoupleUser();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		String pgs1 = (String) request.getParameter("oldPassGS");
		String pgs2 = (String) request.getParameter("newPassGS");
		
		if (!pgs2.equals("") && pgs1.equals(utilisateur.getSocPass()))
		{
			
				utilisateur.setPassGS(pgs2);
				request.getRequestDispatcher("WEB-INF/src/vues/PasswordOK.jsp").forward(request, response);
			
		}
		else 
			request.getRequestDispatcher("WEB-INF/src/vues/ErreurPassGS.jsp").forward(request, response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}


}
