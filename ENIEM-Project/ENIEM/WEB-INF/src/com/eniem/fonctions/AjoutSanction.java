package com.eniem.fonctions;

import java.sql.SQLException;
import java.sql.Statement;
import com.eniem.models.Connexion_DB;


public class AjoutSanction {
	static Statement state;
	
	public AjoutSanction(String designation, String degre, String motif, String date_deb, String date_fin, String nbjr, String matricule) throws SQLException
	{
		
		state = Connexion_DB.conn.createStatement();
		
		String query = "INSERT INTO sanction (dessanc, degsanc, motsanc, datdebsanc, datfinsanc, nbrjrsanc, matricule) " +
				"values ('"+designation+"','"+degre+"','"+motif+"','"+date_deb+"','"+date_fin+"','"+nbjr+"','"+matricule+"')";
		try
		{
			state.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println("Erreur dans l'ajout d'une sanction.");
		}
	}

}

