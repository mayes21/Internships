<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/menuOng.css"/>
<title>Set Password Admin</title>
<script language="Javascript" src="JavaScript/formPasswordAdmin.js"> </script>
</head>
<body>

	<div class="entete">
		<p style="text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:420px;padding-right:410px;">ADMINISTRATEUR</p>
	</div>
	
	<div style="position:absolute; top:6px; left:100px;">
		<img src="Images/logoEniem2.png" alt="logoEniem2">
	</div>
	
	<div style="margin-left:273px;position:absolute;margin-top:41px;">
		<table>
			<tr>
				<td style="border-top:474px solid silver;"></td>
			</tr>		
		</table>
	</div>
	
	<div class="position">
  		<div id="en-tete">
			<ul class="ong1">
  				<li class="ong"><a href="CONSULTATION"><span><b>Consultation</b></span></a></li>
  				<li class="ong" id="actif"><span><b>Configuration</b></span></li>
  				<li class="ong"><a href="deconnexionadm.do"><span><b>Déconnexion</b></span></a></li>
 			</ul>
 		 </div>
	</div>				
	
	<div style="position:absolute;top:187px;left:430px;">
		<p style="color:grey;background-color:#DAE6E7;border:#C5DCE4 solid 3px;padding:2px 2px 2px 2px;font-family:Arial;font-size:24px;"><b>Modifier Password ADMIN</b></p>
	</div>
	
	<div class="position4">
		<div id="deco1" style="width:320px;height:225px;">
				<div style="position:absolute"><a class="buttConf"  href="CONFIGLOGADMIN"><p style="color:white;background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:25px;padding-right:68px;">Modifier Login Admin</p></a></div><br/><br/>
  				<div style="position:absolute"><a class="buttConf"><p style="color:white;background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:25px;padding-right:34px;">Modifier Password Admin</p></a></div> 			
 		</div>
	</div>
	
	<div class="cadre" style="margin-left:400px; margin-top:120px;width:480px;height:130px;">
	<form name="FormSetPass" action="passadm.do" method="post" onSubmit="return validation(this)">
		<table>
			<tr>
				<td class="td">Saisir le mot de passe actuel :</td>
				<td class="td2"><input class="moz" type="text" name="oldPassAdmin" size="20"/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Saisir le nouveau mot de passe :</td>
				<td class="td2"><input class="moz" type="password" name="newPassAdmin" size="20"/></td>
			</tr>
			<tr></tr><tr></tr><tr></tr>
			<tr>
				<td class="td">Confirmer le nouveau mot de passe :</td>
				<td class="td2"><input class="moz" type="password" name="newPass1Admin" size="20"/></td>
			</tr>
		</table>
		<br/>
		<div style="margin-left:60%;">
		<table>
		<tr>
			<td><input type="submit" name="modifier" value="MODIFIER"/></td>
		</tr>
		</table>
		</div>
			
	</form>
	</div>
	
	<div style="position:absolute; top:500px; left:1050px;">
		<a href="CONFIGURATION" title="Retour au menu configuration"><img src="Images/bouton-retour-accueil.png" alt="bouton-retour-accueil"></a>
	</div>
	
</body>
</html>