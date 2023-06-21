package com.java.program;

public class HDFC_Interface implements BankATM_Interface,Net_Banking_Interface{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pinChange() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mobileRegistration() {
		System.out.println("MobileRegistration method is executed-Interface");
	}

	@Override
	public void moneyTransfer() {
		System.out.println("Money Transfer facility if available for HDFC user.");
		
	}

}
