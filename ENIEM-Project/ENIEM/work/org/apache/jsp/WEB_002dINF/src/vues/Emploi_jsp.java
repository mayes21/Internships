package org.apache.jsp.WEB_002dINF.src.vues;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Emploi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Emploi</title>\r\n");
      out.write("<script language=\"Javascript\" charset=\"utf8\" src=\"JavaScript/formEmp.js\"> </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"margin-left:230px;position:absolute;margin-top:42px;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"border-top:776px solid silver;\"></td>\r\n");
      out.write("\t\t\t</tr>\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"entete\">\r\n");
      out.write("\t\t<p style=\"text-align:center;font-size:30px;font-family:Arial, Helvetica, sans-serif;color:#FFFFFF;padding-left:355px;padding-right:355px;\">EMPLOI ET FORMATION</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"position:absolute; top:145px; left:430px;\">\r\n");
      out.write("\t\t<p style=\"color:grey;background-color:#DAE6E7;border:#C5DCE4 solid 3px;padding:2px 2px 2px 2px;font-family:Arial;font-size:24px;\"><b>Ajouter un employ&eacute</b></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- <div style=\"position:absolute; top:138px; left:230px;\">\r\n");
      out.write("\t\t<img src=\"Images/essai11.jpg\" alt=\"essai11\">\r\n");
      out.write("\t</div>  -->\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"position:absolute; top:6px; left:100px;\">\r\n");
      out.write("\t\t<img src=\"Images/logoEniem2.png\" alt=\"logoEniem2\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"position\">\r\n");
      out.write("  \t\t<div id=\"en-tete\">\r\n");
      out.write("\t\t\t<ul class=\"ong1\">\r\n");
      out.write("  \t\t\t\t<li class=\"ong\" id=\"actif\"><span><b>Emploi</b></span></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ong\"><a href=\"FORMATION\"><span><b>Formation</b></span></a></li>\r\n");
      out.write("  \t\t\t\t<li class=\"ong\"><a href=\"deconnexionempform.do\"><span><b>Déconnexion</b></span></a></li>\r\n");
      out.write(" \t\t\t</ul>\r\n");
      out.write(" \t\t </div>\r\n");
      out.write("\t</div>\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"cadre\" style=\"margin-left:400px; margin-top:80px;width:590px;height:630px;\">\r\n");
      out.write("\t<form name=\"FormulaireEmploye\" action=\"FormEmp.do\" method=\"post\" onSubmit=\"return verifform();\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">*Matricule :</td>\t\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"chiffre_mat\" size=\"5\" maxlength=5 onKeypress=\"return matValide(event);\">\r\n");
      out.write("\t\t\t\t<select class=\"choix\" name=\"lettre_mat\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option selected></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"A\">A</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"B\">B</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"C\">C</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"D\">D</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"E\">E</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"F\">F</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"G\">G</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"H\">H</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"J\">J</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"K\">K</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"L\">L</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"M\">M</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"N\">N</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"P\">P</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Q\">Q</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"R\">R</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"S\">S</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"T\">T</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"U\">U</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"V\">V</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"W\">W</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"X\">X</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Y\">Y</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Z\">Z</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr></tr><tr></tr><tr></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">*Nom : </td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"nom_emp\" size=\"30\" maxlength=25 onKeypress=\"return nomValide(event);\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr></tr><tr></tr><tr></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">*Prénom : </td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"prenom_emp\" size=\"30\" maxlength=25 onKeypress=\"return nomValide(event);\"/></td>\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr></tr><tr></tr><tr></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">*Date de Naissance : </td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><select class=\"choix\" name=\"jour_emp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option selected></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"01\">01</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"02\">02</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"03\">03</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"04\">04</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"05\">05</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"06\">06</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"07\">07</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"08\">08</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"09\">09</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
for(int i=10;i<=31;i++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(i );
      out.write('"');
      out.write('>');
      out.print(i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
} 
      out.write("\t\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<select class=\"choix\" name=\"mois_emp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option selected></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Janvier\">Janvier</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Février\">Fevrier</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Mars\">Mars</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Avril\">Avril</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Mai\">Mai</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Juin\">Juin</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Juillet\">Juillet</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Août\">Aout</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Septembre\">Septembre</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Octobre\">Octobre</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Novembre\">Novembre</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Décembre\">Decembre</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<select class=\"choix\" name=\"annee_emp\">\r\n");
      out.write("\t\t\t\t\t\t<option selected></option>\r\n");
      out.write("\t\t\t\t\t\t");
for(int i=1930; i<=2060; i++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"");
      out.print(i );
      out.write('"');
      out.write('>');
      out.print(i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t</select>  \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\t\r\n");
      out.write("\t\t\t<tr></tr><tr></tr><tr></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">*Lieu de naissance : </td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"lieu_nais_emp\" size=\"30\" maxlength=25/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr></tr><tr></tr><tr></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">*Adresse : </td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"adr_emp\" size=\"55\" maxlength=50/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr></tr><tr></tr><tr></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">*Sexe : </td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><input type=\"radio\" name=\"sexe_emp\" value=\"Homme\"/>Homme</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><input type=\"radio\" name=\"sexe_emp\" value=\"Femme\"/>Femme</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr></tr><tr></tr><tr></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">*Numéro SS : </td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"nss_emp\" size=\"30\" maxlength=12 onKeypress=\"return numValide(event);\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr></tr><tr></tr><tr></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">Numéro de tel : </td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><input class=\"moz\" type=\"text\" name=\"tel_emp\" size=\"30\" maxlength=13 onKeypress=\"return numValide(event);\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr></tr><tr></tr><tr></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">*Date de recrutement : </td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><select class=\"choix\" name=\"jour_recrut_emp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option selected></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"01\">01</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"02\">02</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"03\">03</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"04\">04</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"05\">05</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"06\">06</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"07\">07</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"08\">08</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"09\">09</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
for(int i=10;i<=31;i++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(i );
      out.write('"');
      out.write('>');
      out.print(i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
} 
      out.write("\t\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<select class=\"choix\" name=\"mois_recrut_emp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option selected></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Janvier\">Janvier</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Février\">Fevrier</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Mars\">Mars</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Avril\">Avril</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Mai\">Mai</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Juin\">Juin</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Juillet\">Juillet</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Août\">Aout</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Septembre\">Septembre</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Octobre\">Octobre</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Novembre\">Novembre</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Décembre\">Decembre</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<select class=\"choix\" name=\"annee_recrut_emp\">\r\n");
      out.write("\t\t\t\t\t\t<option selected></option>\r\n");
      out.write("\t\t\t\t\t\t");
for(int i=1970; i<=2080; i++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"");
      out.print(i );
      out.write('"');
      out.write('>');
      out.print(i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</td>\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr></tr><tr></tr><tr></tr><tr></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">*Situation familiale : </td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><select class=\"choix\" name=\"SF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option selected></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Célibataire\">Celibataire</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Marié(e)\">Marie(e)</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Divorcé(e)\">Divorce(e)</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"Veuf(ve)\">Veuf(ve)</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t<tr></tr><tr></tr><tr></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td\">*Situation professionnelle : </td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><input type=\"radio\" name=\"SP\" value=\"Actif\"/>Actif</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td class=\"td2\"><input type=\"radio\" name=\"SP\" value=\"Inactif\"/>Inactif</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr></tr><tr></tr><tr></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t<br/>\r\n");
      out.write("\t<div style=\"margin-left:35%;\">\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><input type=\"submit\" name=\"ajouter\" value=\"AJOUTER\" /></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td><input type=\"reset\" name=\"reinit\" value=\"REINITIALISER\"/></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\t<br/><br/><br/>\r\n");
      out.write("\t\t<p>Tous les champs précédés d'un astérisque (*) sont obligatoires.</p>\r\n");
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
