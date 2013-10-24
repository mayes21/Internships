package com.eniem.fonctions;

import java.sql.SQLException;
import java.sql.Statement;
import com.eniem.models.Connexion_DB;


public class AjoutPromotion {
	static Statement state;
	
	public AjoutPromotion(String ancien, String nouveau,String date, String matricule) throws SQLException
	{
		
		state = Connexion_DB.conn.createStatement();
		
		String query = "INSERT INTO promotion (ancpost, nouvpost, datpro, matricule) " +
				"values ('"+ancien+"','"+nouveau+"','"+date+"','"+matricule+"')";
		System.out.println(matricule);
		try
		{
			state.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println("Erreur dans l'ajout d'une promotion.");
		}
	}

}

