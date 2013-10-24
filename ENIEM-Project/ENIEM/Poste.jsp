<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/menuOng.css"/>
<title>Poste</title>
<script language="Javascript" src="JavaScript/formPoste.js"></script>
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
  				<li class="ong"><a href="CONTRAT"><span><b>Contrat</b></span></a></li>
  				<li class="ong" id="actif"><span><b>Evenement</b></span></li>
  				<li class="ong"><a href="deconnexionperspaie.do"><span><b>Déconnexion</b></span></a></li>
 			</ul>
 		 </div>
	</div>	
	
	<div style="position:absolute;top:173px;left:430px;">
		<p style="color:grey;background-color:#DAE6E7;border:#C5DCE4 solid 3px;padding:2px 2px 2px 2px;font-family:Arial;font-size:24px;"><b>Affecter un employé</b></p>
	</div>
	
	<div class="cadre" style="margin-left:400px; margin-top:110px;width:500px;height:295px;">
	<form name="FormulairePoste" action="FormPoste.do" method="post" onSubmit="return verifformpost()">
		<table>
		<% 
				String matricule = request.getParameter("matricule");
				out.println(" <input type=\"hidden\" name=\"matricule\" value=\""+matricule+"\" />");%>
			<tr>
				<td class="td">Intitulé du poste : </td>
				<td class="td2"><input class="moz" type="text" name="int_post" size="30" maxlength=20/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Tâches du poste : </td>
				<td class="td2"><textarea class="moz" name="tach_post" rows=2 cols=35 onkeypress="this.value=this.value.substr(0,70)"></textarea></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Niveau d'étude requis : </td>
				<td class="td2"><input class="moz" type="text" name="niv_etud_req" size="30" maxlength=20/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Specialité du poste : </td>
				<td class="td2"><input class="moz" type="text" name="spec_post" size="30" maxlength=20/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Durée de la période d'essai : </td>
				<td class="td2"><select class="choix" name="dur_per_ess">
									<option selected></option>
									<option>2 MOIS</option>
									<option>4 MOIS</option>
									<option>6 MOIS</option>
								</select>
				</td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Nuisance du poste : </td>
				<td class="td2"><select class="choix" name="nuis_post">
									<option selected></option>
									<option>01</option>
									<option>02</option>
									<option>03</option>
									<option>04</option>
									<option>05</option>
									<option>06</option>
									<option>07</option>
									<option>08</option>
									<option>09</option>
									<option>10</option>
									<option>11</option>
									<option>12</option>
								</select>
				</td>
			</tr>
			<tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
			</table>
			
			<div style="margin-left:30%;">
		<table>
		<tr>
			<td><input type="submit" name="valider" value="VALIDER"/></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td><input type="reset" name="reinit" value="REINITIALISER"/></td>
		</tr>
		</table>
		</div>			
									
	</form>
	</div>
	
	<div style="position:absolute; top:560px; left:1080px;">
		<a href="EVENEMENT" title="Retour au menu Evenement"><img src="Images/bouton-retour-accueil.png" alt="bouton-retour-accueil"></a>
	</div>
	
</body>
</html>