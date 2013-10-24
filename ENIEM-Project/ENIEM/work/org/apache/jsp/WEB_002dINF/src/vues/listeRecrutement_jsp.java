package org.apache.jsp.WEB_002dINF.src.vues;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listeRecrutement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\" type=\"text/css\" title=\"designMenu\" href=\"CSS/menuOng.css\"/>\r\n");
      out.write("<title>Liste Recrutement</title>\r\n");
      out.write("<script language=\"Javascript\" src=\"JavaScript/formAcc.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"margin-left:230px;position:absolute;margin-top:41px;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"border-top:474px solid silver;\"></td>\r\n");
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
      out.write("  \t\t\t\t<li class=\"ong\"><a href=\"EMPLOI2\"><span><b>Emploi</b></span></a></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ong\"><a href=\"CONTRAT\"><span><b>Contrat</b></span></a></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ong\" id=\"actif\"><span><b>Evenement</b></span></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ong\"><a href=\"deconnexionperspaie.do\"><span><b>Déconnexion</b></span></a></li>\r\n");
      out.write(" \t\t\t</ul>\r\n");
      out.write(" \t\t </div>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\r\n");
      out.write("<div style=\"top:120px;\">\r\n");
      out.write("\t");

	 Class.forName("org.postgresql.Driver");
    java.sql.Connection cnx = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/ENIEM", "postgres", "asmayes");
    java.sql.Statement req = cnx.createStatement();
    
    String sql = "select matricule, nomemp, prenomemp from employe";
    out.println("<center><form name=\"formulaireModif\" action=\"Poste.jsp\" method=\"post\" onSubmit=\"return verifAcc()\">");
    out.println("<center><table width=\"50%\"  border=0% >");
    out.println("<br>");
    out.println("<tr><center><font size=6><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">   " +
            "Ajouter un recrutement</font></center></tr>");
    out.println("<thead><br>");
    out.println("<tr>");
    out.println("<th width=\"30%\" align=\"center\" bgcolor=\"#CCCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"> Nom");
    out.println("</th>");
    out.println("<th width=\"28%\" align=\"center\" bgcolor=\"#CCCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"> Prénom");
    out.println("</th>");
    out.println("<th width=\"22%\" align=\"center\" bgcolor=\"#CCCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"> matricule");
    out.println("</th>");
    out.println("</tr>");
    out.println("</thead>");
    out.println("<tbody>");
    java.sql.ResultSet rs = req.executeQuery(sql);
    while (rs.next())
        {
            String id = rs.getString(1);
            String NOM = rs.getString(2);
            String PRE = rs.getString(3);
            out.println("<tr>");
            out.println("<td align=\"center\" bgcolor=\"#C9DCEF\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">"+NOM+"</td>");
            out.println("<td align=\"center\" bgcolor=\"#C9DCEF\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">"+PRE+"</td>");
            out.println("<td align=\"center\" bgcolor=\"#C9DCEF\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">"+id+"</td>");
            out.println("<td width=\"5%\" align=\"center\" bgcolor=\"#A6C6D9\"><input type=\"radio\" name=\"matricule\" value=\""+id+"\"></td>");
            
        }
    rs.close();
                    req.close();
                    cnx.close();
                    //out.println("</body>");
                    //out.println("</html>");
                    out.println("</tbody>");
                    out.println("</table>");
                    out.println("<br>");
                    out.println("<input type=\"submit\" name=\"modif\" value=\"Suivant\"/>");
                    out.println("</center");
                    out.println("</form>");

                out.println("</td>");
                out.println("</tr>");
                out.println("</table>");

      out.write(" \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"position:absolute; top:600px; left:1050px;\">\r\n");
      out.write("\t\t<a href=\"EVENEMENT\" title=\"Retour au menu evenement\"><img src=\"Images/bouton-retour-accueil.png\" alt=\"bouton-retour-accueil\"></a>\r\n");
      out.write("\t</div>\r\n");
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
