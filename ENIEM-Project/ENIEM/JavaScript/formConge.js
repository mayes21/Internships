// JavaScript Document

function verifformcng()
{
	if(document.FormulaireConge.des_cng.value == "")
    { 
	 alert("Warning : Le champ 'Designation du conge : ' n'est pas renseigne.");	 
	 document.FormulaireConge.des_cng.focus();
	 return false;
    }	
	if(document.FormulaireConge.des_cng.value.length < 3)
	{ 
		alert ("La designation du conge doit comporter au moins 3 caracteres."); 
		document.FormulaireConge.des_cng.focus();
		return false; 
	}
	
	if(document.FormulaireConge.annee_cng.value == "")
    { 
	 alert("Warning : Le champ 'Annee du conge : ' n'est pas renseigne.");	 
	 document.FormulaireConge.annee_cng.focus();
	 return false;
    }	
	
	var datAct=new Date();
   	var annAct=parseInt(datAct.getFullYear());
  	var AnnCng=parseInt(document.FormulaireConge.annee_cng.value);
  
    if(annAct<AnnCng)
    {
	    alert("L'annee du congé depasse l'annee actuelle. Veuillez ressaisir le champ 'Annee du conge : ' SVP.");
 	    document.FormulaireConge.annee_cng.focus();
 	    return false;
    }
	
	
	if(document.FormulaireConge.jour_deb_cng.value == "")
    { 
	 alert("Warning : Le champ 'Date de debut : ' n'est pas renseigne.");	 
	 document.FormulaireConge.jour_deb_cng.focus();
	 return false;
    }
	if(document.FormulaireConge.mois_deb_cng.value == "")
    { 
	 alert("Warning : Le champ 'Date de debut : ' n'est pas renseigne.");	 
	 document.FormulaireConge.mois_deb_cng.focus();
	 return false;
    }
	if(document.FormulaireConge.annee_deb_cng.value == "")
    { 
	 alert("Warning : Le champ 'Date de debut : ' n'est pas renseigne.");	 
	 document.FormulaireConge.annee_deb_cng.focus();
	 return false;
    }
	
	var datAct1=new Date();
   	var annAct1=parseInt(datAct1.getFullYear());
  	var datDeb=parseInt(document.FormulaireConge.annee_deb_cng.value);
  
    if(annAct1<datDeb)
    {
	    alert("L'annee de debut du conge depasse l'annee actuelle. Veuillez ressaisir le champ 'Annee de debut : ' SVP.");
 	    document.FormulaireConge.annee_deb_cng.focus();
 	    return false;
    }
	
	
   var deb=parseInt(document.FormulaireConge.annee_deb_cng.value);
   var AnnCng=parseInt(document.FormulaireConge.annee_cng.value);
   if(deb!=AnnCng)
   {
	   alert("Annee du conge ou Annee de debut incoherente. Veuillez saisir une annee coherente SVP.");
	   document.FormulaireConge.annee_deb_cng.focus();
	   return false;
   }

	if(document.FormulaireConge.jour_fin_cng.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigne.");	 
	 document.FormulaireConge.jour_fin_cng.focus();
	 return false;
    }
	if(document.FormulaireConge.mois_fin_cng.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigne.");	 
	 document.FormulaireConge.mois_fin_cng.focus();
	 return false;
    }
	if(document.FormulaireConge.annee_fin_cng.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigne.");	 
	 document.FormulaireConge.annee_fin_cng.focus();
	 return false;
    }
	var deb=parseInt(document.FormulaireConge.annee_deb_cng.value);
   	var fin=parseInt(document.FormulaireConge.annee_fin_cng.value);
    var diff=fin-deb;
   if(diff<0 || diff>1)
   {
	   alert("Date de debut ou Date de fin incoherente. Veuillez saisir une date coherente SVP.");
	   document.FormulaireConge.annee_fin_cng.focus();
	   return false;
   }
   
   
return true;
}

