<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
 <%@ page import="java.sql.ResultSet, java.sql.SQLException, java.sql.Statement"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/menuOng.css"/>
<title></title>
</head>
<body>

<div class="entete">
		<p style="text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:420px;padding-right:410px;">ADMINISTRATEUR</p>
	</div>
	
	<div style="position:absolute; top:6px; left:100px;">
		<img src="Images/logoEniem2.png" alt="logoEniem2">
	</div>
	
	<div style="margin-left:230px;position:absolute;margin-top:-116px;">
		<table>
			<tr>
				<td style="border-top:515px solid silver;"></td>
			</tr>		
		</table>
	</div>

<div style="margin-left:480px;margin-top:210px;">

<%
	Class.forName("org.postgresql.Driver");
	java.sql.Connection cnx = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/ENIEM", "postgres", "asmayes");
	java.sql.Statement req = cnx.createStatement();
    ResultSet rs;
	String matricule = request.getParameter("matricule");
    

	String query = "SELECT * FROM employe where matricule = '"+matricule+"'";
	
		 rs = req.executeQuery(query);

	while (rs.next())
	{
    	String id = rs.getString(1);
    	String NOM = rs.getString(2);
    
    	String PRE = rs.getString(3);
  	    String datn = rs.getString(4);
  	    String lieun = rs.getString(5);
  	    String adr = rs.getString(6);
   	    String sex = rs.getString(7);
   	    String nss = rs.getString(8);
 	    String tel = rs.getString(9);
 
 	    String datr = rs.getString(10);
	    String sf = rs.getString(11);
	    String sp = rs.getString(12);
    	out.println("<tr>");
      
    	out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>MATRICULE : </font></b>"+id+"</td><br>");
   	    out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>NOM : </font></b>"+NOM+"</td><br>");
    	out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>PRENOM : </font></b>"+PRE+"</td><br>");

        out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>DATE DE NAISSANCE : </font></b>"+datn+"</td><br>");
        out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>LIEU DE NAISSANCE : </font></b>"+lieun+"</td><br>");
        out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>ADRESSE : </font></b>"+adr+"</td><br>");
        out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>SEXE DE L'EMPLOYE </font></b>"+sex+"</td><br>");
        out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>NUMERO DE SECURITE SOCIALE : </font></b>"+nss+"</td><br>");
    	out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>TELEPHONE : </font></b>"+tel+"</td><br>");
    	out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>DATE DE RECRUTEMENT : </font></b>"+datr+"</td><br>");
        out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>SITUATION FAMILIALE : </font></b>"+sf+"</td><br>");
        out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>SITUATION PROFESSIONNELLE : </font></b>"+sp+"</td><br>");
      
        

}
	rs.close();
	
	/*String query1 = "SELECT * FROM mutation where matricule = '"+matricule+"'";
	ResultSet rs1 = req.executeQuery(query1);
	while (rs1.next())
	{
    	String nvp = rs1.getString(1);
    	String nvd = rs1.getString(2);
    
    	String rai = rs1.getString(3);
    	String dat = rs1.getString(4);
    	out.println("<tr>");
        
   	    out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">"+nvp+"</td>");
    	out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">"+nvd+"</td>");
    	out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">"+rai+"</td>");
    	out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">"+dat+"</td>");
    	
	}
	
	rs1.close();
*/
%>

</div>
<div style="position:absolute; top:560px; left:1080px;">
		<a href="CONSULTATION" title="Retour"><img src="Images/bouton-retour-accueil.png" alt="bouton-retour-accueil"></a>
	</div>
</body>
</html>