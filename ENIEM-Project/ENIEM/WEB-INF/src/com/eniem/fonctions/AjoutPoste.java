package com.eniem.fonctions;

import java.sql.SQLException;
import java.sql.Statement;
import com.eniem.models.Connexion_DB;


public class AjoutPoste {
	static Statement state;
	
	public AjoutPoste(String intitule, String tach, String nivetudreq, String specialite, String dur, String nuis, String matricule) throws SQLException
	{
		
		state = Connexion_DB.conn.createStatement();
		
		String query = "INSERT INTO poste (intpost, tachpost, nivetudreq, durperess,  nuispost, specpost, matricule) " +
				"values ('"+intitule+"','"+tach+"','"+nivetudreq+"','"+dur+"','"+nuis+"','"+specialite+"','"+matricule+"')";
		try
		{
			state.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println("Erreur dans l'ajout d'un recrutement.");
		}
	}

}

