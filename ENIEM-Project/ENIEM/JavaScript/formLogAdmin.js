// JavaScript Document

function validation(FormSetLog) 
{
  if (FormSetLog.oldloginAdmin.value == '') 
  {
    alert('Warning : Veuillez saisir le login actuel.');
    FormSetLog.oldloginAdmin.focus();
    return false;
  }
  
  if (FormSetLog.newloginAdmin.value == '') 
  {
    alert('Warning : Veuillez saisir le nouveau login.');
    FormSetLog.newloginAdmin.focus();
    return false;
  }
 return true;
}