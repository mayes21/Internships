// JavaScript Document

function verifformsnc()
{
	if(document.FormulaireSanction.des_sanc.value == "")
    { 
	 alert("Warning : Le champ 'Designation de la sanction : ' n'est pas renseigne.");	 
	 document.FormulaireSanction.des_sanc.focus();
	 return false;
    }		
	if(document.FormulaireSanction.des_sanc.value.length < 3)
	{ 
		alert ("La designation de la sanction doit comporter au moins 3 caracteres."); 
		document.FormulaireSanction.des_sanc.focus();
		return false; 
	}
	if(document.FormulaireSanction.deg_sanc.value == "")
    { 
	 alert("Warning : Le champ 'Degre de la sanction : ' n'est pas renseigne.");	 
	 document.FormulaireSanction.deg_sanc.focus();
	 return false;
    }
	
	if(document.FormulaireSanction.mot_sanc.value == "")
    { 
	 alert("Warning : Le champ 'Motif de la sanction : ' n'est pas renseigne.");	 
	 document.FormulaireSanction.mot_sanc.focus();
	 return false;
    }
	
	if(document.FormulaireSanction.jour_deb_sanc.value == "")
    { 
	 alert("Warning : Le champ 'Date de debut : ' n'est pas renseigne.");	 
	 document.FormulaireSanction.jour_deb_sanc.focus();
	 return false;
    }
	if(document.FormulaireSanction.mois_deb_sanc.value == "")
    { 
	 alert("Warning : Le champ 'Date de debut : ' n'est pas renseigne.");	 
	 document.FormulaireSanction.mois_deb_sanc.focus();
	 return false;
    }
	if(document.FormulaireSanction.annee_deb_sanc.value == "")
    { 
	 alert("Warning : Le champ 'Date de debut : ' n'est pas renseigne.");	 
	 document.FormulaireSanction.annee_deb_sanc.focus();
	 return false;
    }
	var datAct=new Date();
   	var annAct=parseInt(datAct.getFullYear());
  	var datDeb=parseInt(document.FormulaireSanction.annee_deb_sanc.value);
  
    if(annAct<datDeb)
    {
	    alert("L'annee de debut de la sanction dépasse l'annee actuelle. Veuillez ressaisir le champ 'Annee de debut : ' SVP.");
 	    document.FormulaireSanction.annee_deb_sanc.focus();
 	    return false;
    }
	

	if(document.FormulaireSanction.jour_fin_sanc.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigne.");	 
	 document.FormulaireSanction.jour_fin_sanc.focus();
	 return false;
    }
	if(document.FormulaireSanction.mois_fin_sanc.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigne.");	 
	 document.FormulaireSanction.mois_fin_sanc.focus();
	 return false;
    }
	if(document.FormulaireSanction.annee_fin_sanc.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigne.");	 
	 document.FormulaireSanction.annee_fin_sanc.focus();
	 return false;
    }
	var deb=parseInt(document.FormulaireSanction.annee_deb_sanc.value);
   	var fin=parseInt(document.FormulaireSanction.annee_fin_sanc.value);
    var diff=fin-deb;
   if(diff<0 || diff>1)
   {
	   alert("Date de debut ou Date de fin incoherente. Veuillez saisir une date coherente SVP.");
	   document.FormulaireSanction.annee_fin_sanc.focus();
	   return false;
   }
	
	if(document.FormulaireSanction.nbr_jour_sanc.value == "")
    { 
	 alert("Warning : Le champ 'Nombre de jour : ' n'est pas renseigne.");	 
	 document.FormulaireSanction.nbr_jour_sanc.focus();
	 return false;
    }
   return true;
}

function numValide(evt)
{
	var keyCode = evt.which ? evt.which : evt.keyCode;
	if (keyCode==9) return true;
	else if(keyCode==8) return true;
	var accepter = "0123456789";
	if (accepter.indexOf(String.fromCharCode(keyCode)) >= 0) 
	{
		return true;
	}
	else
	{
		return false;
	}
}