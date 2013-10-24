package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.filter.ElementFilter;
import org.jdom2.input.SAXBuilder;

public class Data 
{
	private ArrayList<String> auteurs = new ArrayList<String>();
	private	ArrayList<String> titres = new ArrayList<String>();
	private ArrayList<String> textes = new ArrayList<String>();
	
	File fichier = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	SAXBuilder builder = new SAXBuilder();
	File xmlFile = new File("all_senterritoire_150docs.xml");
	
	public void getData()
	{
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
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(ArrayList<String> auteurs) {
		this.auteurs = auteurs;
	}

	public ArrayList<String> getTitres() {
		return titres;
	}

	public void setTitres(ArrayList<String> titres) {
		this.titres = titres;
	}

	public ArrayList<String> getTextes() {
		return textes;
	}

	public void setTextes(ArrayList<String> textes) {
		this.textes = textes;
	}

	
	
	
}


