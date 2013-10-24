package com.eniem.fonctions;

import java.sql.SQLException;
import java.sql.Statement;
import com.eniem.models.Connexion_DB;


public class AjoutEmp {
	static Statement state;
	public String valide = "ok";
	
	public AjoutEmp(String matricule, String nom,String prénom, String date_naiss, String lieunaiss, String adr, String sexe, String nss, String numtel,String date_recrut, String situfam, String situprof ) throws SQLException
	{
		
		state = Connexion_DB.conn.createStatement();
		
		String query = "INSERT INTO employe (matricule,nomemp,prenomemp, datenais, lieunais, adremp, sexemp, nssemp, telemp,daterec, situfam, situprofemp) " +
				"values ('"+matricule+"','"+nom+"','"+prénom+"','"+date_naiss+"','"+lieunaiss+"','"+adr+"','"+sexe+"','"+nss+"','"+numtel+"','"+date_recrut+"','"+situfam+"','"+situprof+"')";
		try
		{
			state.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println("Erreur dans l'ajout d'un employé.");
			valide = "non";
		}
	}

}
