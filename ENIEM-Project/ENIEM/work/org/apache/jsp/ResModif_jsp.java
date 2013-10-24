package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;

public final class ResModif_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\" type=\"text/css\" title=\"designMenu\" href=\"CSS/menuOng.css\"/>\r\n");
      out.write("<title>Modifie(e) avec succes</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"entete\">\r\n");
      out.write("\t\t<p style=\"text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:395px;padding-right:395px;\">PERSONNEL ET PAIE</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"margin-left:230px;position:absolute;margin-top:-207px;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"border-top:516px solid silver;\"></td>\r\n");
      out.write("\t\t\t</tr>\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"position:absolute; top:6px; left:100px;\">\r\n");
      out.write("\t\t<img src=\"Images/logoEniem2.png\" alt=\"logoEniem2\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"cadrSucc\" style=\"margin-left:450px;margin-top:300px;width:400px;height:70px;\">\r\n");
      out.write("\t\t<div style=\"text-align:left; color:#36A753; font-weight:bold; font-size:18px;font-family:Arial;fond-size:14px;\">\r\n");
      out.write("\t\t\tEmployé modifié avec succès<span style=\"color:#C6E4BE;\">_____</span> <img src=\"Images/succes.png\" alt=\"succ\">\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"position:absolute; top:560px; left:1050px;\">\r\n");
      out.write("\t\t\t<a href=\"EMPLOI2\" title=\"Retour à la liste de modification\"><img src=\"Images/bouton-retour-accueil.png\" alt=\"bouton-retour-accueil\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");

	Class.forName("org.postgresql.Driver");
	java.sql.Connection cnx = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/ENIEM", "postgres", "asmayes");
	java.sql.Statement req = cnx.createStatement();
    
	String matricule = request.getParameter("matricule");
	String nom = request.getParameter("nom_emp");
	String prénom = request.getParameter("prenom_emp");
	String date_naiss = request.getParameter("datnais");
	String lieunaiss = request.getParameter("lieu_nais_emp");
	String adr = request.getParameter("adr_emp");
	String sexe = request.getParameter("sexe");
	String nss = request.getParameter("nss_emp");
	String numtel = request.getParameter("tel_emp");
	String date_recrut = request.getParameter("datrec");
	String situfam = request.getParameter("SF");
	String situprof = request.getParameter("SP");
    

	String query = "UPDATE employe SET (nomemp,prenomemp, datenais, lieunais, adremp, sexemp, nssemp, telemp,daterec, situfam, situprofemp) " +
	"= ('"+nom+"','"+prénom+"','"+date_naiss+"','"+lieunaiss+"','"+adr+"','"+sexe+"','"+nss+"','"+numtel+"','"+date_recrut+"','"+situfam+"','"+situprof+"') WHERE matricule = '"+matricule+"'";
	try
	{
		req.executeUpdate(query);
	}
	catch(Exception e)
	{
		System.out.println("Erreur dans la modification de l'employé.");
	}

	
	


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
