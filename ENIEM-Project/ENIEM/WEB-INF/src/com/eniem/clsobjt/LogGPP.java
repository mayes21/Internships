package com.eniem.clsobjt;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.models.CoupleUser;

@SuppressWarnings("serial")
public class LogGPP extends HttpServlet{
	
	private CoupleUser utilisateur = new CoupleUser();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		
		String gpp1 = (String) request.getParameter("oldloginGPP");
		String gpp2 = (String) request.getParameter("newloginGPP");
		
		if (!gpp2.equals("")&& gpp1.equals(utilisateur.getPersPaie()))
		{
			
				utilisateur.setLogGPP(gpp2);
				request.getRequestDispatcher("WEB-INF/src/vues/LoginOK.jsp").forward(request, response);
			
		}
		else
			request.getRequestDispatcher("WEB-INF/src/vues/ErreurLogGPP.jsp").forward(request, response);
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}

}
