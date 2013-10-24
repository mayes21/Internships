// JavaScript Document

function validation(FormSetAdmin) 
{
  if (FormSetAdmin.oldPass.value == '' || FormSetAdmin.newPass.value == '' || FormSetAdmin.newPass1.value == '') 
  {
    alert('Warning : Tous les champs ne sont pas remplis.');
    FormSetAdmin.mdp1.focus();
    return false;
  }
  
  if (FormSetAdmin.newPass.value != FormSetAdmin.newPass1.value) 
  {
    alert('Warning : Les mots de passes sont différents.');
    FormSetAdmin.mdp1.focus();
    return false;
  }
  else if (FormSetAdmin.newPass.value == FormSetAdmin.newPass1.value) 
  {
    return true;  
  }
  else 
  {
    FormSetAdmin.newPass.focus();
    return false;
  }
}