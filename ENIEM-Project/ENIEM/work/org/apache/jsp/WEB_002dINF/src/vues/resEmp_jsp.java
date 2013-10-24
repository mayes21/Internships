package org.apache.jsp.WEB_002dINF.src.vues;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resEmp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\" type=\"text/css\" title=\"designAccueil\" href=\"CSS/CSSEmpFor.css\"/>\r\n");
      out.write("<title>Employé ajouté avec succès</title>\r\n");
      out.write("<script language='javascript'>\r\n");
      out.write("   history.forward();\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"entete\">\r\n");
      out.write("\t\t<p style=\"text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:375px;padding-right:375px;\">EMPLOI ET FORMATION</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"margin-left:230px;position:absolute;margin-top:-7px;\">\r\n");
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
      out.write("\t<div class=\"cadrSucc\" style=\"margin-left:370px;margin-top:100px;width:500px;height:480px;\">\r\n");
      out.write("\t\t<div style=\"text-align:left; color:#36A753; font-weight:bold; font-size:18px;font-family:Arial;fond-size:14px;\">\r\n");
      out.write("\t\t\tCet employé a été ajouté avec succès<span style=\"color:#C6E4BE;\">_____</span> <img src=\"Images/succes.png\" alt=\"succ\">\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div style=\"text-align:left; color:black; font-weight:bold; font-size:16px;font-family:Arial;margin-top:20px;fond-size:14px;\">\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Matricule :</span>");
      out.print( request.getParameter("chiffre_mat").toString()+request.getParameter("lettre_mat").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Nom :</span> ");
      out.print( request.getParameter("nom_emp").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Prénom :</span> ");
      out.print( request.getParameter("prenom_emp").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Date de Naissance :</span> ");
      out.print( request.getParameter("jour_emp").toString());
      out.write('-');
      out.print( request.getParameter("mois_emp").toString());
      out.write('-');
      out.print( request.getParameter("annee_emp").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Lieu de naissance :</span> ");
      out.print( request.getParameter("lieu_nais_emp").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Adresse :</span> ");
      out.print( request.getParameter("adr_emp").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Sexe :</span> ");
      out.print( request.getParameter("sexe_emp").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Numéro SS :</span> ");
      out.print( request.getParameter("nss_emp").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Numéro de tel :</span> ");
      out.print( request.getParameter("tel_emp").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Date de recrutement :</span>  ");
      out.print( request.getParameter("jour_recrut_emp").toString());
      out.write('-');
      out.print( request.getParameter("mois_recrut_emp").toString());
      out.write('-');
      out.print( request.getParameter("annee_recrut_emp").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Situation familiale :</span> ");
      out.print( request.getParameter("SF").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Situation professionnelle :</span> ");
      out.print( request.getParameter("SP").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"position:absolute; top:560px; left:1050px;\">\r\n");
      out.write("\t\t\t\t<a href=\"EMPLOI\" title=\"Retour au formulaire d'ajout d'un employé\"><img src=\"Images/bouton-retour-accueil.png\" alt=\"bouton-retour-accueil\"></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
