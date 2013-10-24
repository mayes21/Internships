// JavaScript Document

function verifformmut()
{
	if(document.FormulaireMutation.nouv_post.value == "")
    { 
	 alert("Warning : Le champ 'Nouveau poste : ' n'est pas renseigne.");	 
	 document.FormulaireMutation.nouv_post.focus();
	 return false;
    }	
	if(document.FormulaireMutation.nouv_post.value.length < 3)
	{ 
		alert ("Le nouveau poste doit comporter au moins 3 caracteres."); 
		document.FormulaireMutation.nouv_post.focus();
		return false; 
	}
	if(document.FormulaireMutation.nouv_dept.value == "")
    { 
	 alert("Warning : Le champ 'Nouveau departement : ' n'est pas renseigne.");	 
	 document.FormulaireMutation.nouv_dept.focus();
	 return false;
    }	
	if(document.FormulaireMutation.nouv_dept.value.length < 3)
	{ 
		alert ("Le nouveau departement doit comporter au moins 3 caracteres."); 
		document.FormulaireMutation.nouv_dept.focus();
		return false; 
	}
	if(document.FormulaireMutation.rai_mut.value == "")
    { 
	 alert("Warning : Le champ 'Raison de la mutation : ' n'est pas renseigne.");	 
	 document.FormulaireMutation.rai_mut.focus();
	 return false;
    }	
	if(document.FormulaireMutation.jour_mut.value == "")
    { 
	 alert("Warning : Le champ 'Date de la mutation : ' n'est pas renseigne.");	 
	 document.FormulaireMutation.jour_mut.focus();
	 return false;
    }
	if(document.FormulaireMutation.mois_mut.value == "")
    { 
	 alert("Warning : Le champ 'Date de la mutation : ' n'est pas renseigne.");	 
	 document.FormulaireMutation.mois_mut.focus();
	 return false;
    }
	if(document.FormulaireMutation.annee_mut.value == "")
    { 
	 alert("Warning : Le champ 'Date de la mutation : ' n'est pas renseigne.");	 
	 document.FormulaireMutation.annee_mut.focus();
	 return false;
    }
	var datAct=new Date();
   	var annAct=parseInt(datAct.getFullYear());
  	var datDeb=parseInt(document.FormulaireMutation.annee_mut.value);
  
    if(annAct<datDeb)
    {
	    alert("L'annee de la mutation depasse l'annee actuelle. Veuillez ressaisir le champ 'Annee de la mutation : ' SVP.");
 	    document.FormulaireMutation.annee_mut.focus();
 	    return false;
    }
	
return true;
}