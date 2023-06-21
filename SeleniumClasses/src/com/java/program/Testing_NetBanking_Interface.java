package com.java.program;

public class Testing_NetBanking_Interface 
{

	public static void main(String[] args) 
	{
		Net_Banking_Interface obj;
		 
		obj = new RBI_Bank_Interface();
		obj.deposit();
		obj.withdrawl();
		obj.balance();
		obj.pinChange();
		obj.mobileRegistration();

		
		//creating object instance for HDFC Bank
		obj = new HDFC_Interface();
		obj.mobileRegistration();
		obj.moneyTransfer();

	}

}
