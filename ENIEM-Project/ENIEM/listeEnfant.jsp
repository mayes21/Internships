<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/menuOng.css"/>
<title>Enfant</title>
<script language="Javascript" src="JavaScript/formEnf.js"> </script>
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
		<p style="text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:494px;padding-right:494px;">SOCIAL</p>
	</div>
	
	<!-- <div style="position:absolute; top:138px; left:230px;">
		<img src="Images/essai11.jpg" alt="essai11">
	</div> -->
	
	<div style="position:absolute; top:145px; left:430px;">
		<p style="color:grey;background-color:#DAE6E7;border:#C5DCE4 solid 3px;padding:2px 2px 2px 2px;font-family:Arial;font-size:24px;"><b>Ajouter un enfant</b></p>
	</div>
	
	<div style="position:absolute; top:6px; left:100px;">
		<img src="Images/logoEniem2.png" alt="logoEniem2">
	</div>
	
	<div class="position">
  		<div id="en-tete">
			<ul class="ong1">
  				<li class="ong"><a href="CONJOINTS"><span><b>Conjoint</b></span></a></li>
  				<li class="ong" id="actif"><span><b>Enfant</b></span></li>
  				<li class="ong"><a href="deconnexionsoc.do"><span><b>Déconnexion</b></span></a></li>
 			</ul>
 		 </div>
	</div>	
	
	<div class="cadre" style="margin-left:400px; margin-top:80px;height:255px;width:425px;">
	<form name="FormulaireEnfant" action="FormEnf.do" method="post" onSubmit="return verifform3()">
	
		<table>
		<% 
				String matricule = request.getParameter("matricule");
				
				out.println(" <input type=\"hidden\" name=\"matricule\" value=\""+matricule+"\" />");%>
		 	<tr>	
				<td class="td">Prénom de l'enfant : </td>
				<td class="td2"><input class="moz" type="text" name="prenom_enf" value="" size="30"></td>
			</tr>
			<tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Date de naissance : </td>
				<td class="td2"><select class="choix" name="jour_enf">
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
				
					<select class="choix" name="mois_enf">
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
							
					<select class="choix" name="annee_enf">
						<option selected></option>	
						<%for(int i=1945; i<=2060; i++){ %>
							<option value="<%=i %>"><%=i %></option>
						<%} %>	
					</select>
				</td>
			</tr>
			<tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Sexe : </td>
			    <td class="td2"><input type="radio" name="sexe_enf" value="Masculin">Masculin</td>
			</tr>
			<tr>
			    <td></td>
				<td class="td2"><input type="radio" name="sexe_enf" value="Féminin">Féminin</td>
			</tr>	
			<tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Situation scolaire : </td>
			    <td class="td2"><input type="radio" name="ss_enf" value="Scolarisé(e)">Scolarisé(e)</td>
			</tr>
			<tr>
			    <td></td>
				<td class="td2"><input type="radio" name="ss_enf" value="Non scolarisé(e)">Non scolarisé(e)</td>
			</tr>	
		</table>
		<br/>
		<br/>
		<div style="margin-left:30%;">
		<table>
			<tr>
				<td><input type="submit" name="ajouter" value="AJOUTER"/></td>
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
	
</body>
</html>