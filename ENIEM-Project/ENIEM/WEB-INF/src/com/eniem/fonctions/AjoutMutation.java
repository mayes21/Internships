package com.eniem.fonctions;

import java.sql.SQLException;
import java.sql.Statement;
import com.eniem.models.Connexion_DB;


public class AjoutMutation {
	static Statement state;
	
	public AjoutMutation(String nouvpost, String nouvdept,String raimut, String datmut, String matricule) throws SQLException
	{
		
		state = Connexion_DB.conn.createStatement();
		
		String query = "INSERT INTO mutation (desnouvpost, deptnouvpost, raimut, datmut, matricule) " +
				"values ('"+nouvpost+"','"+nouvdept+"','"+raimut+"','"+datmut+"','"+matricule+"')";
		try
		{
			state.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println("Erreur dans l'ajout d'une mutation.");
		}
	}

}

