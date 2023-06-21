package com.java.program;

public class Self_AccessModifier 
{
	//Public is access all level
	public void  bankName()
	{
		System.out.println("Having Home Loan in HDFC Bank");
	}
	//Protected is access with in the package and outside of the package using inheritance concept not using object instance
	protected void loanDetails()
	{
		System.out.println("50Lakhs Home Loan");
	}
	//Default has no keyword,It is access with in the package
	void atmPassword()
	{
		System.out.println("1245 is the atm password");
	}
	//Private access modifier can access with in the class premises
	private void internetBanking()
	{
		System.out.println("Abc is internet banking password");
	}
	public static void main(String[] args) 
	{
		Self_AccessModifier obj = new Self_AccessModifier();
		obj.bankName();
		obj.loanDetails();
		obj.atmPassword();
		obj.internetBanking();
	}

}
