package com.eniem.clsobjt;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.models.CoupleUser;

@SuppressWarnings("serial")
public class PassGPP extends HttpServlet{
	
	private CoupleUser utilisateur = new CoupleUser();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		String pgpp1 = (String) request.getParameter("oldPassGPP");
		String pgpp2 = (String) request.getParameter("newPassGPP");
		
		if (!pgpp2.equals("") && pgpp1.equals(utilisateur.getPersPaiePass()))
		{
			
				utilisateur.setPassGPP(pgpp2);
				request.getRequestDispatcher("WEB-INF/src/vues/PasswordOK.jsp").forward(request, response);
			
		}
		else 
			request.getRequestDispatcher("WEB-INF/src/vues/ErreurPassGPP.jsp").forward(request, response);
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}


}
