package com.eniem.clsobjt;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.models.CoupleUser;

@SuppressWarnings("serial")
public class LogGEF extends HttpServlet{

	private CoupleUser utilisateur = new CoupleUser();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		
		String gef1 = (String) request.getParameter("oldloginGEF");
		String gef2 = (String) request.getParameter("newloginGEF");
		
		if (!gef2.equals("")&& gef1.equals(utilisateur.getEmpForm()))
		{
			
				utilisateur.setLogGEF(gef2);
				request.getRequestDispatcher("WEB-INF/src/vues/LoginOK.jsp").forward(request, response);
			

		}
		else
			request.getRequestDispatcher("WEB-INF/src/vues/ErreurLogGEF.jsp").forward(request, response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}

}
