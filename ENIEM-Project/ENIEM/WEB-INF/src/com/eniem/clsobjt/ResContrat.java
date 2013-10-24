package com.eniem.clsobjt;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.fonctions.AjoutContrat;
import com.eniem.models.Connexion_DB;

@SuppressWarnings("serial")
public class ResContrat extends HttpServlet{
	

	static Connection conn ;
	
	public void init() throws ServletException
	{
		@SuppressWarnings("unused")
		Connexion_DB conn = new Connexion_DB();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
	  
		String type = (String) request.getParameter("typ_ctr");
		String designation = (String) request.getParameter("des_ctr");
		String jrdeb = (String) request.getParameter("jour_deb_ctr");
		String moisdeb = (String) request.getParameter("mois_deb_ctr");
		String anndeb = (String) request.getParameter("annee_deb_ctr");
		String jrfin = (String) request.getParameter("jour_fin_ctr");
		String moisfin = (String) request.getParameter("mois_fin_ctr");
		String annfin = (String) request.getParameter("annee_fin_ctr");
		String matricule = (String) request.getParameter("matricule");
		
		String date_deb = jrdeb+"-"+moisdeb+"-"+anndeb; 
		String date_fin = jrfin+"-"+moisfin+"-"+annfin; 
		
		
		
		
		try {
			@SuppressWarnings("unused")
			AjoutContrat aj = new AjoutContrat( type, designation, date_deb, date_fin, matricule);
		} catch (SQLException e) {  e.printStackTrace();  }
		
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/src/vues/ResContrat.jsp");
		dispatch.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}
}

