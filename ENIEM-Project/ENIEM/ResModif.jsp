<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
    <%@ page import="java.sql.SQLException"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/menuOng.css"/>
<title>Modifie(e) avec succes</title>
</head>
<body>
	
		<div class="entete">
		<p style="text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:395px;padding-right:395px;">PERSONNEL ET PAIE</p>
	</div>
	
	<div style="margin-left:230px;position:absolute;margin-top:-207px;">
		<table>
			<tr>
				<td style="border-top:516px solid silver;"></td>
			</tr>		
		</table>
	</div>
	
	<div style="position:absolute; top:6px; left:100px;">
		<img src="Images/logoEniem2.png" alt="logoEniem2">
	</div>
	
	<div class="cadrSucc" style="margin-left:450px;margin-top:300px;width:400px;height:70px;">
		<div style="text-align:left; color:#36A753; font-weight:bold; font-size:18px;font-family:Arial;fond-size:14px;">
			Employé modifié avec succès<span style="color:#C6E4BE;">_____</span> <img src="Images/succes.png" alt="succ">
			<br/>
		</div>
		
		<div style="position:absolute; top:560px; left:1050px;">
			<a href="EMPLOI2" title="Retour à la liste de modification"><img src="Images/bouton-retour-accueil.png" alt="bouton-retour-accueil"></a>
		</div>
	</div>
	
	<%
	Class.forName("org.postgresql.Driver");
	java.sql.Connection cnx = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/ENIEM", "postgres", "asmayes");
	java.sql.Statement req = cnx.createStatement();
    
	String matricule = request.getParameter("matricule");
	String nom = request.getParameter("nom_emp");
	String prénom = request.getParameter("prenom_emp");
	String date_naiss = request.getParameter("datnais");
	String lieunaiss = request.getParameter("lieu_nais_emp");
	String adr = request.getParameter("adr_emp");
	String sexe = request.getParameter("sexe");
	String nss = request.getParameter("nss_emp");
	String numtel = request.getParameter("tel_emp");
	String date_recrut = request.getParameter("datrec");
	String situfam = request.getParameter("SF");
	String situprof = request.getParameter("SP");
    

	String query = "UPDATE employe SET (nomemp,prenomemp, datenais, lieunais, adremp, sexemp, nssemp, telemp,daterec, situfam, situprofemp) " +
	"= ('"+nom+"','"+prénom+"','"+date_naiss+"','"+lieunaiss+"','"+adr+"','"+sexe+"','"+nss+"','"+numtel+"','"+date_recrut+"','"+situfam+"','"+situprof+"') WHERE matricule = '"+matricule+"'";
	try
	{
		req.executeUpdate(query);
	}
	catch(Exception e)
	{
		System.out.println("Erreur dans la modification de l'employé.");
	}

	
	

%>
</body>
</html>