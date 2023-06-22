package practice;

import practice1.HDFC;

public class Interface_Implementaion {

	public static void main(String[] args) {
		RBI obj;
		
		SBI obj1= new SBI();
		obj1.deposit();
		obj1.withdrawl();
		
		HDFC obj2 = new HDFC();
		obj2.deposit();
		obj2.withdrawl();

	}

}
