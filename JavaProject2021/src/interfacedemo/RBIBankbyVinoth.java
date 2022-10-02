package interfacedemo;

public class RBIBankbyVinoth implements BankATMScreenbyVinoth, NetBankingScreenbyVinoth 
{

	@Override
	public void deposit() {
		System.out.println("Deposit method is executed");
		
	}

	@Override
	public void withdrawl() {
		System.out.println("Withdrawl method is executed");
		
	}

	@Override
	public void balance() {
		System.out.println("Balance method is executed");
		
	}

	@Override
	public void pinChange() {
		System.out.println("Pinchange method is executed");
		
	}

	@Override
	public void mobileRegistration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moneyTransfer() {
		// TODO Auto-generated method stub
		
	}

}
