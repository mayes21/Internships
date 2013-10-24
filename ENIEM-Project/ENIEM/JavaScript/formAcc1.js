// JavaScript Document

function verifAcc1()
{
	
	
   var cocher=false;
   var radioTab=document.getElementsByName("idModif");
   for(var i=0; i< radioTab.length;i++)
   {
   			if(radioTab[i].checked==true)
			{
	  		  cocher=true;
			}
   }
   if(cocher==false)
   {	
	   alert("Warning : veuillez selectionner un employe pour continuer.");
	   return false;
	  
   }
	
}