package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class emploiModif_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=windows-1252");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\" type=\"text/css\" title=\"designMenu\" href=\"CSS/menuOng.css\"/>\r\n");
      out.write("<title>Emploi</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"margin-left:230px;position:absolute;margin-top:41px;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"border-top:750px solid silver;\"></td>\r\n");
      out.write("\t\t\t</tr>\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"entete\">\r\n");
      out.write("\t\t<p style=\"text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:395px;padding-right:395px;\">PERSONNEL ET PAIE</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"position:absolute; top:6px; left:100px;\">\r\n");
      out.write("\t\t<img src=\"Images/logoEniem2.png\" alt=\"logoEniem2\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"position\">\r\n");
      out.write("  \t\t<div id=\"en-tete\">\r\n");
      out.write("\t\t\t<ul class=\"ong1\">\r\n");
      out.write("  \t\t\t\t<li class=\"ong\" id=\"actif\"><span><b>Emploi</b></span></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ong\"><a href=\"CONTRAT\"><span><b>Contrat</b></span></a></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ong\"><a href=\"EVENEMENT\"><span><b>Evenement</b></span></a></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ong\"><a href=\"deconnexionperspaie.do\"><span><b>Déconnexion</b></span></a></li>\r\n");
      out.write(" \t\t\t</ul>\r\n");
      out.write(" \t\t </div>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\r\n");

		String matricule = request.getParameter("idModif");
		Class.forName("org.postgresql.Driver");
		java.sql.Connection cnx = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/ENIEM", "postgres", "asmayes");
		java.sql.Statement req = cnx.createStatement(/*ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE*/);
	
		String sql = "select * from employe where matricule = '"+matricule+"'";
		java.sql.ResultSet rs = req.executeQuery(sql);
	
		while (rs.next())
		{
		 
		 String nom = rs.getString(2);
		 String PRE = rs.getString(3);
		 String datenais = rs.getString(4);
		 String lieunais = rs.getString(5);
		 String adr = rs.getString(6);
		 String sex = rs.getString(7);
		 String nss = rs.getString(8);
		 String tel = rs.getString(9);
		 String daterec = rs.getString(10);
 		 String situfam = rs.getString(11);
 		 String situprof = rs.getString(12);

		
		
		out.println("<div class=\"cadre\" style=\"margin-left:400px; margin-top:80px;width:570px;height:585px;\">");
		out.println("<b>Modification de l'employé: <u>"+matricule+"     "+nom+"       "+PRE);
		out.println("<br/><br/><br/><br/>");
		out.println("<form name=\"FormulaireEmployé\" action=\"ResModif.jsp\" method=\"post\" onSubmit=\"return verifform()\">");
		out.println("<table><tr>");
		out.println(" <input type=\"hidden\" name=\"matricule\" value=\""+matricule+"\" />");
		out.println("<td class=\"td\">Nom : </td><td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"nom_emp\" size=\"30\" value=\""+nom+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Prénom : </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"prenom_emp\" size=\"30\" value=\""+PRE+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Date de naissance: </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"datnais\" size=\"30\" value=\""+datenais+"\"/></td>");
		
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Lieu de naissance : </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"lieu_nais_emp\" size=\"30\" value=\""+lieunais+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Adresse : </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"adr_emp\" size=\"55\" value=\""+adr+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Sexe: </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"sexe\" size=\"30\" value=\""+sex+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Numéro SS : </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"nss_emp\" size=\"30\" value=\""+nss+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Numéro de tel : </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"tel_emp\" size=\"30\" value=\""+tel+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Date de recrutement: </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"datrec\" size=\"30\" value=\""+daterec+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Situation familiale : </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"SF\" size=\"30\" value=\""+situfam+"\"/></td>");
		out.println("</tr>");
		out.println("<tr></tr><tr></tr><tr></tr><tr></tr>");
		out.println("<tr>");
		out.println("<td class=\"td\">Situation professionnelle : </td>");
		out.println("<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"SP\" size=\"30\" value=\""+situprof+"\"/></td>");
		out.println("</tr>");
		}
		out.println("<tr></tr><tr></tr><tr></tr>");
		out.println("</table>");
		out.println("<br/>");
		out.println("<div style=\"margin-left:30%;\">");
		out.println("<table>");
		out.println("<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>");
		out.println("<td><input type=\"submit\" name=\"ajouter\" value=\"Modifier\"/></td>");
		out.println("<td></td>");
		out.println("<td></td>");
		out.println("<td></td>");
		out.println("<td></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</div>	");
		out.println("</form>");
		out.println("</div>");		
			

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
