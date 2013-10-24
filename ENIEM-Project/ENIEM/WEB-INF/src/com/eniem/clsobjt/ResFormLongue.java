package com.eniem.clsobjt;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.fonctions.AjoutFormLongue;
import com.eniem.models.Connexion_DB;

@SuppressWarnings("serial")
public class ResFormLongue extends HttpServlet{
	

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
		
		String intform = (String) request.getParameter("int_fld");
		String eclform = (String) request.getParameter("ecole_fld");
		String intdip = (String) request.getParameter("dip_obt");
		
		String jr_obt = (String) request.getParameter("jour_obt");
		String mois_obt = (String) request.getParameter("mois_obt");
		String ann_obt = (String) request.getParameter("annee_obt");
		
		
		
		String jrdeb = (String) request.getParameter("jour_deb_fld");
		String moisdeb = (String) request.getParameter("mois_deb_fld");
		String anndeb = (String) request.getParameter("annee_deb_fld");
		String jrfin = (String) request.getParameter("jour_fin_fld");
		String moisfin = (String) request.getParameter("mois_fin_fld");
		String annfin = (String) request.getParameter("annee_fin_fld");
		
		String datdeb = jrdeb+"-"+moisdeb+"-"+anndeb; 
		String datfin = jrfin+"-"+moisfin+"-"+annfin; 
		String datobtdip = jr_obt+"-"+mois_obt+"-"+ann_obt; 
		
		
		
		
		try {
			@SuppressWarnings("unused")
			AjoutFormLongue aj = new AjoutFormLongue(intform, eclform, matricule, intdip, datobtdip, datdeb, datfin);
		} catch (SQLException e) {  e.printStackTrace();  }
		
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/src/vues/ResFormLD.jsp");
		dispatch.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}
}


