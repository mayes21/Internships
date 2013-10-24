package org.apache.jsp.WEB_002dINF.src.vues;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ConfigPassGPP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" media=\"screen\" type=\"text/css\" title=\"designMenu\" href=\"CSS/menuOng.css\"/>\r\n");
      out.write("<title>Set Password GPP</title>\r\n");
      out.write("<script language=\"Javascript\" src=\"JavaScript/formPasswordGPP.js\"> </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"entete\">\r\n");
      out.write("\t\t<p style=\"text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:420px;padding-right:410px;\">ADMINISTRATEUR</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"position:absolute; top:6px; left:100px;\">\r\n");
      out.write("\t\t<img src=\"Images/logoEniem2.png\" alt=\"logoEniem2\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"margin-left:273px;position:absolute;margin-top:41px;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"border-top:474px solid silver;\"></td>\r\n");
      out.write("\t\t\t</tr>\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"position\">\r\n");
      out.write("  \t\t<div id=\"en-tete\">\r\n");
      out.write("\t\t\t<ul class=\"ong1\">\r\n");
      out.write("  \t\t\t\t<li class=\"ong\"><a href=\"CONSULTATION\"><span><b>Consultation</b></span></a></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ong\" id=\"actif\"><span><b>Configuration</b></span></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ong\"><a href=\"deconnexionadm.do\"><span><b>Déconnexion</b></span></a></li>\r\n");
      out.write(" \t\t\t</ul>\r\n");
      out.write(" \t\t </div>\r\n");
      out.write("\t</div>\t\t\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"position4\">\r\n");
      out.write("\t\t<div id=\"deco1\" style=\"width:320px;height:225px;\">\r\n");
      out.write("\t\t\t\t<div style=\"position:absolute\"><a class=\"buttConf\"  href=\"CONFIGLOGGPP\"><p style=\"color:white;background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:25px;padding-right:81px;\">Modifier Login GPP</p></a></div><br/><br/>\r\n");
      out.write("  \t\t\t\t<div style=\"position:absolute\"><a class=\"buttConf\"><p style=\"color:white;background-image:url(Images/buttConf.png);font-family:Arial;font-size:17px;padding-top:9px;padding-bottom:7px;padding-left:25px;padding-right:47px;\">Modifier Password GPP</p></a></div> \t\t\t\r\n");
      out.write(" \t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"position:absolute;top:187px;left:430px;\">\r\n");
      out.write("\t\t<p style=\"color:grey;background-color:#DAE6E7;border:#C5DCE4 solid 3px;padding:2px 2px 2px 2px;font-family:Arial;font-size:24px;\"><b>Modifier Password GPP</b></p>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"cadre\" style=\"margin-left:400px; margin-top:120px;width:480px;height:130px;\">\r\n");
      out.write("\t<form name=\"FormSetPass\" action=\"passgpp.do\" method=\"post\" onSubmit=\"return validation(this)\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">Saisir le mot de passe actuel :</td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"oldPassGPP\" size=\"20\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr></tr><tr></tr><tr></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">Saisir le nouveau mot de passe :</td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><input class=\"moz\" type=\"password\" name=\"newPassGPP\" size=\"20\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr></tr><tr></tr><tr></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">Confirmer le nouveau mot de passe :</td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><input class=\"moz\" type=\"password\" name=\"newPass1GPP\" size=\"20\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<div style=\"margin-left:60%;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><input type=\"submit\" name=\"modifier\" value=\"MODIFIER\"/></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"position:absolute; top:500px; left:1050px;\">\r\n");
      out.write("\t\t<a href=\"CONFIGURATION\" title=\"Retour au menu configuration\"><img src=\"Images/bouton-retour-accueil.png\" alt=\"bouton-retour-accueil\"></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");
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
