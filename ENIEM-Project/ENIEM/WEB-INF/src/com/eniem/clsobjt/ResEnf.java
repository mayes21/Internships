package com.eniem.clsobjt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.fonctions.AjoutEnf;
import com.eniem.models.Connexion_DB;


@SuppressWarnings("serial")
public class ResEnf extends HttpServlet{
	

	static Connection conn ;
	
	public void init() throws ServletException
	{
		@SuppressWarnings("unused")
		Connexion_DB conn = new Connexion_DB();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		
		String prenom = (String) request.getParameter("prenom_enf");
		String jrnaiss = (String) request.getParameter("jour_enf");
		String moisnaiss = (String) request.getParameter("mois_enf");
		String annaiss = (String) request.getParameter("annee_enf");
		String sexe = (String) request.getParameter("sexe_enf");
		String ss = (String) request.getParameter("ss_enf");
		String matricule = (String) request.getParameter("matricule");
		
		String date_nais= jrnaiss+"-"+moisnaiss+"-"+annaiss;
		
		
		
		try {
			@SuppressWarnings("unused")
			AjoutEnf aj = new AjoutEnf( prenom, date_nais, sexe, ss, matricule);
		} catch (SQLException e) {  e.printStackTrace();  }
		
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/src/vues/ResEnf.jsp");
		dispatch.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}
}



