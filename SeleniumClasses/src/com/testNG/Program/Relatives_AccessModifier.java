package com.testNG.Program;

import com.java.program.Self_AccessModifier;

public class Relatives_AccessModifier extends Self_AccessModifier
{

	public static void main(String[] args) 
	{
		Relatives_AccessModifier obj = new Relatives_AccessModifier();
		
		obj.bankName();  //this is public access modifier
		obj.loanDetails();//Protected access modifier
		//obj.atmPassword(); //Default access modifier
		//obj.internetBanking();// This is private access modifier
		
		
		

	}

}
