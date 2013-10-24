<%@ page language="java" contentType="text/html; charset=windows-1252"
    pageEncoding="windows-1252"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title></title>
</head>
<body>
<%
	Class.forName("org.postgresql.Driver");
	java.sql.Connection cnx = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/ENIEM", "postgres", "asmayes");
	java.sql.Statement req = cnx.createStatement();
    
	String matricule = request.getParameter("matricule");
    

	String query = "DELETE FROM employe WHERE matricule='"+matricule+"'";
	try
	{
		req.executeUpdate(query);
	}
	catch(Exception e)
	{
		System.out.println("Erreur dans la suppression d'un employé.");
	}

	
	

%>
</body>
</html>
</body>
</html>