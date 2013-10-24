package com.eniem.models;

public class CoupleUser {
	
	private static String  adminlog = "ADMIN";
	private static String  adminpass = "passadm";
	private static String  perspaielog = "GPP";
	private static String  perspaiepass = "passgpp";
	private static String  empformlog = "GEF";
	private static String  empformpass = "passgef";
	private static String  soclog = "GS";
	private static String  socpass = "passgs";
	
	
	public String getAdm()
		{
			return(adminlog);
		
		}
	
	public String getAdmPass()
		{
			return(adminpass);
	
		}
	
	public String getPersPaie()
		{
			return(perspaielog);
	
		}

	public String getPersPaiePass()
		{
			return(perspaiepass);

		}
	
	public String getEmpForm()
		{
			return(empformlog);

		}

	public String getEmpFormPass()
		{
			return(empformpass);
			
		}
	
	public String getSoc()
		{
			return(soclog);

		}

	public String getSocPass()
		{
			return(socpass);
		
		}
	
	
	
	public void setLogAdm(String adm)
		{
		
			adminlog = adm;
		
		}
	
	public void setLogGPP(String gpp)
		{
	
			perspaielog = gpp;
	
		}
	
	public void setLogGEF(String gef)
		{
	
			empformlog = gef;
	
		}
	
	public void setLogGS(String gs)
		{
	
			soclog = gs;
	
		}
	
	
	public void setPassAdm(String padm)
		{
		
			adminpass = padm;
		
		}
	
	public void setPassGPP(String pgpp)
		{
	
			perspaiepass = pgpp;
	
		}
	
	public void setPassGEF(String pgef)
		{
	
			empformpass = pgef;
	
		}
	
	public void setPassGS(String pgs)
		{
	
			socpass = pgs;
	
		}
	

}
