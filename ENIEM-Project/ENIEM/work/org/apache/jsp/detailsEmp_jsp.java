package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class detailsEmp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\" type=\"text/css\" title=\"designMenu\" href=\"CSS/menuOng.css\"/>\r\n");
      out.write("<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"entete\">\r\n");
      out.write("\t\t<p style=\"text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:420px;padding-right:410px;\">ADMINISTRATEUR</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"position:absolute; top:6px; left:100px;\">\r\n");
      out.write("\t\t<img src=\"Images/logoEniem2.png\" alt=\"logoEniem2\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"margin-left:230px;position:absolute;margin-top:-116px;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"border-top:515px solid silver;\"></td>\r\n");
      out.write("\t\t\t</tr>\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<div style=\"margin-left:480px;margin-top:210px;\">\r\n");
      out.write("\r\n");

	Class.forName("org.postgresql.Driver");
	java.sql.Connection cnx = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/ENIEM", "postgres", "asmayes");
	java.sql.Statement req = cnx.createStatement();
    ResultSet rs;
	String matricule = request.getParameter("matricule");
    

	String query = "SELECT * FROM employe where matricule = '"+matricule+"'";
	
		 rs = req.executeQuery(query);

	while (rs.next())
	{
    	String id = rs.getString(1);
    	String NOM = rs.getString(2);
    
    	String PRE = rs.getString(3);
  	    String datn = rs.getString(4);
  	    String lieun = rs.getString(5);
  	    String adr = rs.getString(6);
   	    String sex = rs.getString(7);
   	    String nss = rs.getString(8);
 	    String tel = rs.getString(9);
 
 	    String datr = rs.getString(10);
	    String sf = rs.getString(11);
	    String sp = rs.getString(12);
    	out.println("<tr>");
      
    	out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>MATRICULE : </font></b>"+id+"</td><br>");
   	    out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>NOM : </font></b>"+NOM+"</td><br>");
    	out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>PRENOM : </font></b>"+PRE+"</td><br>");

        out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>DATE DE NAISSANCE : </font></b>"+datn+"</td><br>");
        out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>LIEU DE NAISSANCE : </font></b>"+lieun+"</td><br>");
        out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>ADRESSE : </font></b>"+adr+"</td><br>");
        out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>SEXE DE L'EMPLOYE </font></b>"+sex+"</td><br>");
        out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>NUMERO DE SECURITE SOCIALE : </font></b>"+nss+"</td><br>");
    	out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>TELEPHONE : </font></b>"+tel+"</td><br>");
    	out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>DATE DE RECRUTEMENT : </font></b>"+datr+"</td><br>");
        out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>SITUATION FAMILIALE : </font></b>"+sf+"</td><br>");
        out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\"><b><font color=blue>SITUATION PROFESSIONNELLE : </font></b>"+sp+"</td><br>");
      
        

}
	rs.close();
	
	/*String query1 = "SELECT * FROM mutation where matricule = '"+matricule+"'";
	ResultSet rs1 = req.executeQuery(query1);
	while (rs1.next())
	{
    	String nvp = rs1.getString(1);
    	String nvd = rs1.getString(2);
    
    	String rai = rs1.getString(3);
    	String dat = rs1.getString(4);
    	out.println("<tr>");
        
   	    out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">"+nvp+"</td>");
    	out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">"+nvd+"</td>");
    	out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">"+rai+"</td>");
    	out.println("<td align=\"center\" bgcolor=\"#FFCCCC\"><font style=\"font-family:'Trebuchet MS', Arial, Helvetica, sans-serif\">"+dat+"</td>");
    	
	}
	
	rs1.close();
*/

      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"position:absolute; top:560px; left:1080px;\">\r\n");
      out.write("\t\t<a href=\"CONSULTATION\" title=\"Retour\"><img src=\"Images/bouton-retour-accueil.png\" alt=\"bouton-retour-accueil\"></a>\r\n");
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
