// JavaScript Document

function validation(FormSetPass) 
{
  if (FormSetPass.oldPassGPP.value == '' || FormSetPass.newPassGPP.value == '' || FormSetPass.newPass1GPP.value == '') 
  {
    alert('Warning : Les champs ne sont pas tous remplis.');
    FormSetPass.newPassGPP.focus();
    return false;
  }
  
  if (FormSetPass.newPassGPP.value != FormSetPass.newPass1GPP.value) 
  {
    alert('Warning : Les mots de passes sont différents.');
    FormSetPass.newPassGPP.focus();
    return false;
  }
  else if (FormSetPass.newPassGPP.value == FormSetPass.newPass1GPP.value) 
  {
    return true;  
  }
  else 
  {
    FormSetPass.newPassGPP.focus();
    return false;
  }
}