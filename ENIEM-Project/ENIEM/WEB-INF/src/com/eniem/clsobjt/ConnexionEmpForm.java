package com.eniem.clsobjt;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.eniem.models.CoupleUser;




@SuppressWarnings("serial")
public class ConnexionEmpForm extends HttpServlet{
	
	
	CoupleUser empform = new CoupleUser();
	
	

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
		{	
			String login = (String) request.getParameter("login");
			String pass = (String) request.getParameter("password");
			
			
            if (login.equals(empform.getEmpForm()) && pass.equals(empform.getEmpFormPass()))
            {
            		 
            	HttpSession session = request.getSession();
        		session.setAttribute("login", login);
        		session.setAttribute("password", pass);
        		if(request.getParameter("auto_connect") != null){
        			System.out.println("Création des cookies.");
        			Cookie loginCookie = new Cookie("login2", login);
        			Cookie passwordCookie = new Cookie("password2", pass);
        			response.addCookie(loginCookie);
        			response.addCookie(passwordCookie);
        		}
        		request.getRequestDispatcher("WEB-INF/src/vues/espaceGEF.jsp").forward(request, response);
            }
			 else
             request.getRequestDispatcher("WEB-INF/src/vues/ErreurGEF.jsp").forward(request, response);
		}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)						
	throws IOException, ServletException
		{
			
			doGet(request, response);
		}	
}