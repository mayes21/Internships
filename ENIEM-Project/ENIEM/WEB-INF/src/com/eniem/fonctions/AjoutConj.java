package com.eniem.fonctions;

import java.sql.SQLException;
import java.sql.Statement;
import com.eniem.models.Connexion_DB;

public class AjoutConj {

static Statement state;
	
	public AjoutConj(String nom,String prenom, String date_naiss, String situprof, String matricule ) throws SQLException
	{
		
		state = Connexion_DB.conn.createStatement();
		
		String query = "INSERT INTO conjoint (nomconj, prenomconj, datenaisconj, situprofconj, matricule) " +
				"values ('"+nom+"','"+prenom+"','"+date_naiss+"','"+situprof+"','"+matricule+"')";
		try
		{
			state.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println("Erreur dans l'ajout d'un conjoint.");
		}
		
		state.close();
	}
}
