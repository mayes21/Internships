// JavaScript Document

function verifformctr()
{
	if(document.FormulaireContrat.typ_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Type de contrat : ' n'est pas renseign�.");	 
	 document.FormulaireContrat.typ_ctr.focus();
	 return false;
    }
	if(document.FormulaireContrat.typ_ctr.value.length < 3)
	{ 
		alert ('Le type du contrat doit comporter au moins 3 caract�res.'); 
		document.FormulaireContrat.typ_ctr.focus();
		return false; 
	}
	
	if(document.FormulaireContrat.des_ctr.value == "")
    { 
	 alert("Warning : Le champ 'D�signation du contrat : ' n'est pas renseign�.");	 
	 document.FormulaireContrat.des_ctr.focus();
	 return false;
    }
	if(document.FormulaireContrat.des_ctr.value.length < 3)
	{ 
		alert ('La d�signation du contrat doit comporter au moins 3 caract�res.'); 
		document.FormulaireContrat.des_ctr.focus();
		return false; 
	}
	
	if(document.FormulaireContrat.jour_deb_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Date de d�but : ' n'est pas renseign�.");	 
	 document.FormulaireContrat.jour_deb_ctr.focus();
	 return false;
    }
	if(document.FormulaireContrat.mois_deb_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Date de d�but : ' n'est pas renseign�.");	 
	 document.FormulaireContrat.mois_deb_ctr.focus();
	 return false;
    }
	if(document.FormulaireContrat.ann�e_deb_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Date de d�but : ' n'est pas renseign�.");	 
	 document.FormulaireContrat.ann�e_deb_ctr.focus();
	 return false;
    }
	
   var datAct=new Date();
   var annAct=parseInt(datAct.getFullYear());
   var datDeb=parseInt(document.FormulaireContrat.ann�e_deb_ctr.value);
  
   if(annAct<datDeb)
   {
	   alert("L'ann�e de d�but de contrat d�passe l'ann�e actuelle. Veuillez ressaisir le champ 'Ann�e de d�but : ' SVP.");
	   document.FormulaireContrat.ann�e_deb_ctr.focus();
	   return false;
   }
   
	if(document.FormulaireContrat.jour_fin_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseign�.");	 
	 document.FormulaireContrat.jour_fin_ctr.focus();
	 return false;
    }
	if(document.FormulaireContrat.mois_fin_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseign�.");	 
	 document.FormulaireContrat.mois_fin_ctr.focus();
	 return false;
    }
	if(document.FormulaireContrat.ann�e_fin_ctr.value == "")
    { 
	 alert("Warning : Le champ 'Date de fin : ' n'est pas renseign�.");	 
	 document.FormulaireContrat.ann�e_fin_ctr.focus();
	 return false;
    }
	var deb=parseInt(document.FormulaireContrat.ann�e_deb_ctr.value);
   	var fin=parseInt(document.FormulaireContrat.ann�e_fin_ctr.value);
    var diff=fin-deb;
   if(diff<1 || diff>10)
   {
	   alert("Date de d�but ou Date de fin incoh�rente. Veuillez saisir une date coh�rente SVP.");
	   document.FormulaireContrat.ann�e_fin_ctr.focus();
	   return false;
   }
   
 
   
   
return true;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	