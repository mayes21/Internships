<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/menuOng.css"/>
<title>Formation</title>
<script language="Javascript" src="JavaScript/formFormationLD.js"></script>
</head>
<body>
	
	<div style="margin-left:275px;position:absolute;margin-top:41px;">
		<table>
			<tr>
				<td style="border-top:474px solid silver;"></td>
			</tr>		
		</table>
	</div>
	
	<div class="entete">
		<p style="text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:375px;padding-right:375px;">EMPLOI ET FORMATION</p>
	</div>

	<!-- <div style="position:absolute; top:138px; left:230px;">
		<img src="Images/essai11.jpg" alt="essai11">
	</div> -->
	
	<div class="position2">
		<div id="deco1" style="width:320px;height:225px;">
				<div style="position:absolute"><a class="buttConf"><p style="color:white;background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:25px;padding-right:48px;">Formation longue durée</p></a></div><br/><br/>
				<div style="position:absolute"><a class="buttConf" href="FORMCOURTE"><p style="color:white;background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:25px;padding-right:51px;">Formation courte durée</p></a></div>
		</div>
	</div>

	<div style="position:absolute; top:6px; left:100px;">
		<img src="Images/logoEniem2.png" alt="logoEniem2">
	</div>

	<div class="position">
  		<div id="en-tete">
			<ul class="ong1">
  				<li class="ong"><a href="EMPLOI"><span><b>Emploi</b></span></a></li>
  				<li class="ong" id="actif"><span><b>Formation</b></span></li>
    			<li class="ong"><a href="deconnexionempform.do"><span><b>Déconnexion</b></span></a></li>
 			</ul>
  		</div>
	</div>	
	
	<div style="position:absolute;top:145px;left:430px;">
		<p style="color:grey;background-color:#DAE6E7;border:#C5DCE4 solid 3px;padding:2px 2px 2px 2px;font-family:Arial;font-size:24px;"><b>Formation longue durée</b></p>
	</div>
	
	<div class="cadre" style="margin-left:400px; margin-top:80px;width:450px;height:300px;">
	<form name="FormFLD" action="FormLongue.do" method="post" onSubmit="return verifformlongue();">
		<table>
		<% 
				String matricule = request.getParameter("matricule");
				out.println(" <input type=\"hidden\" name=\"matricule\" value=\""+matricule+"\" />");%>
			<tr>
				<td class="td">Intitulé de la formation :</td>
				<td class="td2"><input class="moz" type="text" name="int_fld" size="20"/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>	
			<tr>
				<td class="td">Date de début :</td>
				<td class="td2"><select class="choix" name="jour_deb_fld">
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
				
				<select class="choix" name="mois_deb_fld">
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
				
				<select class="choix" name="annee_deb_fld">
						<option selected></option>
						<%for(int i=1930; i<=2060; i++){ %>
							<option value="<%=i %>"><%=i %></option>
						<%} %>			
					</select>  
				</td>
			</tr>	
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Date de fin :</td>
				<td class="td2"><select class="choix" name="jour_fin_fld">
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
				
				<select class="choix" name="mois_fin_fld">
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
				
				<select class="choix" name="annee_fin_fld">
						<option selected></option>
						<%for(int i=1930; i<=2060; i++){ %>
							<option value="<%=i %>"><%=i %></option>
						<%} %>			
					</select>  
				</td>
			</tr>	
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Diplôme obtenu :</td>	
				<td class="td2"><input class="moz" type="text" name="dip_obt" size="30"/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Date d'obtention :</td>	
				<td class="td2"><select class="choix" name="jour_obt">
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
				
				<select class="choix" name="mois_obt">
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
				
				<select class="choix" name="annee_obt">
						<option selected></option>
						<%for(int i=1930; i<=2060; i++){ %>
							<option value="<%=i %>"><%=i %></option>
						<%} %>			
					</select>  
				</td>
			</tr>	
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Ecole :</td>	
				<td class="td2"><input class="moz" type="text" name="ecole_fld" size="30"/></td>
			</tr>	
			<tr></tr><tr></tr><tr></tr>
	</table>
		
	<br/>
	<div style="margin-left:35%;">
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

</body>
</html>