<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/menuOng.css"/>
<title>Contrat</title>
<script language="Javascript" src="JavaScript/formctr.js"> </script>
<script language="Javascript" src="JavaScript/formAcc.js"></script>
</head>
<body>

	<div style="margin-left:230px;position:absolute;margin-top:41px;">
		<table>
			<tr>
				<td style="border-top:474px solid silver;"></td>
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
  				<li class="ong"><a href="EMPLOI2"><span><b>Emploi</b></span></a></li>
  				<li class="ong"><a href="EVENEMENT"><span><b>Evenement</b></span></a></li>
  				<li class="ong" id="actif"><span><b>Contrat</b></span></li>
  				<li class="ong"><a href="deconnexionperspaie.do"><span><b>Déconnexion</b></span></a></li>
 			</ul>
 		 </div>
	</div>	
	<div style="top:120px;">
	<%
	 Class.forName("org.postgresql.Driver");
    java.sql.Connection cnx = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/ENIEM", "postgres", "asmayes");
    java.sql.Statement req = cnx.createStatement();
    
    String sql = "select matricule, nomemp, prenomemp from employe";
    out.println("<center><form name=\"formulaireModif\" action=\"listeContrat.jsp\" method=\"post\" onSubmit=\"return verifAcc()\">");
    out.println("<center><table width=\"50%\"  border=0% >");
    out.println("<br>");
    out.println("<tr><center><font size=6><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">   " +
            "Ajouter un contrat</font></center></tr>");
    out.println("<thead><br>");
    out.println("<tr>");
    out.println("<th width=\"30%\" align=\"center\" bgcolor=\"#CCCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"> Nom");
    out.println("</th>");
    out.println("<th width=\"28%\" align=\"center\" bgcolor=\"#CCCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"> Prénom");
    out.println("</th>");
    out.println("<th width=\"22%\" align=\"center\" bgcolor=\"#CCCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"> matricule");
    out.println("</th>");
    out.println("</tr>");
    out.println("</thead>");
    out.println("<tbody>");
    java.sql.ResultSet rs = req.executeQuery(sql);
    while (rs.next())
        {
            String id = rs.getString(1);
            String NOM = rs.getString(2);
            String PRE = rs.getString(3);
            out.println("<tr>");
            out.println("<td align=\"center\" bgcolor=\"#C9DCEF\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">"+NOM+"</td>");
            out.println("<td align=\"center\" bgcolor=\"#C9DCEF\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">"+PRE+"</td>");
            out.println("<td align=\"center\" bgcolor=\"#C9DCEF\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">"+id+"</td>");
            out.println("<td width=\"5%\" align=\"center\" bgcolor=\"#A6C6D9\"><input type=\"radio\" name=\"matricule\" value=\""+id+"\"></td>");
            
        }
    rs.close();
                    req.close();
                    cnx.close();
                    //out.println("</body>");
                    //out.println("</html>");
                    out.println("</tbody>");
                    out.println("</table>");
                    out.println("<br>");
                    out.println("<input type=\"submit\" name=\"modif\" value=\"Suivant\"/>");
                    out.println("</center");
                    out.println("</form>");

                out.println("</td>");
                out.println("</tr>");
                out.println("</table>");
%> 
</div>

	

</body>
</html>