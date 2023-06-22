package practice1;

import practice.RBI;

public class HDFC implements RBI
{

	public static void main(String[] args) 
	{
		HDFC obj = new HDFC();
		obj.deposit();
		obj.withdrawl();
	}

	public void deposit() {
		System.out.println("I am Deposit method of RBI");
		
	}

	public void withdrawl() {
		System.out.println("I am Withdrawl method of RBI");
		
	}

	

}
