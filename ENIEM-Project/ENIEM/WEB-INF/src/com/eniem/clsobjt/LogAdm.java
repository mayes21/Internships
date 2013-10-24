package com.eniem.clsobjt;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.models.CoupleUser;

@SuppressWarnings("serial")
public class LogAdm extends HttpServlet{
	
	private CoupleUser utilisateur = new CoupleUser();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		String adm1 = (String) request.getParameter("oldloginAdmin");
		String adm2 = (String) request.getParameter("newloginAdmin");
		
		
		if ( (!adm2.equals("")) && (adm1.equals(utilisateur.getAdm())))
		{
			
				utilisateur.setLogAdm(adm2);
				request.getRequestDispatcher("WEB-INF/src/vues/LoginOK.jsp").forward(request, response);
			
		}
			else
				request.getRequestDispatcher("WEB-INF/src/vues/ErreurLogAdm.jsp").forward(request, response);

		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}


}
