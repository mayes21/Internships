package com.eniem.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connexion_DB 
	{
		public static Connection conn ;

		public Connexion_DB()
		{
			String driver="org.postgresql.Driver";
			String user="postgres";
			String passwrd="asmayes";
			String url="jdbc:postgresql://localhost:5432/ENIEM";
				
			try
			{
			    Class.forName(driver);
			    System.out.println("Driver OK");
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("Problème de chargement du driver");
	    	}
			
			try
		    {
		        conn = DriverManager.getConnection(url, user, passwrd);
		        System.out.println("Connexion établie");
		    }
			catch(SQLException ex)
		    {
		        System.out.println("Problème de connexion");
		    }
		}

	}



