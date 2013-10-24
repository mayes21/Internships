package com.eniem.clsobjt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eniem.fonctions.AjoutEmp;
import com.eniem.models.Connexion_DB;

@SuppressWarnings("serial")
public class ResEmp extends HttpServlet{
	

	static Connection conn ;
	
	public void init() throws ServletException
	{
		@SuppressWarnings("unused")
		Connexion_DB conn = new Connexion_DB();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{	
		String matricule_chiffre = (String) request.getParameter("chiffre_mat");
		String matricule_lettre = (String) request.getParameter("lettre_mat");
		String nom = (String) request.getParameter("nom_emp");
		String prenom = (String) request.getParameter("prenom_emp");
		String jrnaiss = (String) request.getParameter("jour_emp");
		String moisnaiss = (String) request.getParameter("mois_emp");
		String annaiss = (String) request.getParameter("annee_emp");
		String lieunaiss = (String) request.getParameter("lieu_nais_emp");
		String adr = (String) request.getParameter("adr_emp");
		String sexe = (String) request.getParameter("sexe_emp");
		String nss = (String) request.getParameter("nss_emp");
		String numtel = (String) request.getParameter("tel_emp");
		String  jrecrut = (String) request.getParameter("jour_recrut_emp");
		String  moisrecrut = (String) request.getParameter("mois_recrut_emp");
		String  annrecrut = (String) request.getParameter("annee_recrut_emp");
		String situfam = (String) request.getParameter("SF");
		String situprof = (String) request.getParameter("SP");
		
		String date_nais = jrnaiss+"-"+moisnaiss+"-"+annaiss; 
		String date_recrut = jrecrut+"-"+moisrecrut+"-"+annrecrut; 
		String matricule = matricule_chiffre+matricule_lettre;
		
		 
		try {
			AjoutEmp aj = new AjoutEmp( matricule, nom, prenom, date_nais,lieunaiss, adr, sexe, nss, numtel, date_recrut, situfam, situprof);
			if (aj.valide == "ok")
			{RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/src/vues/resEmp.jsp");
			dispatch.forward(request, response);}
			else
			{RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/src/vues/ErreurMatricule.jsp");
			dispatch.forward(request, response);}
		} catch (SQLException e) {  e.printStackTrace();  }
		
		
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		doGet(request, response);
	}
}



