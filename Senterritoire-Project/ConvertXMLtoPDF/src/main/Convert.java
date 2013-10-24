package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.filter.ElementFilter;
import org.jdom2.input.SAXBuilder;

public class Convert 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> auteurs = new ArrayList<String>();
		ArrayList<String> titres = new ArrayList<String>();
		ArrayList<String> textes = new ArrayList<String>();
		
		File fichier = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File("all_senterritoire_150docs.xml");
		
		try
		{
			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();

			Iterator<?> processDescendants = document.getDescendants(new ElementFilter()); 
			
			while(processDescendants.hasNext()) 
			{
				
					Element courant = (Element)processDescendants.next();
					
					String name = courant.getName();
					
					if(name.equals("TITRE"))
					{
						titres.add(courant.getValue());
					}
					
					if(name.equals("AUTEUR"))
					{
						auteurs.add(courant.getValue());
					}
					
					if(name.equals("TEXTE"))
					{
						textes.add(courant.getValue());
					}
					
			}
			
			for(int i=0; i<titres.size(); i++)
			{
				fichier = new File("/home/amayas/Documents/docPDF/"+titres.get(i)+".txt");
				
				if (!fichier.exists()) 
				{
					fichier.createNewFile();
				}
				
				fw = new FileWriter(fichier.getAbsoluteFile());
				bw = new BufferedWriter(fw);
				
				bw.write(titres.get(i)+"\n\n");
				bw.write(auteurs.get(i)+"\n\n");
				bw.write(textes.get(i));
				
				bw.close();
			}
			
			
			
			/*
			for(String titre : titres)
			{
				System.out.println(titre);
			}
			
			System.out.println("\n-------------------------------------------------------------\n");
			int i=0;
			for(String auteur : auteurs)
			{
				i++;
				System.out.println(i+" "+auteur);
			}
			
			System.out.println("\n-------------------------------------------------------------\n");

			int j=0;
			for(String texte : textes)
			{
				j++;
				System.out.println(j+" "+texte);
			}
			
			System.out.println("\n-------------------------------------------------------------\n");
			*/
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
			
			//System.out.println(i+" "+j+" "+k);
	/*		
	try
	{
		
		
		fw = new FileWriter(fichierPDF.getAbsoluteFile());
		bw = new BufferedWriter(fw);
		
		bw.write(courant.getValue());
	}
	catch(IOException ioe)
	{
		System.out.println("IOException "+ioe.getMessage());
	}*/
	



}
