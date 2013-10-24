package com.eniem.fonctions;

import java.sql.SQLException;
import java.sql.Statement;
import com.eniem.models.Connexion_DB;


public class AjoutContrat {
	static Statement state;
	
	public AjoutContrat(String type, String designation, String date_deb, String date_fin, String matricule)throws SQLException
	{
		
		state = Connexion_DB.conn.createStatement();
		
		String query = "INSERT INTO contrat (typcontr, datdebcontr, datfincontr, descontr, matricule) " +
				"values ('"+type+"','"+date_deb+"','"+date_fin+"','"+designation+"','"+matricule+"')";
		try
		{
			state.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println("Erreur dans l'ajout d'un contrat.");
		}
	}

}
