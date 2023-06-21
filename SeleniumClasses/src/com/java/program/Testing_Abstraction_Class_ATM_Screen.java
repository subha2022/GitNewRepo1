package com.java.program;

public class Testing_Abstraction_Class_ATM_Screen 
{

	public static void main(String[] args) 
	{
		//This is one way
		/*BankATMScreen obj = new RBIBank();
		BankATMScreen obj1 = new HDFCBank();*/
		
		//alternative way
		BankATMScreen_Abstract obj;
		//creating object instance for RBI Bank
		obj = new RBI_Bank_Abstraction();
		obj.deposit();
		obj.withdrawl();
		obj.balance();
		obj.pinChange();
		obj.mobileRegistration();
		
		
		obj.miniStatement();
		
		//creating object instance for HDFC Bank
		obj = new HDFC_Bank_Abstraction();
		obj.mobileRegistration();
		
	}

}
