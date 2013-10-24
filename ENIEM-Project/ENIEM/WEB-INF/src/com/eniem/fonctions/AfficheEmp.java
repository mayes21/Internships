package com.eniem.fonctions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.eniem.models.Connexion_DB;


public class AfficheEmp {
	static Statement state;
	public ResultSet rs;
	
	public AfficheEmp(String matricule) throws SQLException
	{
		
		Statement state = Connexion_DB.conn.createStatement();
		
		String query = "SELECT * FROM employe where matricule = '"+matricule+"'";
		try
		{
			ResultSet rs = state.executeQuery(query);
		}
		catch(Exception e)
		{
			System.out.println("Erreur dans : Affichage Employé.");
		}
	}

}

