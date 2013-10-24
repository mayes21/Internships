package com.eniem.fonctions;

import java.sql.SQLException;
import java.sql.Statement;
import com.eniem.models.Connexion_DB;


public class AjoutConge {
	static Statement state;
	
	public AjoutConge(String des, String ann,String datdeb, String datfin, String matricule) throws SQLException
	{
		
		state = Connexion_DB.conn.createStatement();
		
		String query = "INSERT INTO conge (descng, anncng, datdebcng, datfincng, matricule) " +
				"values ('"+des+"','"+ann+"','"+datdeb+"','"+datfin+"','"+matricule+"')";
		try
		{
			state.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println("Erreur dans l'ajout d'un congé.");
		}
	}

}

