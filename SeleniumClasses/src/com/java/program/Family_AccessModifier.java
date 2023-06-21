package com.java.program;

public class Family_AccessModifier extends Self_AccessModifier
{

	public static void main(String[] args) 
	{
		Family_AccessModifier obj = new Family_AccessModifier();
		obj.bankName();
		obj.loanDetails();
		obj.atmPassword();
		//obj.internetBanking();// This is private access modifier
		
	}

}
