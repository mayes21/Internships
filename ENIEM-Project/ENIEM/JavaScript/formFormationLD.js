// JavaScript Document

function verifformlongue()
{
	if(document.FormFLD.int_fld.value == "")
    { 
	 alert("Warning : Le champ 'Intitule de la formation : ' n'est pas renseigne.");	 
	 document.FormFLD.int_fld.focus();
	 return false;
    }
	if(document.FormFLD.int_fld.value.length < 3)
	{ 
		alert ("L'intitule de la formation doit comporter au moins 3 caracteres."); 
		document.FormFLD.int_fld.focus();
		return false; 
	}
	if(document.FormFLD.jour_deb_fld.value == "")
    { 
	 alert("Warning : Le champ 'Date de debut : ' n'est pas renseigne.");	 
	 document.FormFLD.jour_deb_fld.focus();
	 return false;
    }
	if(document.FormFLD.mois_deb_fld.value == "")
    { 
	 alert("Warning : Le champ 'Date de debut : ' n'est pas renseigne.");	 
	 document.FormFLD.mois_deb_fld.focus();
	 return false;
    }
	if(document.FormFLD.annee_deb_fld.value == "")
    { 
	 alert("Warning : Le champ 'Date de debut : ' n'est pas renseigne.");	 
	 document.FormFLD.annee_deb_fld.focus();
	 return false;
    }
	
	var datAct1=new Date();
   	var annAct1=parseInt(datAct1.getFullYear());
  	var datDeb=parseInt(document.FormFLD.annee_deb_fld.value);
  
    if(annAct1<datDeb)
    {
	    alert("L'annee de debut de la formation depasse l'annee actuelle. Veuillez ressaisir le champ 'Annee de debut : ' SVP.");
 	    document.FormFLD.annee_deb_fld.focus();
 	    return false;
    }
	
	
	if(document.FormFLD.jour_fin_fld.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigne.");	 
	 document.FormFLD.jour_fin_fld.focus();
	 return false;
    }
	if(document.FormFLD.mois_fin_fld.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigne.");	 
	 document.FormFLD.mois_fin_fld.focus();
	 return false;
    }
	if(document.FormFLD.annee_fin_fld.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigne.");	 
	 document.FormFLD.annee_fin_fld.focus();
	 return false;
    }
	var deb=parseInt(document.FormFLD.annee_deb_fld.value);
   	var fin=parseInt(document.FormFLD.annee_fin_fld.value);
    var diff=fin-deb;
   if(diff<0 || diff>1)
   {
	   alert("Date de debut ou Date de fin incoherente. Veuillez saisir une date coherente SVP.");
	   document.FormFLD.annee_fin_fld.focus();
	   return false;
   }
	
	if(document.FormFLD.dip_obt.value == "")
    { 
	 alert("Warning : Le champ 'Diplome obtenu : ' n'est pas renseigne.");	 
	 document.FormFLD.dip_obt.focus();
	 return false;
    }
	if(document.FormFLD.dip_obt.value.length < 3)
	{ 
		alert ("Le diplome obtenu doit comporter au moins 3 caracteres."); 
		document.FormFLD.dip_obt.focus();
		return false; 
	}
	
	if(document.FormFLD.jour_obt.value == "")
    { 
	 alert("Warning : Le champ 'Date d'obtention : ' n'est pas renseigne.");	 
	 document.FormFLD.jour_obt.focus();
	 return false;
    }
	if(document.FormFLD.mois_obt.value == "")
    { 
	 alert("Warning : Le champ 'Date d'obtention : ' n'est pas renseigne.");	 
	 document.FormFLD.mois_obt.focus();
	 return false;
    }
	if(document.FormFLD.annee_obt.value == "")
    { 
	 alert("Warning : Le champ 'Date d'obtention : ' n'est pas renseigne.");	 
	 document.FormFLD.annee_obt.focus();
	 return false;
    }
	var datAct2=new Date();
   	var annAct2=parseInt(datAct2.getFullYear());
  	var datObt=parseInt(document.FormFLD.annee_obt.value);
  
    if(annAct2<datDeb)
    {
	    alert("L'annee d'obtention du diplome depasse l'annee actuelle. Veuillez ressaisir le champ 'Annee d'obtention : ' SVP.");
 	    document.FormFLD.annee_obt.focus();
 	    return false;
    }
	var datobt=parseInt(document.FormFLD.annee_obt.value);
   	var fin=parseInt(document.FormFLD.annee_fin_fld.value);
  	var diff2= datobt-fin;
   if(fin>datobt || diff2>1)
   {
	   alert("Date de fin ou Date d'obtention incoherente. Veuillez saisir une date coherente SVP.");
	   document.FormFLD.annee_fin_fld.focus();
	   return false;
   }
	
	if(document.FormFLD.ecole_fld.value == "")
    { 
	 alert("Warning : Le champ 'Ecole : ' n'est pas renseigne.");	 
	 document.FormFLD.ecole_fld.focus();
	 return false;
    }
	if(document.FormFLD.ecole_fld.value.length < 3)
	{ 
		alert ("L'ecole doit comporter au moins 3 caracteres."); 
		document.FormFLD.ecole_fld.focus();
		return false; 
	}
return true;
}