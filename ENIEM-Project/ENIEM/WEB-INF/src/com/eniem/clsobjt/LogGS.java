package com.eniem.clsobjt;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.models.CoupleUser;

@SuppressWarnings("serial")
public class LogGS extends HttpServlet{
	
	private CoupleUser utilisateur = new CoupleUser();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		
		String gs1 = (String) request.getParameter("oldloginGS");
		String gs2 = (String) request.getParameter("newloginGS");
		
		if (!gs2.equals("")&& gs1.equals(utilisateur.getSoc()))
		{

			
				utilisateur.setLogGS(gs2);
				request.getRequestDispatcher("WEB-INF/src/vues/LoginOK.jsp").forward(request, response);
			

		}
		else
			request.getRequestDispatcher("WEB-INF/src/vues/ErreurLogGS.jsp").forward(request, response);
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}

}
