<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designAccueil" href="CSS/CSSEmpFor.css"/>
<title>Employé ajouté avec succès</title>
<script language='javascript'>
   history.forward();
</script>
</head>
<body>

	<div class="entete">
		<p style="text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:375px;padding-right:375px;">EMPLOI ET FORMATION</p>
	</div>
	
	<div style="margin-left:230px;position:absolute;margin-top:-7px;">
		<table>
			<tr>
				<td style="border-top:516px solid silver;"></td>
			</tr>		
		</table>
	</div>
	
	<div style="position:absolute; top:6px; left:100px;">
		<img src="Images/logoEniem2.png" alt="logoEniem2">
	</div>
	
	<div class="cadrSucc" style="margin-left:370px;margin-top:100px;width:500px;height:480px;">
		<div style="text-align:left; color:#36A753; font-weight:bold; font-size:18px;font-family:Arial;fond-size:14px;">
			Cet employé a été ajouté avec succès<span style="color:#C6E4BE;">_____</span> <img src="Images/succes.png" alt="succ">
			<br/>
		</div>
	
	
		<div style="text-align:left; color:black; font-weight:bold; font-size:16px;font-family:Arial;margin-top:20px;fond-size:14px;">
			<span style="color:blue;">Matricule :</span><%= request.getParameter("chiffre_mat").toString()+request.getParameter("lettre_mat").toString()%><br/><br/>
			<span style="color:blue;">Nom :</span> <%= request.getParameter("nom_emp").toString()%><br/><br/>
			<span style="color:blue;">Prénom :</span> <%= request.getParameter("prenom_emp").toString()%><br/><br/>
			<span style="color:blue;">Date de Naissance :</span> <%= request.getParameter("jour_emp").toString()%>-<%= request.getParameter("mois_emp").toString()%>-<%= request.getParameter("annee_emp").toString()%><br/><br/>
			<span style="color:blue;">Lieu de naissance :</span> <%= request.getParameter("lieu_nais_emp").toString()%><br/><br/>
			<span style="color:blue;">Adresse :</span> <%= request.getParameter("adr_emp").toString()%><br/><br/>
			<span style="color:blue;">Sexe :</span> <%= request.getParameter("sexe_emp").toString()%><br/><br/>
			<span style="color:blue;">Numéro SS :</span> <%= request.getParameter("nss_emp").toString()%><br/><br/>
			<span style="color:blue;">Numéro de tel :</span> <%= request.getParameter("tel_emp").toString()%><br/><br/>
			<span style="color:blue;">Date de recrutement :</span>  <%= request.getParameter("jour_recrut_emp").toString()%>-<%= request.getParameter("mois_recrut_emp").toString()%>-<%= request.getParameter("annee_recrut_emp").toString()%><br/><br/>
			<span style="color:blue;">Situation familiale :</span> <%= request.getParameter("SF").toString()%><br/><br/>
			<span style="color:blue;">Situation professionnelle :</span> <%= request.getParameter("SP").toString()%><br/><br/>
		</div>
			<div style="position:absolute; top:560px; left:1050px;">
				<a href="EMPLOI" title="Retour au formulaire d'ajout d'un employé"><img src="Images/bouton-retour-accueil.png" alt="bouton-retour-accueil"></a>
			</div>
	</div>
</body>
</html>