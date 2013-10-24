// JavaScript Document

function validation(FormSetLog) 
{
  if (FormSetLog.oldloginGS.value == '') 
  {
    alert('Warning : Veuillez saisir le login actuel.');
    FormSetLog.oldloginGS.focus();
    return false;
  }
  
  if (FormSetLog.newloginGS.value == '') 
  {
    alert('Warning : Veuillez saisir le nouveau login.');
    FormSetLog.newloginGS.focus();
    return false;
  }
 return true;
}