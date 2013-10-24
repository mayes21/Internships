// JavaScript Document

function validation(FormSetLog) 
{
  if (FormSetLog.oldloginGPP.value == '') 
  {
    alert('Warning : Veuillez saisir le login actuel.');
    FormSetLog.oldloginGPP.focus();
    return false;
  }
  
  if (FormSetLog.newloginGPP.value == '') 
  {
    alert('Warning : Veuillez saisir le nouveau login.');
    FormSetLog.newloginGPP.focus();
    return false;
  }
 return true;
}