// JavaScript Document

function verifformpost()
{
	if(document.FormulairePoste.int_post.value == "")
    { 
	 alert("Warning : Le champ 'Intitule du poste : ' n'est pas renseigne.");	 
	 document.FormulairePoste.int_post.focus();
	 return false;
    }	
	if(document.FormulairePoste.int_post.value.length < 3)
	{ 
		alert ("L'intitule du poste doit comporter au moins 3 caracteres."); 
		document.FormulairePoste.int_post.focus();
		return false; 
	}
	
	if(document.FormulairePoste.tach_post.value == "")
    { 
	 alert("Warning : Le champ 'Taches du poste : ' n'est pas renseigne.");	 
	 document.FormulairePoste.tach_post.focus();
	 return false;
    }	
	
	if(document.FormulairePoste.niv_etud_req.value == "")
    { 
	 alert("Warning : Le champ 'Niveau d'etude requis : ' n'est pas renseigne.");	 
	 document.FormulairePoste.niv_etud_req.focus();
	 return false;
    }
	if(document.FormulairePoste.niv_etud_req.value.length < 3)
	{ 
		alert ("Le niveau d'etude requis doit comporter au moins 3 caracteres."); 
		document.FormulairePoste.niv_etud_req.focus();
		return false; 
	}
	
	
	if(document.FormulairePoste.spec_post.value == "")
    { 
	 alert("Warning : Le champ 'Specialite du poste : ' n'est pas renseigne.");	 
	 document.FormulairePoste.spec_post.focus();
	 return false;
    }	
	if(document.FormulairePoste.spec_post.value.length < 3)
	{ 
		alert ("La specialite du poste doit comporter au moins 3 caracteres."); 
		document.FormulairePoste.spec_post.focus();
		return false; 
	}
	
	
	if(document.FormulairePoste.dur_per_ess.value == "")
    { 
	 alert("Warning : Le champ 'Duree de la periode d'essai : ' n'est pas renseigne.");	 
	 document.FormulairePoste.dur_per_ess.focus();
	 return false;
    }	
	
	if(document.FormulairePoste.nuis_post.value == "")
    { 
	 alert("Warning : Le champ 'Nuisances du poste : ' n'est pas renseigne.");	 
	 document.FormulairePoste.nuis_post.focus();
	 return false;
    }	
	return true;
}