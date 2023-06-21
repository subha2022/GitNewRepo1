package abstractclassdemo;

public class TestingAbstractClassATMScreen 
{
public static void main(String[] args) 
{
	//This is one way
	/*BankATMScreen obj = new RBIBank();
	BankATMScreen obj1 = new HDFCBank();*/
	
	//alternative way
	BankATMScreen obj;
	obj = new RBIBank();
	obj.deposit();
	obj.withdrawl();
	obj.pinChange();
	
	obj.ministatement();

	// creating object for HDFC Bank
	obj= new HDFCBank();
	obj.mobileRegistration();
}
}
