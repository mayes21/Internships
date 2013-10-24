package com.eniem.clsobjt;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.fonctions.AjoutFormCourte;
import com.eniem.models.Connexion_DB;

@SuppressWarnings("serial")
public class ResFormCourte extends HttpServlet{
	

	static Connection conn ;
	
	public void init() throws ServletException
	{
		@SuppressWarnings("unused")
		Connexion_DB conn = new Connexion_DB();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
        String matricule = (String) request.getParameter("matricule");
		String intitule = (String) request.getParameter("int_fcd");
		String jrdeb = (String) request.getParameter("jour_deb_fcd");
		String moisdeb = (String) request.getParameter("mois_deb_fcd");
		String anndeb = (String) request.getParameter("annee_deb_fcd");
		String jrfin = (String) request.getParameter("jour_fin_fcd");
		String moisfin = (String) request.getParameter("mois_fin_fcd");
		String annfin = (String) request.getParameter("annee_fin_fcd");
		
		String thm = (String) request.getParameter("theme_fcd");
		String duree = (String) request.getParameter("dur_fcd");
		
		
		
		String date_deb = jrdeb+"-"+moisdeb+"-"+anndeb; 
		String date_fin = jrfin+"-"+moisfin+"-"+annfin; 
		
		
		
		
		
		try {
			@SuppressWarnings("unused")
			AjoutFormCourte aj = new AjoutFormCourte(intitule, date_deb, date_fin, thm, duree, matricule);
		} catch (SQLException e) {  e.printStackTrace();  }
		
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/src/vues/ResFormCD.jsp");
		dispatch.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}
}




