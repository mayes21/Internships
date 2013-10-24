
// JavaScript Document

  function verifform()
  {
	// Verification zone de texte : matricule employé
   if(document.FormulaireEmploye.chiffre_mat.value == "" || document.FormulaireEmploye.lettre_mat.value == "")
    { 
	 alert("warning: Le champ 'Matricule : n'est pas renseigne.");	 
	 document.FormulaireEmploye.chiffre_mat.focus();
	 return false;
	}
	if(document.FormulaireEmploye.chiffre_mat.value.length != 5)
	{ 
		alert ('Le matricule doit comporter 5 chiffres'); 
		document.FormulaireEmploye.chiffre_mat.focus();
		return false; 
	}
	// Verification zone de texte : nom employé
   if(document.FormulaireEmploye.nom_emp.value == "")
    {
     alert("Warning : Le champ 'Nom : ' n'est pas renseigne.");
     document.FormulaireEmploye.nom_emp.focus();
     return false;
    }
	if(document.FormulaireEmploye.nom_emp.value.length < 3)
	{ 
		alert ('Le nom doit comporter au moins 3 lettres'); 
		document.FormulaireEmploye.nom_emp.focus();
		return false; 
	}
	// Verification zone de texte : prénom employé
   if(document.FormulaireEmploye.prenom_emp.value == "")
    {
     alert("Warning : Le champ 'Prenom : ' n'est pas renseigne.");
     document.FormulaireEmploye.prenom_emp.focus();
     return false;
    }
	if(document.FormulaireEmploye.prenom_emp.value.length < 3)
	{ 
		alert ('Le prenom doit comporter au moins 3 lettres'); 
		document.FormulaireEmploye.prenom_emp.focus();
		return false; 
	}
   // Verification liste déroulante : jour naissance employé
   if(document.FormulaireEmploye.jour_emp.value == "")
	{
	 alert("Warning : Le champ 'Date de naissance : ' n'est pas renseigne.");
	 document.FormulaireEmploye.jour_emp.focus();
	 return false;
	}
   // Verification liste déroulante : mois naissance employé
   if(document.FormulaireEmploye.mois_emp.value == "")
	{
	 alert("Warning : Le champ 'Date de naissance : ' n'est pas renseigne.");
	 document.FormulaireEmploye.mois_emp.focus();
	 return false;
	}
    // Verification liste déroulante : année naissance employé
   if(document.FormulaireEmploye.annee_emp.value == "")
	{
	 alert("Warning : Le champ 'Date de naissance : ' n'est pas renseigne.");
	 document.FormulaireEmploye.annee_emp.focus();
	 return false;
	}
	
	var datAct1=new Date();
    var annAct1=parseInt(datAct1.getFullYear());
    var datNais=parseInt(document.FormulaireEmploye.annee_emp.value);
  
    if(annAct1<datNais)
    {
	   alert("L'annee de naissance depasse l'année actuelle. Veuillez ressaisir le champ 'Annee de naissance : ' SVP.");
	   document.FormulaireEmploye.annee_emp.focus();
	   return false;
    }
	
	
	// Verification zone de texte : lieu de naissance employé
   if(document.FormulaireEmploye.lieu_nais_emp.value == "")
   {
    alert("Warning : Le champ 'Lieu de naissance : ' n'est pas renseigne.");
    document.FormulaireEmploye.lieu_nais_emp.focus();
    return false;
   }
   if(document.FormulaireEmploye.lieu_nais_emp.value.length < 2)
	{ 
		alert ('Lieu de naissance invalide.'); 
		document.FormulaireEmploye.lieu_nais_emp.focus();
		return false; 
	}
   // Verification zone de texte : adresse employé
   if(document.FormulaireEmploye.adr_emp.value == "")
   {
    alert("Warning : Le champ 'Adresse : ' n'est pas renseigne.");
    document.FormulaireEmploye.adr_emp.focus();
    return false;
   }
     if(document.FormulaireEmploye.adr_emp.value.length < 2)
   {
    alert("Adresse invalide.");
    document.FormulaireEmploye.adr_emp.focus();
    return false;
   }
   // Verification bouton radio : Sexe Employé
   var cocher=false;
   var radioTab=document.getElementsByName("sexe_emp");
   for(var i=0; i< radioTab.length;i++)
   {
   			if(radioTab[i].checked==true)
			{
	  		  cocher=true;
			}
   }
   if(cocher==false)
   {	
	   alert("Warning : Le champ 'Sexe : ' n'est pas renseigne.");
	   return false;
	  
   }
	// Verification zone de texte : Numero SS employé
   if(document.FormulaireEmploye.nss_emp.value == "")
   {
    alert("Warning : Le champ 'Numero SS : ' n'est pas renseigne.");
    document.FormulaireEmploye.nss_emp.focus();
    return false;
   }
   if(document.FormulaireEmploye.nss_emp.value.length < 12)
   {
    alert("Numero de Securite Social invalide.");
    document.FormulaireEmploye.nss_emp.focus();
    return false;
   }
   //Verification liste déroulante : Date recrutement jour1
   if(document.FormulaireEmploye.jour_recrut_emp.value == "")
	{
	 alert("Warning : Le champ 'Date de recrutement : ' n'est pas renseigne.");
	 document.FormulaireEmploye.jour_recrut_emp.focus();
	 return false;
	}
   //Verification liste déroulante : Date recrutement mois1
   if(document.FormulaireEmploye.mois_recrut_emp.value == "")
	{
	 alert("Warning : Le champ 'Date de recrutement : ' n'est pas renseigne.");
	 document.FormulaireEmploye.mois_recrut_emp.focus();
	 return false;
	}
   //Verification liste déroulante : Date recrutement année1
   if(document.FormulaireEmploye.annee_recrut_emp.value == "")
	{
	 alert("Warning : Le champ 'Date de recrutement : ' n'est pas renseigne.");
	 document.FormulaireEmploye.annee_recrut_emp.focus();
	 return false;
	}
	
   var nais=parseInt(document.FormulaireEmploye.annee_emp.value);
   var rec=parseInt(document.FormulaireEmploye.annee_recrut_emp.value);
   var diff=rec-nais;
   if(diff<18 || diff>=62)
   {
	   alert("Annee de naissance ou Annee de recrutement incoherente. Veuillez saisir une date coherente SVP.");
	   document.FormulaireEmploye.annee_recrut_emp.focus();
	   return false;
   }
   
	var datAct2=new Date();
    var annAct2=parseInt(datAct2.getFullYear());
    var datRec=parseInt(document.FormulaireEmploye.annee_recrut_emp.value);
  
    if(annAct2<datRec)
    {
	   alert("L'annee de recrutement depasse l'annee actuelle. Veuillez ressaisir le champ 'Annee de recrutement : ' SVP.");
	   document.FormulaireEmploye.annee_recrut_emp.focus();
	   return false;
    }
	
	
   // Verification bouton radio : Situation familiale Employé
   if(document.FormulaireEmploye.SF.value == "")
	{
	 alert("Warning : Le champ 'Situation familiale : ' n'est pas renseigne.");
	 document.FormulaireEmploye.SF.focus();
	 return false;
	}
   // Verification bouton radio : Situation professionnelle Employé
   var cocher2=false;
   var radioTab2=document.getElementsByName("SP");
   for(var j=0; j<radioTab2.length; j++)
   {
   			if(radioTab2[j].checked==true)
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


function nomValide(evt) 
{
	var keyCode = evt.which ? evt.which : evt.keyCode;
	if (keyCode==9) return true;
	else if(keyCode==8) return true;
	var accepter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-";
	if (accepter.indexOf(String.fromCharCode(keyCode)) >= 0) 
	{
		return true;
	}
	else
	{
		return false;
	}
}

function matValide(evnt) 
{
	var keyCode = evnt.which ? evnt.which : evnt.keyCode;
	if (keyCode==9) return true;
	else if(keyCode==8) return true;
	var accepter = "23456789";
	if (accepter.indexOf(String.fromCharCode(keyCode)) >= 0) 
	{
		return true;
	}
	else
	{
		return false;
	}
}

function numValide(evt)
{
	var keyCode = evt.which ? evt.which : evt.keyCode;
	if (keyCode==9) return true;
	else if(keyCode==8) return true;
	var accepter = "+0123456789";
	if (accepter.indexOf(String.fromCharCode(keyCode)) >= 0) 
	{
		return true;
	}
	else
	{
		return false;
	}
}

