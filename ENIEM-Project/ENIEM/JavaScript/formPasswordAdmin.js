// JavaScript Document

function validation(FormSetPass) 
{
  if (FormSetPass.oldPassAdmin.value == '' || FormSetPass.newPassAdmin.value == '' || FormSetPass.newPass1Admin.value == '') 
  {
    alert('Warning : Les champs ne sont pas tous remplis.');
    FormSetPass.newPassAdmin.focus();
    return false;
  }
  
  if (FormSetPass.newPassAdmin.value != FormSetPass.newPass1Admin.value) 
  {
    alert('Warning : Les mots de passes sont différents.');
    FormSetPass.newPassAdmin.focus();
    return false;
  }
  else if (FormSetPass.newPassAdmin.value == FormSetPass.newPass1Admin.value) 
  {
    return true;  
  }
  else 
  {
    FormSetPass.newPassAdmin.focus();
    return false;
  }
}
