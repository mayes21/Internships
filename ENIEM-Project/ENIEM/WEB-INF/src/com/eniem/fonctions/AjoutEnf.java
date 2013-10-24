package com.eniem.fonctions;

import java.sql.SQLException;
import java.sql.Statement;
import com.eniem.models.Connexion_DB;

public class AjoutEnf {
	
public Statement state;

public AjoutEnf(String prenom, String date_naiss, String sexe, String ss, String matricule ) throws SQLException
{
	
	state = Connexion_DB.conn.createStatement();
	
	String query = "INSERT INTO enfant (prenomenf, datenaisenf, sexenf, situscolaire, matricule) " +
			"values ('"+prenom+"','"+date_naiss+"','"+sexe+"','"+ss+"','"+matricule+"')";
	try
	{
		state.executeUpdate(query); 
	}
	catch(Exception e)
	{
		System.out.println("Erreur dans l'ajout d'un enfant.");
	}
	
	state.close();
}
}