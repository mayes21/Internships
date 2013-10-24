// JavaScript Document
function verifform2()
{
	
   if(document.FormulaireConjoint.nom_conj.value == "")
    { 
	 alert("Warning : Le champ 'Nom du conjoint : ' n'est pas renseigne.");	 
	 document.FormulaireConjoint.nom_conj.focus();
	 return false;
    }
	if(document.FormulaireConjoint.nom_conj.value.length < 3)
	{ 
		alert ('Le nom doit comporter au moins 3 lettres.'); 
		document.FormulaireConjoint.nom_conj.focus();
		return false; 
	}
	
   if(document.FormulaireConjoint.prenom_conj.value == "")
    { 
	 alert("Warning : Le champ 'Prenom du conjoint : ' n'est pas renseigne.");	 
	 document.FormulaireConjoint.prenom_conj.focus();
	 return false;
    }
	if(document.FormulaireConjoint.prenom_conj.value.length < 3)
	{ 
		alert ('Le prenom doit comporter au moins 3 lettres.'); 
		document.FormulaireConjoint.prenom_conj.focus();
		return false; 
	}

   
   if(document.FormulaireConjoint.jour_conj.value == "")
	{
	 alert("Warning : Le champ 'Date de naissance : ' n'est pas renseigne.");
	 document.FormulaireConjoint.jour_conj.focus();
	 return false;
	}
   
   if(document.FormulaireConjoint.mois_conj.value == "")
	{
	 alert("Warning : Le champ 'Date de naissance : ' n'est pas renseigne.");
	 document.FormulaireConjoint.mois_conj.focus();
	 return false;
	}
	
   if(document.FormulaireConjoint.annee_conj.value == "")
	{
	 alert("Warning : Le champ 'Date de naissance : ' n'est pas renseigne.");
	 document.FormulaireConjoint.annee_conj.focus();
	 return false;
	}
	var datAct1=new Date();
    var annAct1=parseInt(datAct1.getFullYear());
    var datNais=parseInt(document.FormulaireConjoint.annee_conj.value);
  
    if(annAct1<datNais)
    {
	   alert("L'annee de naissance depasse l'annee actuelle. Veuillez ressaisir le champ 'Annee de naissance : ' SVP.");
	   document.FormulaireConjoint.annee_conj.focus();
	   return false;
    }
	
   var cocher2=false;
   var radioTab2=document.getElementsByName("situationprof_conj");
   for(var k=0; k<radioTab2.length; k++)
   {
   			if(radioTab2[k].checked==true)
			{
	  		  cocher2=true;
			}
   }
   if(cocher2==false)
   {	
	   alert("Warning : Le champ 'Situation professionnelle : ' n'est pas renseigne.");
	   return false;  
   }
   
 return true;
}