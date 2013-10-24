package com.eniem.fonctions;

import java.sql.SQLException;
import java.sql.Statement;
import com.eniem.models.Connexion_DB;


public class AjoutFormLongue {
	static Statement state;
	
	public AjoutFormLongue(String intform, String eclform, String matricule, String intdip, String datobtdip, String datdeb, String datfin) throws SQLException
	{
		
		state = Connexion_DB.conn.createStatement();
		
		String query = "INSERT INTO formlongdur (intform, eclform, matricule, intdip, datobtdip, datdeb, datfin) " +
				"values ('"+intform+"','"+eclform+"','"+matricule+"','"+intdip+"','"+datobtdip+"','"+datdeb+"','"+datfin+"')";
		try
		{
			state.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println("Erreur dans l'ajout d'une formation longue durée.");
		}
	}

}

