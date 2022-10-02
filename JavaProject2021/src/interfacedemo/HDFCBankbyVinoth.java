package interfacedemo;

public class HDFCBankbyVinoth implements BankATMScreenbyVinoth,NetBankingScreenbyVinoth{

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
		System.out.println("MobileRegistration method is executed");
		
	}

	@Override
	public void moneyTransfer() {
		System.out.println("MoneyTransfer method is executed for HDFC Bank");
		
	}

}
