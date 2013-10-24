package com.eniem.clsobjt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.fonctions.AjoutConj;
import com.eniem.models.Connexion_DB;

@SuppressWarnings("serial")
public class ResConj extends HttpServlet{
	

	static Connection conn ;
	
	public void init() throws ServletException
	{
		@SuppressWarnings("unused")
		Connexion_DB conn = new Connexion_DB();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		
		String nom = (String) request.getParameter("nom_conj");
		String prenom = (String) request.getParameter("prenom_conj");
		String jrnaiss = (String) request.getParameter("jour_conj");
		String moisnaiss = (String) request.getParameter("mois_conj");
		String annaiss = (String) request.getParameter("annee_conj");
		String situprof = (String) request.getParameter("situationprof_conj");
		String matricule = (String) request.getParameter("matricule");
		
		
		String date_naiss= jrnaiss+"-"+moisnaiss+"-"+annaiss;
		
		
		 
		
		
		try {
			@SuppressWarnings("unused")
			AjoutConj aj = new AjoutConj(nom, prenom, date_naiss, situprof, matricule);
		} catch (SQLException e) {  e.printStackTrace();  }
		
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/src/vues/ResConj.jsp");
		dispatch.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}
}



