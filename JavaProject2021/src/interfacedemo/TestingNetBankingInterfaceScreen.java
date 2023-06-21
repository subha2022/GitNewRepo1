package interfacedemo;

public class TestingNetBankingInterfaceScreen 
{

	public static void main(String[] args) 
	{
		NetBankingScreenbyVinoth obj;
		
		obj= new RBIBankbyVinoth();
		obj.deposit();
		obj.withdrawl();
		obj.balance();
		obj.pinChange();
		
		obj= new HDFCBankbyVinoth();
		obj.mobileRegistration();
		obj.moneyTransfer();
		
	}

}
