package com.eniem.clsobjt;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.fonctions.AjoutPromotion;
import com.eniem.models.Connexion_DB;

@SuppressWarnings("serial")
public class ResPromotion extends HttpServlet{
	

	static Connection conn ;
	
	public void init() throws ServletException
	{
		@SuppressWarnings("unused")
		Connexion_DB conn = new Connexion_DB();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		String ancien = (String) request.getParameter("anc_post");
		String nouveau = (String) request.getParameter("nouv_post");
		String jr = (String) request.getParameter("jour_pro");
		String mois = (String) request.getParameter("mois_pro");
		String ann = (String) request.getParameter("annee_pro");
		String matricule = request.getParameter("matricule");
		
		
		String date_prom = jr+"-"+mois+"-"+ann; 
		
		
		
		try {
			@SuppressWarnings("unused")
			AjoutPromotion aj = new AjoutPromotion( ancien, nouveau, date_prom, matricule);
		} catch (SQLException e) {  e.printStackTrace();  }
		
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/src/vues/ResPromotion.jsp");
		dispatch.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}
}




