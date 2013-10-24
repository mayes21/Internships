<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/menuOng.css"/>
<title></title>
</head>
<body>

<div style="margin-left:230px;position:absolute;margin-top:-207px;">
		<table>
			<tr>
				<td style="border-top:516px solid silver;"></td>
			</tr>		
		</table>
	</div>

	<div class="entete">
		<p style="text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:494px;padding-right:494px;">SOCIAL</p>
	</div>
	
	<!--<div style="position:absolute; top:138px; left:230px;">
		<img src="Images/essai11.jpg" alt="essai11">
	</div> -->

	
	<div style="position:absolute; top:6px; left:100px;">
		<img src="Images/logoEniem2.png" alt="logoEniem2">
	</div>
	
	<div class="cadrSucc" style="margin-left:450px;margin-top:300px;width:400px;height:70px;">
		<div style="text-align:left; color:#36A753; font-weight:bold; font-size:18px;font-family:Arial;fond-size:14px;">
			Conjoint supprimé avec succès<span style="color:#C6E4BE;">_____</span> <img src="Images/succes.png" alt="succ">
			<br/>
		</div>
		
		<div style="position:absolute; top:560px; left:1050px;">
			<a href="CONJOINTS" title="Retour à la liste de modification"><img src="Images/bouton-retour-accueil.png" alt="bouton-retour-accueil"></a>
		</div>
	</div>

<%
	Class.forName("org.postgresql.Driver");
	java.sql.Connection cnx = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/ENIEM", "postgres", "asmayes");
	java.sql.Statement req = cnx.createStatement();
    
	String matricule = request.getParameter("matricule");
    

	String query = "DELETE FROM conjoint WHERE matricule='"+matricule+"'";
	try
	{
		req.executeUpdate(query);
	}
	catch(Exception e)
	{
		System.out.println("Erreur dans la suppression d'un conjoint.");
	}

	
	

%>
</body>
</html>
</body>
</html>