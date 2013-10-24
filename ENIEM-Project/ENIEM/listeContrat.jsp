<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/menuOng.css"/>
<title>Contrat</title>
<script language="Javascript" src="JavaScript/formctr.js"> </script>
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
  				<li class="ong" id="actif"><span><b>Contrat</b></span></li>
  				<li class="ong"><a href="EVENEMENT"><span><b>Evenement</b></span></a></li>
  				<li class="ong"><a href="deconnexionperspaie.do"><span><b>Déconnexion</b></span></a></li>
 			</ul>
 		 </div>
	</div>	
	
	<div style="position:absolute;top:173px;left:430px;">
		<p style="color:grey;background-color:#DAE6E7;border:#C5DCE4 solid 3px;padding:2px 2px 2px 2px;font-family:Arial;font-size:24px;"><b>Ajouter un contrat</b></p>
	</div>
	
	<div class="cadre" style="margin-left:400px; margin-top:110px;width:500px;height:240px;">
	<form name="FormulaireContrat" action="FormContrat.do" method="post" onSubmit="return verifformctr()">
		<table>
		<% 
				String matricule = request.getParameter("matricule");
				
				out.println(" <input type=\"hidden\" name=\"matricule\" value=\""+matricule+"\" />");%>
			<tr>
				<td class="td">Type de contrat : </td>
				<td class="td2"><input class="moz" type="text" name="typ_ctr" size="5" maxlength=3/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Désignation du contrat : </td>
				<td class="td2"><input class="moz" type="text" name="des_ctr" size="40"/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Date de début : </td>
				<td class="td2"><select class="choix" name="jour_deb_ctr">
								<option selected></option>
								<option value="01">01</option>
								<option value="02">02</option>
								<option value="03">03</option>
								<option value="04">04</option>
								<option value="05">05</option>
								<option value="06">06</option>
								<option value="07">07</option>
								<option value="08">08</option>
								<option value="09">09</option>
								<%for(int i=10;i<=31;i++){ %>
									<option value="<%=i %>"><%=i %></option>
								<%} %>	
					</select>
					
					<select class="choix" name="mois_deb_ctr">
								<option selected></option>
								<option value="Janvier">Janvier</option>
								<option value="Février">Février</option>
								<option value="Mars">Mars</option>
								<option value="Avril">Avril</option>
								<option value="Mai">Mai</option>
								<option value="Juin">Juin</option>
								<option value="Juillet">Juillet</option>
								<option value="Août">Août</option>
								<option value="Septembre">Septembre</option>
								<option value="Octobre">Octobre</option>
								<option value="Novembre">Novembre</option>
								<option value="Décembre">Décembre</option>
					</select>
					
					<select class="choix" name="annee_deb_ctr">
						<option selected></option>
						<%for(int i=1930; i<=2060; i++){ %>
							<option value="<%=i %>"><%=i %></option>
						<%} %>			
					</select> 
				</td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Date de fin : </td>
				<td class="td2"><select class="choix" name="jour_fin_ctr">
								<option selected></option>
								<option value="01">01</option>
								<option value="02">02</option>
								<option value="03">03</option>
								<option value="04">04</option>
								<option value="05">05</option>
								<option value="06">06</option>
								<option value="07">07</option>
								<option value="08">08</option>
								<option value="09">09</option>
								<%for(int i=10;i<=31;i++){ %>
									<option value="<%=i %>"><%=i %></option>
								<%} %>	
					</select>
					
					<select class="choix" name="mois_fin_ctr">
								<option selected></option>
								<option value="Janvier">Janvier</option>
								<option value="Février">Février</option>
								<option value="Mars">Mars</option>
								<option value="Avril">Avril</option>
								<option value="Mai">Mai</option>
								<option value="Juin">Juin</option>
								<option value="Juillet">Juillet</option>
								<option value="Août">Août</option>
								<option value="Septembre">Septembre</option>
								<option value="Octobre">Octobre</option>
								<option value="Novembre">Novembre</option>
								<option value="Décembre">Décembre</option>
					</select>
					
					<select class="choix" name="annee_fin_ctr">
						<option selected></option>
						<%for(int i=1930; i<=2060; i++){ %>
							<option value="<%=i %>"><%=i %></option>
						<%} %>			
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
	<div style="position:absolute; top:600px; left:1050px;">
		<a href="CONTRAT" title="Retour au menu evenement"><img src="Images/bouton-retour-accueil.png" alt="bouton-retour-accueil"></a>
	</div>
</body>
</html>