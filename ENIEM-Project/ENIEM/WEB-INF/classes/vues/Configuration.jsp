<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/menuOng.css"/> 
<link rel="stylesheet" media="screen" type="text/css" title="designMenu" href="CSS/confCSS.css"/>
<title>Configuration</title>
<script language='javascript'>
   history.forward();
</script>
</head>
<body>
	<div class="entete">
		<p style="text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:420px;padding-right:410px;">ADMINISTRATEUR</p>
	</div>
	
	<div style="position:absolute; top:6px; left:100px;">
		<img src="Images/logoEniem2.png" alt="logoEniem2">
	</div>
	
	<div style="margin-left:230px;position:absolute;margin-top:41px;">
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
	
	<div style="position:absolute;top:187px;left:455px;">
		<p style="color:grey;background-color:#DAE6E7;border:#C5DCE4 solid 3px;padding:2px 2px 2px 2px;font-family:Arial;font-size:24px;"><b>Menu configuration</b></p>
	</div>
	
	<div class="position3">
		<div id="deco" style="width:285px;height:205px;">
				<div style="position:absolute"><a class="buttConf" href="CONFIGLOGADMIN"><p style="background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:50px;">Administrateur </p></a></div><br/><br/>
				<div style="position:absolute"><a class="buttConf" href="CONFIGLOGGPP"><p style="background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:50px;">Personnel et Paie </p></a></div><br/><br/>
				<div style="position:absolute"><a class="buttConf" href="CONFIGLOGGEF"><p style="background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:50px;">Emploi et Formation </p></a></div><br/><br/>
				<div style="position:absolute"><a class="buttConf" href="CONFIGLOGGS"><p style="background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:50px;">Social </p></a></div>
		</div>
	</div>
	
</body>
</html>