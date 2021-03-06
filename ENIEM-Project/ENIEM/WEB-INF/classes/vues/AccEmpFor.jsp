<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
     <%@ page import="java.util.HashMap" %>
<%
    	//On r�cup�re la liste des cookies
    	Cookie[] cookies = request.getCookies();
    	HashMap map = new HashMap();
    	//S'il y a au moins un cookie, on stocke les cl�s-valeurs dans une Map
    	if(cookies != null){	    	
	    	for(Cookie cookie : cookies){
	    		map.put(cookie.getName(), cookie.getValue());
	    	}
    	}
    	
    	//Ainsi, si des donn�es existent, on pourra pr�remplir les champs de notre formulaire
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" media="screen" type="text/css" title="designAccueil" href="CSS/CSSEmpFor.css"/>
<title>Emploi et Formation</title>
</head>
<body>

	<div class="entete">
		<p>EMPLOI ET FORMATION</p>
	</div>
	
	<div style="position:absolute; top:98px; left:230px;">
		<img src="Images/essai11.jpg" alt="essai11">
	</div>
	
	<div style="position:absolute; top:6px; left:100px;">
		<img src="Images/logoEniem2.png" alt="logoEniem2">
	</div>
	
	<div style="position:absolute; top:150px; left:490px;">
		<p style="color:grey;background-color:#DAE6E7;border:#C5DCE4 solid 3px;padding:2px 2px 2px 2px;font-family:Arial;font-size:24px;"><b>Se connecter</b></p>
	</div>
	
	<div style="position:absolute; top:570px; left:36px;">
		<img src="Images/essai03.jpg" alt="essai03">
	</div>
	
	<div class="cadreLog">
		<form name="FormConnectAdmin" action="connexionempform.do" method="post">
			<table>
				<tr>
					<td><b>Login :</b></td>
					<td class="td"><input class="moz" type="text" name="login" size="40" value = "<%=((map.get("login2") != null) ? map.get("login2") : "") %>"></td>
				</tr>
				<tr></tr><tr></tr><tr></tr>
				<tr>
					<td><b>Password :</b></td>
					<td class="td"><input class="moz" type="password" name="password" size="40" value= "<%=((map.get("login2") != null) ? map.get("password2") : "") %>"></td>
				</tr>
				<tr></tr><tr></tr><tr></tr>
				<tr>
					<td><b>Connexion automatique :</b></td>
					<td style="text-align:left;padding-left:20px;"><input type="checkbox" name="auto_connect" value = "Y" <%=(((map.get("login2") != null) && (map.get("login2") != null)) ? "checked" : "") %>/></td>
				</tr>
				<tr></tr><tr></tr><tr></tr>
				<tr>
					<td></td>
					<td><input type="submit" name="connect" value="Connexion"/></td>	
				</tr>		
			</table>
		</form>
	</div>
	
	<div style="position:absolute; top:500px; left:1050px;">
		<a href="ACCUEIL" title="Retour au menu utilisateur"><img src="Images/bouton-retour-accueil.png" alt="bouton-retour-accueil"></a>
	</div>

</body>
</html>