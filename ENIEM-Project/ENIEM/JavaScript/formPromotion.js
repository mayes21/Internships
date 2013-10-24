// JavaScript Document

function verifformpro()
{
	if(document.FormulairePromotion.anc_post.value == "")
    { 
	 alert("Warning : Le champ 'Ancien poste : ' n'est pas renseigne.");	 
	 document.FormulairePromotion.anc_post.focus();
	 return false;
    }	
	if(document.FormulairePromotion.anc_post.value.length < 3)
	{ 
		alert ("L'ancien poste doit comporter au moins 3 caracteres."); 
		document.FormulairePromotion.anc_post.focus();
		return false; 
	}
		
	if(document.FormulairePromotion.nouv_post.value == "")
    { 
	 alert("Warning : Le champ 'Nouveau poste : ' n'est pas renseigne.");	 
	 document.FormulairePromotion.nouv_post.focus();
	 return false;
    }
	if(document.FormulairePromotion.nouv_post.value.length < 3)
	{ 
		alert ("Le nouveau poste doit comporter au moins 3 caracteres."); 
		document.FormulairePromotion.nouv_post.focus();
		return false; 
	}
		
	if(document.FormulairePromotion.jour_pro.value == "")
    { 
	 alert("Warning : Le champ 'Date de la promotion : ' n'est pas renseigne.");	 
	 document.FormulairePromotion.jour_pro.focus();
	 return false;
    }	
	if(document.FormulairePromotion.mois_pro.value == "")
    { 
	 alert("Warning : Le champ 'Date de la promotion : ' n'est pas renseigne.");	 
	 document.FormulairePromotion.mois_pro.focus();
	 return false;
    }	
	if(document.FormulairePromotion.annee_pro.value == "")
    { 
	 alert("Warning : Le champ 'Date de la promotion : ' n'est pas renseigne.");	 
	 document.FormulairePromotion.annee_pro.focus();
	 return false;
    }	
	
	var datAct=new Date();
   	var annAct=parseInt(datAct.getFullYear());
  	var datDeb=parseInt(document.FormulairePromotion.annee_pro.value);
  
    if(annAct<datDeb)
    {
	    alert("L'annee de la promotion depasse l'annee actuelle. Veuillez ressaisir le champ 'Annee de la promotion : ' SVP.");
 	    document.FormulairePromotion.annee_pro.focus();
 	    return false;
    }
	
return true;

}