<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/menuOng.css"/>
<title>Promotion</title>
<script language="Javascript" src="JavaScript/formPromotion.js"></script>
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
		<p style="color:grey;background-color:#DAE6E7;border:#C5DCE4 solid 3px;padding:2px 2px 2px 2px;font-family:Arial;font-size:24px;"><b>Ajouter une promotion</b></p>
	</div>
	
	<div class="cadre" style="margin-left:400px; margin-top:110px;width:420px;height:170px;">
	<form name="FormulairePromotion" action="FormPro.do" method="post" onSubmit="return verifformpro()">
		<table>
		<% 
				String matricule = request.getParameter("matricule");
				
				out.println(" <input type=\"hidden\" name=\"matricule\" value=\""+matricule+"\" />");%>
			<tr>
				<td class="td">Ancien poste : </td>
				<td class="td2"><input class="moz" type="text" name="anc_post" size="30" maxlength=20/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Nouveau poste : </td>
				<td class="td2"><input class="moz" type="text" name="nouv_post" size="30" maxlength=20/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Date de la promotion : </td>
				<td class="td2"><select class="choix" name="jour_pro">
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
					
					<select class="choix" name="mois_pro">
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
					
					<select class="choix" name="annee_pro">
						<option selected></option>
						<%for(int i=1930; i<=2060; i++){ %>
							<option value="<%=i %>"><%=i %></option>
						<%} %>			
					</select> </td>
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