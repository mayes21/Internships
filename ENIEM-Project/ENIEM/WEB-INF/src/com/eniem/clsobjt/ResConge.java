package com.eniem.clsobjt;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.fonctions.AjoutConge;
import com.eniem.models.Connexion_DB;

@SuppressWarnings("serial")
public class ResConge extends HttpServlet{
	

	static Connection conn ;
	
	public void init() throws ServletException
	{
		@SuppressWarnings("unused")
		Connexion_DB conn = new Connexion_DB();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		String designation = (String) request.getParameter("des_cng");
		String annee = (String) request.getParameter("annee_cng");
		String jrdeb = (String) request.getParameter("jour_deb_cng");
		String moisdeb = (String) request.getParameter("mois_deb_cng");
		String anndeb = (String) request.getParameter("annee_deb_cng");
		String jrfin = (String) request.getParameter("jour_fin_cng");
		String moisfin = (String) request.getParameter("mois_fin_cng");
		String annfin = (String) request.getParameter("annee_fin_cng");
		String matricule = (String) request.getParameter("matricule");
		
		String date_deb = jrdeb+"-"+moisdeb+"-"+anndeb; 
		String date_fin = jrfin+"-"+moisfin+"-"+annfin; 
		
		
		
		
		try {
			@SuppressWarnings("unused")
			AjoutConge aj = new AjoutConge( designation, annee, date_deb, date_fin, matricule);
		} catch (SQLException e) {  e.printStackTrace();  }
		
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/src/vues/ResConge.jsp");
		dispatch.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}
}


