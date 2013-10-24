package com.eniem.clsobjt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.fonctions.AjoutMutation;
import com.eniem.models.Connexion_DB;

@SuppressWarnings("serial")
public class ResMutation extends HttpServlet{
	

	static Connection conn ;
	
	public void init() throws ServletException
	{
		@SuppressWarnings("unused")
		Connexion_DB conn = new Connexion_DB();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		String nouvpost = (String) request.getParameter("nouv_post");
		String nouvdept = (String) request.getParameter("nouv_dept");
		String raison = (String) request.getParameter("rai_mut");
		String jr = (String) request.getParameter("jour_mut");
		String mois = (String) request.getParameter("mois_mut");
		String ann = (String) request.getParameter("annee_mut");
		String matricule = (String) request.getParameter("matricule");
		
		
		String date_mut = jr+"-"+mois+"-"+ann; 
		
		
		
		try {
			@SuppressWarnings("unused")
			AjoutMutation aj = new AjoutMutation( nouvpost, nouvdept, date_mut, raison, matricule);
		} catch (SQLException e) {  e.printStackTrace();  }
		
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/src/vues/ResMutation.jsp");
		dispatch.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}
}



