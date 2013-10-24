// JavaScript Document

function validation(FormSetLog) 
{
  if (FormSetLog.oldloginGEF.value == '') 
  {
    alert('Warning : Veuillez saisir le login actuel.');
    FormSetLog.oldloginGEF.focus();
    return false;
  }
  
  if (FormSetLog.newloginGEF.value == '') 
  {
    alert('Warning : Veuillez saisir le nouveau login.');
    FormSetLog.newloginGEF.focus();
    return false;
  }
 return true;
}