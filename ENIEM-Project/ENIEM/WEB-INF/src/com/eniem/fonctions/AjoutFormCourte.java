package com.eniem.fonctions;

import java.sql.SQLException;
import java.sql.Statement;
import com.eniem.models.Connexion_DB;


public class AjoutFormCourte {
	static Statement state;
	
	public AjoutFormCourte(String intitule, String dat_deb, String dat_fin, String thm, String duree, String matricule) throws SQLException
	{
		
		state = Connexion_DB.conn.createStatement();
		
		String query = "INSERT INTO formcoudur (intform, durform, thmform, matricule, datdeb, datfin) " +
				"values ('"+intitule+"','"+duree+"','"+thm+"','"+matricule+"','"+dat_deb+"','"+dat_fin+"')";
		try
		{
			state.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println("Erreur dans l'ajout d'une formation courte durée.");
		}
	}

}
