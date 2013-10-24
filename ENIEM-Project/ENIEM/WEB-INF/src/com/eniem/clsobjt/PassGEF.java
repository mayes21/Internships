package com.eniem.clsobjt;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.models.CoupleUser;

@SuppressWarnings("serial")
public class PassGEF extends HttpServlet{
	
	private CoupleUser utilisateur = new CoupleUser();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		String pgef1 = (String) request.getParameter("oldPassGEF");
		String pgef2 = (String) request.getParameter("newPassGEF");
		
		if (!pgef2.equals("")&& pgef1.equals(utilisateur.getEmpFormPass()))
		{
			
				utilisateur.setPassGEF(pgef2);
				request.getRequestDispatcher("WEB-INF/src/vues/PasswordOK.jsp").forward(request, response);
			

		}
		else 
			request.getRequestDispatcher("WEB-INF/src/vues/ErreurPassGEF.jsp").forward(request, response);
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}

}
