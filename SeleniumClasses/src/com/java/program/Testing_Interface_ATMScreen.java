package com.java.program;

public class Testing_Interface_ATMScreen 
{

	public static void main(String[] args) 
	{
		BankATM_Interface obj;
		//creating object instance for RBI Bank
		obj = new RBI_Bank_Interface();
		obj.deposit();
		obj.withdrawl();
		obj.balance();
		obj.pinChange();
		obj.mobileRegistration();

		
		//creating object instance for HDFC Bank
		obj = new HDFC_Interface();
		obj.mobileRegistration();

	}

}
