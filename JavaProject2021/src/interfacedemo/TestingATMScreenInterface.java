package interfacedemo;

public class TestingATMScreenInterface 
{
public static void main(String[] args) 
{
	//This is one way
	/*BankATMScreen obj = new RBIBank();
	BankATMScreen obj1 = new HDFCBank();*/
	
	//alternative way
	BankATMScreenbyVinoth obj;
	obj = new RBIBankbyVinoth();
	obj.deposit();
	obj.withdrawl();
	obj.pinChange();
	
	
	// creating object for HDFC Bank
	obj= new HDFCBankbyVinoth();
	obj.mobileRegistration();
	

}
}
