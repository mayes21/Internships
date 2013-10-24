// JavaScript Document

function verifformctr()
{
	if(document.FormulaireContrat.typ_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Type de contrat : ' n'est pas renseigné.");	 
	 document.FormulaireContrat.typ_ctr.focus();
	 return false;
    }
	if(document.FormulaireContrat.typ_ctr.value.length < 3)
	{ 
		alert ('Le type du contrat doit comporter au moins 3 caractères.'); 
		document.FormulaireContrat.typ_ctr.focus();
		return false; 
	}
	
	if(document.FormulaireContrat.des_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Désignation du contrat : ' n'est pas renseigné.");	 
	 document.FormulaireContrat.des_ctr.focus();
	 return false;
    }
	if(document.FormulaireContrat.des_ctr.value.length < 3)
	{ 
		alert ('La désignation du contrat doit comporter au moins 3 caractères.'); 
		document.FormulaireContrat.des_ctr.focus();
		return false; 
	}
	
	if(document.FormulaireContrat.jour_deb_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Date de début : ' n'est pas renseigné.");	 
	 document.FormulaireContrat.jour_deb_ctr.focus();
	 return false;
    }
	if(document.FormulaireContrat.mois_deb_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Date de début : ' n'est pas renseigné.");	 
	 document.FormulaireContrat.mois_deb_ctr.focus();
	 return false;
    }
	if(document.FormulaireContrat.année_deb_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Date de début : ' n'est pas renseigné.");	 
	 document.FormulaireContrat.année_deb_ctr.focus();
	 return false;
    }
	
   var datAct=new Date();
   var annAct=parseInt(datAct.getFullYear());
   var datDeb=parseInt(document.FormulaireContrat.année_deb_ctr.value);
  
   if(annAct<datDeb)
   {
	   alert("L'année de début de contrat dépasse l'année actuelle. Veuillez ressaisir le champ 'Année de début : ' SVP.");
	   document.FormulaireContrat.année_deb_ctr.focus();
	   return false;
   }
   
	if(document.FormulaireContrat.jour_fin_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigné.");	 
	 document.FormulaireContrat.jour_fin_ctr.focus();
	 return false;
    }
	if(document.FormulaireContrat.mois_fin_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigné.");	 
	 document.FormulaireContrat.mois_fin_ctr.focus();
	 return false;
    }
	if(document.FormulaireContrat.année_fin_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseigné.");	 
	 document.FormulaireContrat.année_fin_ctr.focus();
	 return false;
    }
	var deb=parseInt(document.FormulaireContrat.année_deb_ctr.value);
   	var fin=parseInt(document.FormulaireContrat.année_fin_ctr.value);
    var diff=fin-deb;
   if(diff<1 || diff>10)
   {
	   alert("Date de début ou Date de fin incohérente. Veuillez saisir une date cohérente SVP.");
	   document.FormulaireContrat.année_fin_ctr.focus();
	   return false;
   }
   
 
   
   
return true;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	