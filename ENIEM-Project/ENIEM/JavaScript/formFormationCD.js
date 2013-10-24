// JavaScript Document

function verifFCD()
{
	if(document.FormFCD.int_fcd.value == "")
    { 
	 alert("Warning : Le champ 'Intitule de la formation : ' n'est pas renseigne.");	 
	 document.FormFCD.int_fcd.focus();
	 return false;
    }
	if(document.FormFCD.int_fcd.value.length < 3)
	{ 
		alert ("L'intitule de la formation doit comporter au moins 3 caracteres."); 
		document.FormFCD.int_fcd.focus();
		return false; 
	}
	if(document.FormFCD.jour_deb_fcd.value == "")
    { 
	 alert("Warning : Le champ 'Date de debut : ' n'est pas renseigne.");	 
	 document.FormFCD.jour_deb_fcd.focus();
	 return false;
    }
	if(document.FormFCD.mois_deb_fcd.value == "")
    { 
	 alert("Warning : Le champ 'Date de debut : ' n'est pas renseigne.");	 
	 document.FormFCD.mois_deb_fcd.focus();
	 return false;
    }
	if(document.FormFCD.annee_deb_fcd.value == "")
    { 
	 alert("Warning : Le champ 'Date de debut : ' n'est pas renseigne.");	 
	 document.FormFCD.annee_deb_fcd.focus();
	 return false;
    }
	
	var datAct1=new Date();
   	var annAct1=parseInt(datAct1.getFullYear());
  	var datDeb=parseInt(document.FormFCD.annee_deb_fcd.value);
  
    if(annAct1<datDeb)
    {
	    alert("L'annee de debut de la formation depasse l'annee actuelle. Veuillez ressaisir le champ 'Annee de debut : ' SVP.");
 	    document.FormFCD.annee_deb_fcd.focus();
 	    return false;
    }
	
	
	if(document.FormFCD.jour_fin_fcd.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigne.");	 
	 document.FormFCD.jour_fin_fcd.focus();
	 return false;
    }
	if(document.FormFCD.mois_fin_fcd.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigne.");	 
	 document.FormFCD.mois_fin_fcd.focus();
	 return false;
    }
	if(document.FormFCD.annee_fin_fcd.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigne.");	 
	 document.FormFCD.annee_fin_fcd.focus();
	 return false;
    }
	var deb=parseInt(document.FormFCD.annee_deb_fcd.value);
   	var fin=parseInt(document.FormFCD.annee_fin_fcd.value);
    var diff=fin-deb;
   if(diff<0 || diff>1)
   {
	   alert("Date de debut ou Date de fin incoherente. Veuillez saisir une date coherente SVP.");
	   document.FormFCD.annee_fin_fcd.focus();
	   return false;
   }
   
	if(document.FormFCD.theme_fcd.value == "")
    { 
	 alert("Warning : Le champ 'Theme de la formation : ' n'est pas renseigne.");	 
	 document.FormFCD.theme_fcd.focus();
	 return false;
    }
	if(document.FormFCD.theme_fcd.value.length < 3)
	{ 
		alert ("Le theme de la formation doit comporter au moins 3 caracteres."); 
		document.FormFCD.theme_fcd.focus();
		return false; 
	}
	if(document.FormFCD.dur_fcd.value == "")
    { 
	 alert("Warning : Le champ 'Duree de la formation : ' n'est pas renseigne.");	 
	 document.FormFCD.dur_fcd.focus();
	 return false;
    }
	if(document.FormFCD.dur_fcd.value.length < 3)
	{ 
		alert ("La duree de la formation doit comporter au moins 3 caracteres."); 
		document.FormFCD.dur_fcd.focus();
		return false; 
	}
return true;
	
}