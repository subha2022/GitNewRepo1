package com.java.program;

public abstract class BankATMScreen_Abstract 
{
	//Abstract method has no body
	abstract void deposit();
	abstract void withdrawl();
	abstract void balance();
	abstract void pinChange();
	abstract void mobileRegistration();

	//Non abstract method has body
	public void miniStatement()
	{
		System.out.println("Mini Satement is dispalyed");
	}
}
