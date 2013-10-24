<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/menuOng.css"/>
<title>Emploi</title>
</head>
<body>

	<div style="margin-left:230px;position:absolute;margin-top:41px;">
		<table>
			<tr>
				<td style="border-top:750px solid silver;"></td>
			</tr>		
		</table>
	</div>
	
	<div class="entete">
		<p style="text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:395px;padding-right:395px;">PERSONNEL ET PAIE</p>
	</div>
	
	<div style="position:absolute; top:6px; left:100px;">
		<img src="Images/logoEniem2.png" alt="logoEniem2">
	</div>
	
	<div class="position">
  		<div id="en-tete">
			<ul class="ong1">
  				<li class="ong" id="actif"><span><b>Emploi</b></span></li>
  				<li class="ong"><a href="CONTRAT"><span><b>Contrat</b></span></a></li>
  				<li class="ong"><a href="EVENEMENT"><span><b>Evenement</b></span></a></li>
  				<li class="ong"><a href="deconnexionperspaie.do"><span><b>Déconnexion</b></span></a></li>
 			</ul>
 		 </div>
	</div>	
	
<%
		String matricule = request.getParameter("idModif");
		Class.forName("org.postgresql.Driver");
		java.sql.Connection cnx = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/ENIEM", "postgres", "asmayes");
		java.sql.Statement req = cnx.createStatement(/*ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE*/);
	
		String sql = "select * from employe where matricule = '"+matricule+"'";
		java.sql.ResultSet rs = req.executeQuery(sql);
	
		while (rs.next())
		{
		 
		 String nom = rs.getString(2);
		 String PRE = rs.getString(3);
		 String datenais = rs.getString(4);
		 String lieunais = rs.getString(5);
		 String adr = rs.getString(6);
		 String sex = rs.getString(7);
		 String nss = rs.getString(8);
		 String tel = rs.getString(9);
		 String daterec = rs.getString(10);
 		 String situfam = rs.getString(11);
 		 String situprof = rs.getString(12);

		
		
		out.println("<div class=\"cadre\" style=\"margin-left:400px; margin-top:80px;width:570px;height:585px;\">");
		out.println("<b>Modification de l'employé: <u>"+matricule+"     "+nom+"       "+PRE);
		out.println("<br/><br/><br/><br/>");
		out.println("<form name=\"FormulaireEmployé\" action=\"ResModif.jsp\" method=\"post\" onSubmit=\"return verifform()\">");
		out.println("<table><tr>");
		out.println(" <input type=\"hidden\" name=\"matricule\" value=\""+matricule+"\" />");
		out.println("<td class=\"td\">Nom : </td><td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"nom_emp\" size=\"30\" value=\""+nom+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Prénom : </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"prenom_emp\" size=\"30\" value=\""+PRE+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Date de naissance: </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"datnais\" size=\"30\" value=\""+datenais+"\"/></td>");
		
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Lieu de naissance : </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"lieu_nais_emp\" size=\"30\" value=\""+lieunais+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Adresse : </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"adr_emp\" size=\"55\" value=\""+adr+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Sexe: </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"sexe\" size=\"30\" value=\""+sex+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Numéro SS : </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"nss_emp\" size=\"30\" value=\""+nss+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Numéro de tel : </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"tel_emp\" size=\"30\" value=\""+tel+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Date de recrutement: </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"datrec\" size=\"30\" value=\""+daterec+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Situation familiale : </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"SF\" size=\"30\" value=\""+situfam+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Situation professionnelle : </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"SP\" size=\"30\" value=\""+situprof+"\"/></td>");
		out.println("</tr>");
		}
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("</table>");
		out.println("<br/>");
		out.println("<div style=\"margin-left:30%;\">");
		out.println("<table>");
		out.println("<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>");
		out.println("<td><input type=\"submit\" name=\"ajouter\" value=\"Modifier\"/></td>");
		out.println("<td></td>");
		out.println("<td></td>");
		out.println("<td></td>");
		out.println("<td></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</div>	");
		out.println("</form>");
		out.println("</div>");		
			
%>
</body>
</html>