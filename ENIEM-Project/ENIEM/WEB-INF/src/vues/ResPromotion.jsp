<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/menuOng.css"/>
<title>Promotion ajout�e avec succ�s</title>
</head>
<body>

	<div class="entete">
		<p style="text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:395px;padding-right:395px;">PERSONNEL ET PAIE</p>
	</div>
	
	<div style="margin-left:230px;position:absolute;margin-top:-97px;">
		<table>
			<tr>
				<td style="border-top:516px solid silver;"></td>
			</tr>		
		</table>
	</div>
	
	<div style="position:absolute; top:6px; left:100px;">
		<img src="Images/logoEniem2.png" alt="logoEniem2">
	</div>
	
	<div class="cadrSucc" style="margin-left:400px;margin-top:190px;width:480px;heigh350px;">
		<div style="text-align:left; color:#36A753; font-weight:bold; font-size:18px;font-family:Arial;fond-size:14px;">
			Cette promotion a �t� ajout�e avec succ�s<span style="color:#C6E4BE;">_____</span> <img src="Images/succes.png" alt="succ">
			<br/>
		</div>
		<div style="text-align:left; color:black; font-weight:bold; font-size:16px;font-family:Arial;margin-top:20px;fond-size:14px;">
			<span style="color:blue;">Ancien poste :</span><%= request.getParameter("anc_post").toString()%><br/><br/>
			<span style="color:blue;">Nouveau poste :</span><%= request.getParameter("nouv_post").toString()%><br/><br/>
			<span style="color:blue;">Date de la promotion :</span><%= request.getParameter("jour_pro").toString()%>-<%= request.getParameter("mois_pro").toString()%>-<%= request.getParameter("annee_pro").toString()%><br/><br/>
		</div>
		<div style="position:absolute; top:560px; left:1080px;">
			<a href="PROMOTION" title="Retour au formulaire d'ajout de promotion"><img src="Images/bouton-retour-accueil.png" alt="bouton-retour-accueil"></a>
		</div>
	</div>
</body>
</html>