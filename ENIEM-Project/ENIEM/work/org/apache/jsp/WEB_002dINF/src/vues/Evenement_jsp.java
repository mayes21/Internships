package org.apache.jsp.WEB_002dINF.src.vues;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Evenement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" media=\"screen\" type=\"text/css\" title=\"designMenu\" href=\"CSS/confCSS.css\"/>\r\n");
      out.write("<title>Evenement</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
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
      out.write("  \t\t\t\t\r\n");
      out.write("  \t\t\t\t<li class=\"ong\"  id=\"actif\"><span><b>Evenement</b></span></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ong\"><a href=\"CONTRAT\"><span><b>Contrat</b></span></a></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ong\"><a href=\"deconnexionperspaie.do\"><span><b>Déconnexion</b></span></a></li>\r\n");
      out.write(" \t\t\t</ul>\r\n");
      out.write(" \t\t </div>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"position:absolute;top:187px;left:455px;\">\r\n");
      out.write("\t\t<p style=\"color:grey;background-color:#DAE6E7;border:#C5DCE4 solid 3px;padding:2px 2px 2px 2px;font-family:Arial;font-size:24px;\"><b>Menu événement</b></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"position3\">\r\n");
      out.write("\t\t<div id=\"deco\" style=\"width:305px;height:235px;\">\r\n");
      out.write("\t\t\t\t<div style=\"position:absolute\"><a class=\"buttConf\" href=\"LISTER\"><p style=\"background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:75px;\">Recrutements</p></a></div><br/><br/>\r\n");
      out.write("\t\t\t\t<div style=\"position:absolute\"><a class=\"buttConf\" href=\"LISTEP\"><p style=\"background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:75px;\">Promotions</p></a></div><br/><br/>\r\n");
      out.write("\t\t\t\t<div style=\"position:absolute\"><a class=\"buttConf\" href=\"LISTES\"><p style=\"background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:75px;\">Sanctions</p></a></div><br/><br/>\r\n");
      out.write("\t\t\t\t<div style=\"position:absolute\"><a class=\"buttConf\" href=\"LISTEM\"><p style=\"background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:75px;\">Mutations</p></a></div><br/><br/>\r\n");
      out.write("\t\t\t\t<div style=\"position:absolute\"><a class=\"buttConf\" href=\"LISTEC\"><p style=\"background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:75px;\">Congés</p></a></div>\r\n");
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