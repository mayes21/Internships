package com.eniem.clsobjt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.fonctions.AjoutPoste;
import com.eniem.models.Connexion_DB;

@SuppressWarnings("serial")
public class ResPost extends HttpServlet{
	

	static Connection conn ;
	
	public void init() throws ServletException
	{
		@SuppressWarnings("unused")
		Connexion_DB conn = new Connexion_DB();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		String intitule = (String) request.getParameter("int_post");
		String tach = (String) request.getParameter("tach_post");
		String niv_etud_req = (String) request.getParameter("niv_etud_req");
		String spec = (String) request.getParameter("spec_post");
		String dur_per_ess = (String) request.getParameter("dur_per_ess");
		String nuisance = (String) request.getParameter("nuis_post");
		String matricule = (String) request.getParameter("matricule");
		
		try {
			@SuppressWarnings("unused")
			AjoutPoste aj = new AjoutPoste(intitule, tach, niv_etud_req, spec, dur_per_ess, nuisance, matricule);
		} catch (SQLException e) {  e.printStackTrace();  }
		
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/src/vues/ResPost.jsp");
		dispatch.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}
}