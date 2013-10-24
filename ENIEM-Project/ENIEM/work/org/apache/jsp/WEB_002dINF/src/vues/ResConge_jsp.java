package org.apache.jsp.WEB_002dINF.src.vues;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ResConge_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Congé ajouté avec succès</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"entete\">\r\n");
      out.write("\t\t<p style=\"text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:395px;padding-right:395px;\">PERSONNEL ET PAIE</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"margin-left:230px;position:absolute;margin-top:-97px;\">\r\n");
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
      out.write("\t<div class=\"cadrSucc\" style=\"margin-left:400px;margin-top:190px;width:480px;heigh350px;\">\r\n");
      out.write("\t\t<div style=\"text-align:left; color:#36A753; font-weight:bold; font-size:18px;font-family:Arial;fond-size:14px;\">\r\n");
      out.write("\t\t\tCe congé a été ajouté avec succès<span style=\"color:#C6E4BE;\">_____</span> <img src=\"Images/succes.png\" alt=\"succ\">\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"text-align:left; color:black; font-weight:bold; font-size:16px;font-family:Arial;margin-top:20px;fond-size:14px;\">\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Désignation du congé :</span>");
      out.print( request.getParameter("des_cng").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Année du congé :</span>");
      out.print( request.getParameter("annee_cng").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Date de début :</span>");
      out.print( request.getParameter("jour_deb_cng").toString());
      out.write('-');
      out.print( request.getParameter("mois_deb_cng").toString());
      out.write('-');
      out.print( request.getParameter("annee_deb_cng").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t<span style=\"color:blue;\">Date de fin :</span>");
      out.print( request.getParameter("jour_fin_cng").toString());
      out.write('-');
      out.print( request.getParameter("mois_fin_cng").toString());
      out.write('-');
      out.print( request.getParameter("annee_fin_cng").toString());
      out.write("<br/><br/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"position:absolute; top:560px; left:1080px;\">\r\n");
      out.write("\t\t\t<a href=\"CONGE\" title=\"Retour au formulaire d'ajout de sanction\"><img src=\"Images/bouton-retour-accueil.png\" alt=\"bouton-retour-accueil\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
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
