<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/menuOng.css"/>
<title>Emploi</title>
<script language="Javascript" charset="utf8" src="JavaScript/formEmp.js"> </script>
</head>
<body>

	<div style="margin-left:230px;position:absolute;margin-top:42px;">
		<table>
			<tr>
				<td style="border-top:776px solid silver;"></td>
			</tr>		
		</table>
	</div>
	
	<div class="entete">
		<p style="text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:355px;padding-right:355px;">EMPLOI ET FORMATION</p>
	</div>
	
	<div style="position:absolute; top:145px; left:430px;">
		<p style="color:grey;background-color:#DAE6E7;border:#C5DCE4 solid 3px;padding:2px 2px 2px 2px;font-family:Arial;font-size:24px;"><b>Ajouter un employ&eacute</b></p>
	</div>
	
	<!-- <div style="position:absolute; top:138px; left:230px;">
		<img src="Images/essai11.jpg" alt="essai11">
	</div>  -->
	
	<div style="position:absolute; top:6px; left:100px;">
		<img src="Images/logoEniem2.png" alt="logoEniem2">
	</div>
	
	<div class="position">
  		<div id="en-tete">
			<ul class="ong1">
  				<li class="ong" id="actif"><span><b>Emploi</b></span></li>
  				<li class="ong"><a href="FORMATION"><span><b>Formation</b></span></a></li>
  				<li class="ong"><a href="deconnexionempform.do"><span><b>Déconnexion</b></span></a></li>
 			</ul>
 		 </div>
	</div>		
	
	<div class="cadre" style="margin-left:400px; margin-top:80px;width:590px;height:630px;">
	<form name="FormulaireEmploye" action="FormEmp.do" method="post" onSubmit="return verifform();">
	
	
		<table>
			<tr>
				<td class="td">*Matricule :</td>	
				<td class="td2"><input class="moz" type="text" name="chiffre_mat" size="5" maxlength=5 onKeypress="return matValide(event);">
				<select class="choix" name="lettre_mat">
									<option selected></option>
									<option value="A">A</option>
									<option value="B">B</option>
									<option value="C">C</option>
									<option value="D">D</option>
									<option value="E">E</option>
									<option value="F">F</option>
									<option value="G">G</option>
									<option value="H">H</option>
									<option value="J">J</option>
									<option value="K">K</option>
									<option value="L">L</option>
									<option value="M">M</option>
									<option value="N">N</option>
									<option value="P">P</option>
									<option value="Q">Q</option>
									<option value="R">R</option>
									<option value="S">S</option>
									<option value="T">T</option>
									<option value="U">U</option>
									<option value="V">V</option>
									<option value="W">W</option>
									<option value="X">X</option>
									<option value="Y">Y</option>
									<option value="Z">Z</option>
								</select>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">*Nom : </td>
				<td class="td2"><input class="moz" type="text" name="nom_emp" size="30" maxlength=25 onKeypress="return nomValide(event);"/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">*Prénom : </td>
				<td class="td2"><input class="moz" type="text" name="prenom_emp" size="30" maxlength=25 onKeypress="return nomValide(event);"/></td>	
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">*Date de Naissance : </td>
				<td class="td2"><select class="choix" name="jour_emp">
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
				
				<select class="choix" name="mois_emp">
								<option selected></option>
								<option value="Janvier">Janvier</option>
								<option value="Février">Fevrier</option>
								<option value="Mars">Mars</option>
								<option value="Avril">Avril</option>
								<option value="Mai">Mai</option>
								<option value="Juin">Juin</option>
								<option value="Juillet">Juillet</option>
								<option value="Août">Aout</option>
								<option value="Septembre">Septembre</option>
								<option value="Octobre">Octobre</option>
								<option value="Novembre">Novembre</option>
								<option value="Décembre">Decembre</option>
					</select>
				
				<select class="choix" name="annee_emp">
						<option selected></option>
						<%for(int i=1930; i<=2060; i++){ %>
							<option value="<%=i %>"><%=i %></option>
						<%} %>			
					</select>  
				</td>
			</tr>	
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">*Lieu de naissance : </td>
				<td class="td2"><input class="moz" type="text" name="lieu_nais_emp" size="30" maxlength=25/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">*Adresse : </td>
				<td class="td2"><input class="moz" type="text" name="adr_emp" size="55" maxlength=50/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">*Sexe : </td>
				<td class="td2"><input type="radio" name="sexe_emp" value="Homme"/>Homme</td>
			</tr>
			<tr>
				<td></td>
				<td class="td2"><input type="radio" name="sexe_emp" value="Femme"/>Femme</td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">*Numéro SS : </td>
				<td class="td2"><input class="moz" type="text" name="nss_emp" size="30" maxlength=12 onKeypress="return numValide(event);"/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Numéro de tel : </td>
				<td class="td2"><input class="moz" type="text" name="tel_emp" size="30" maxlength=13 onKeypress="return numValide(event);"/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">*Date de recrutement : </td>
				<td class="td2"><select class="choix" name="jour_recrut_emp">
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
				
				<select class="choix" name="mois_recrut_emp">
								<option selected></option>
								<option value="Janvier">Janvier</option>
								<option value="Février">Fevrier</option>
								<option value="Mars">Mars</option>
								<option value="Avril">Avril</option>
								<option value="Mai">Mai</option>
								<option value="Juin">Juin</option>
								<option value="Juillet">Juillet</option>
								<option value="Août">Aout</option>
								<option value="Septembre">Septembre</option>
								<option value="Octobre">Octobre</option>
								<option value="Novembre">Novembre</option>
								<option value="Décembre">Decembre</option>
					</select>
				
				<select class="choix" name="annee_recrut_emp">
						<option selected></option>
						<%for(int i=1970; i<=2080; i++){ %>
							<option value="<%=i %>"><%=i %></option>
						<%} %>			
					</select>
				</td>	
			</tr>
			<tr></tr><tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">*Situation familiale : </td>
				<td class="td2"><select class="choix" name="SF">
								<option selected></option>
								<option value="Célibataire">Celibataire</option>
								<option value="Marié(e)">Marie(e)</option>
								<option value="Divorcé(e)">Divorce(e)</option>
								<option value="Veuf(ve)">Veuf(ve)</option>
								</select>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">*Situation professionnelle : </td>
				<td class="td2"><input type="radio" name="SP" value="Actif"/>Actif</td>
			</tr>
			<tr>
				<td></td>
				<td class="td2"><input type="radio" name="SP" value="Inactif"/>Inactif</td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
		</table>
	<br/>
	<div style="margin-left:35%;">
	<table>
		<tr>
			<td><input type="submit" name="ajouter" value="AJOUTER" /></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td><input type="reset" name="reinit" value="REINITIALISER"/></td>
		</tr>
	</table>
	</div>	
	
	</form>
		<br/><br/><br/>
		<p>Tous les champs précédés d'un astérisque (*) sont obligatoires.</p>
	</div>

</body>
</html>