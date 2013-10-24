package com.eniem.clsobjt;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.fonctions.AjoutSanction;
import com.eniem.models.Connexion_DB;

@SuppressWarnings("serial")
public class ResSanction extends HttpServlet{
	

	static Connection conn ;
	
	public void init() throws ServletException
	{
		@SuppressWarnings("unused")
		Connexion_DB conn = new Connexion_DB();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		String designation = (String) request.getParameter("des_sanc");
		String degre = (String) request.getParameter("deg_sanc");
		String motif = (String) request.getParameter("mot_sanc");
		String jrdeb = (String) request.getParameter("jour_deb_sanc");
		String moisdeb = (String) request.getParameter("mois_deb_sanc");
		String anndeb = (String) request.getParameter("annee_deb_sanc");
		String jrfin = (String) request.getParameter("jour_fin_sanc");
		String moisfin = (String) request.getParameter("mois_fin_sanc");
		String annfin = (String) request.getParameter("annee_fin_sanc");
		String nbjour = (String) request.getParameter("nbr_jour_sanc");
		String matricule = (String) request.getParameter("matricule");
		
		String date_deb = jrdeb+"-"+moisdeb+"-"+anndeb; 
		String date_fin = jrfin+"-"+moisfin+"-"+annfin; 
		
		
		
		
		try {
			@SuppressWarnings("unused")
			AjoutSanction aj = new AjoutSanction( designation, degre, motif, date_deb, date_fin, nbjour, matricule);
		} catch (SQLException e) {  e.printStackTrace();  }
		
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/src/vues/ResSanc.jsp");
		dispatch.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}
}




