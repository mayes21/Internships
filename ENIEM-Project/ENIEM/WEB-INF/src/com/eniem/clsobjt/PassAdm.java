package com.eniem.clsobjt;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.models.CoupleUser;

@SuppressWarnings("serial")
public class PassAdm extends HttpServlet{

	private CoupleUser utilisateur = new CoupleUser();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		
		String padm1 = (String) request.getParameter("oldPassAdmin");
		String padm2 = (String) request.getParameter("newPassAdmin");
		
		if ((!padm2.equals("")) && (padm1.equals(utilisateur.getAdmPass())))
		{	
			
				utilisateur.setPassAdm(padm2);
				request.getRequestDispatcher("WEB-INF/src/vues/PasswordOK.jsp").forward(request, response);
		
			
	
		}
		else 
			request.getRequestDispatcher("WEB-INF/src/vues/ErreurPassAdm.jsp").forward(request, response);
		
	}


public void doPost(HttpServletRequest request, HttpServletResponse response)
throws IOException, ServletException
{
	doGet(request, response);
}

}


