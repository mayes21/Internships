// JavaScript Document

function validation(FormSetPass) 
{
  if (FormSetPass.oldPassGEF.value == '' || FormSetPass.newPassGEF.value == '' || FormSetPass.newPass1GEF.value == '') 
  {
    alert('Warning : Les champs ne sont pas tous remplis.');
    FormSetPass.newPassGEF.focus();
    return false;
  }
  
  if (FormSetPass.newPassGEF.value != FormSetPass.newPass1GEF.value) 
  {
    alert('Warning : Les mots de passes sont différents.');
    FormSetPass.newPassGEF.focus();
    return false;
  }
  else if (FormSetPass.newPassGEF.value == FormSetPass.newPass1GEF.value) 
  {
    return true;  
  }
  else 
  {
    FormSetPass.newPassGEF.focus();
    return false;
  }
}