// JavaScript Document
function verifform3()
{

	if(document.FormulaireEnfant.prenom_enf.value == "")
    { 
	 alert("Warning : Le champ 'Prenom de l'enfant : ' n'est pas renseigne.");	 
	 document.FormulaireEnfant.prenom_enf.focus();
	 return false;
    }
	if(document.FormulaireEnfant.prenom_enf.value.length < 3)
	{ 
		alert ('Le prenom doit comporter au moins 3 lettres.'); 
		document.FormulaireEnfant.prenom_enf.focus();
		return false; 
	}
	
	if(document.FormulaireEnfant.jour_enf.value == "")
	{
	 alert("Warning : Le champ 'Date de naissance : ' n'est pas renseigne.");
	 document.FormulaireEnfant.jour_enf.focus();
	 return false;
	}
	if(document.FormulaireEnfant.mois_enf.value == "")
	{
	 alert("Warning : Le champ 'Date de naissance : ' n'est pas renseigne.");
	 document.FormulaireEnfant.mois_enf.focus();
	 return false;
	}
	if(document.FormulaireEnfant.annee_enf.value == "")
	{
	 alert("Warning : Le champ 'Date de naissance : ' n'est pas renseigne.");
	 document.FormulaireEnfant.annee_enf.focus();
	 return false;
	}
	var datAct1=new Date();
    var annAct1=parseInt(datAct1.getFullYear());
    var datNais=parseInt(document.FormulaireEnfant.annee_enf.value);
  
    if(annAct1<datNais)
    {
	   alert("L'annee de naissance depasse l'annee actuelle. Veuillez ressaisir le champ 'Annee de naissance : ' SVP.");
	   document.FormulaireEnfant.annee_enf.focus();
	   return false;
    }
	
   var cocher3=false;
   var radioTab3=document.getElementsByName("sexe_enf");
   for(var i=0; i< radioTab3.length;i++)
   {
   			if(radioTab3[i].checked==true)
			{
	  		  cocher3=true;
			}
   }
   if(cocher3==false)
   {	
	   alert("Warning : Le champ 'Sexe : ' n'est pas renseigne.");
	   return false;
   }
   
   var cocher4=false;
   var radioTab4=document.getElementsByName("ss_enf");
   for(var i=0; i< radioTab4.length;i++)
   {
   			if(radioTab4[i].checked==true)
			{
	  		  cocher4=true;
			}
   }
   if(cocher4==false)
   {	
	   alert("Warning : Le champ 'Situation scolaire : ' n'est pas renseigne.");
	   return false;
   }
    var datAct1=new Date();
    var annAct1=parseInt(datAct1.getFullYear());
    var datNais=parseInt(document.FormulaireEnfant.annee_enf.value);
  
    if(annAct1-datNais<4 && radioTab4[0].checked==true)
    {
	   alert("L'enfant est trop jeune pour etre scolarise(e).");
	   document.FormulaireEnfant.focus();
	   return false;
    }
   
 return true;
}