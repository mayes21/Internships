package main;

import java.io.FileOutputStream;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfWriter;

public class MainData 
{

	   private static Data dt = new Data();
	  private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
	      Font.BOLD);
	  private static Font grayFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
	      Font.BOLD, BaseColor.GRAY);
	  private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
	      Font.BOLD);
	  private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 14,
	      Font.NORMAL);
	  
	public static void main(String[] args) 
	{
		
		dt.getData();
		
		/*for(String titre : dt.getTitres())
		{
			System.out.println(titre);
		}

		for(String auteur : dt.getAuteurs())
		{
			System.out.println(auteur);
		}
		
		for(String texte : dt.getTextes())
		{
			System.out.println(texte);
		}*/
		for(int i=0; i<dt.getTextes().size(); i++)
		{
			String FILE = "/home/amayas/Documents/docPDF/"+dt.getTitres().get(i)+".pdf";
			 
			 try 
			 {
			      Document document = new Document();
			      PdfWriter.getInstance(document, new FileOutputStream(FILE));
			      document.open();
			      addMetaData(document, i);
			      addTitlePage(document, i);
			      //addContent(document);
			      document.close();
			 } 
			 catch (Exception e) 
			 {
			      e.printStackTrace();
			 }
		}
		
		
		 
		
	}
	
	private static void addMetaData(Document document, int i) 
	{
	    document.addTitle(dt.getTitres().get(i));
	    document.addKeywords("Senterritoire");
	    document.addAuthor(dt.getAuteurs().get(i));
	    document.addCreator("Amayas ABBOUTE");
	}
	
	private static void addTitlePage(Document document, int i) throws DocumentException 
	{
		    Paragraph preface = new Paragraph();
		    // We add one empty line
		    addEmptyLine(preface, 1);
		    // Lets write a big header
		    preface.add(new Paragraph(dt.getTitres().get(i), catFont));
		    
		    addEmptyLine(preface, 1);
		    preface.add(new Paragraph(dt.getAuteurs().get(i), grayFont));
		    
		    addEmptyLine(preface, 1);
		    preface.add(new Paragraph(dt.getTextes().get(i), smallBold));
		    
		    document.add(preface);
	}
	
	
	
	private static void addEmptyLine(Paragraph paragraph, int number) {
	    for (int i = 0; i < number; i++) {
	      paragraph.add(new Paragraph(" "));
	    }
	  }
		    
		    

}
