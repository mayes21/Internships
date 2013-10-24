package org.apache.jsp.WEB_002dINF.src.vues;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Accueil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\" type=\"text/css\" title=\"designAccueil\" href=\"CSS/Accueil.css\"/>\r\n");
      out.write("<title>:: Accueil ::</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"entete\">\r\n");
      out.write("\t\t<p class=\"textEntete\">APPLICATION GESTION DU PERSONNEL</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"position:absolute; top:6px; left:100px;\">\r\n");
      out.write("\t\t<img src=\"Images/logoEniem2.png\" alt=\"logoEniem2\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"position:absolute; top:570px; left:36px;\">\r\n");
      out.write("\t\t<img src=\"Images/essai03F.jpg\" alt=\"essai03F\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<span style=\"position:absolute; top:98px; left:230px;\">\r\n");
      out.write("\t\t<img src=\"Images/essai11.jpg\" alt=\"essai11\">\r\n");
      out.write("\t</span>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"position:absolute; top:123px; left:470px;\">\r\n");
      out.write("\t\t<p style=\"color:grey;background-color:#DAE6E7;border:#C5DCE4 solid 3px;padding:2px 2px 2px 2px;font-family:Arial;font-size:24px;\"><b>Menu utilisateur</b></p>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"cadre\">\r\n");
      out.write("\t\t\t\t<div style=\"position:absolute\"><a class=\"button1\" href=\"CONNADMIN\"><p style=\"font-family:Arial;font-size:20px;padding-top:12px;padding-left:90px;\">Administrateur </p></a></div><br/><br/><br/><br/>\r\n");
      out.write("\t\t\t\t<div style=\"position:absolute\"><a class=\"button1\" href=\"CONNPERSPAIE\"><p style=\"font-family:Arial;font-size:20px;padding-top:12px;padding-left:90px;\">Personnel et Paie </p></a></div><br/><br/><br/><br/>\r\n");
      out.write("\t\t\t\t<div style=\"position:absolute\"><a class=\"button1\" href=\"CONNEMPFORM\"><p style=\"font-family:Arial;font-size:20px;padding-top:12px;padding-left:90px;\">Emploi et Formation </p></a></div><br/><br/><br/><br/>\r\n");
      out.write("\t\t\t\t<div style=\"position:absolute\"><a class=\"button1\" href=\"CONNSOC\"><p style=\"font-family:Arial;font-size:20px;padding-top:12px;padding-left:90px;\">Social </p></a></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
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
