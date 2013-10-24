// JavaScript Document

function validation(FormSetPass) 
{
  if (FormSetPass.oldPassGS.value == '' || FormSetPass.newPassGS.value == '' || FormSetPass.newPass1GS.value == '') 
  {
    alert('Warning : Les champs ne sont pas tous remplis.');
    FormSetPass.newPassGS.focus();
    return false;
  }
  
  if (FormSetPass.newPassGS.value != FormSetPass.newPass1GS.value) 
  {
    alert('Warning : Les mots de passes sont différents.');
    FormSetPass.newPassGS.focus();
    return false;
  }
  else if (FormSetPass.newPassGS.value == FormSetPass.newPass1GS.value) 
  {
    return true;  
  }
  else 
  {
    FormSetPass.newPassGS.focus();
    return false;
  }
}