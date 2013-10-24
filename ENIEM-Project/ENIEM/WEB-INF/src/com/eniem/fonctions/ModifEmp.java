package com.eniem.fonctions;

import java.sql.SQLException;
import java.sql.Statement;
import com.eniem.models.Connexion_DB;


public class ModifEmp {
	static Statement state;
	
	public ModifEmp(String matricule, String nom,String prénom, String date_naiss, String lieunaiss, String adr, String sexe, String nss, String numtel,String date_recrut, String situfam, String situprof ) throws SQLException
	{
		
		state = Connexion_DB.conn.createStatement();
		
		String query = "UPDATE employe SET (matricule,nomemp,prenomemp, datenais, lieunais, adremp, sexemp, nssemp, telemp,daterec, situfam, situprofemp) " +
				"= ('"+matricule+"','"+nom+"','"+prénom+"','"+date_naiss+"','"+lieunaiss+"','"+adr+"','"+sexe+"','"+nss+"','"+numtel+"','"+date_recrut+"','"+situfam+"','"+situprof+"')";
		try
		{
			state.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println("Erreur dans la modification de l' employé.");
		}
	}

}
