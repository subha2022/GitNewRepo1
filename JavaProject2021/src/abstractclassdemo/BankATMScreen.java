package abstractclassdemo;

public abstract class BankATMScreen 
{
	abstract void deposit();
	abstract void withdrawl();
	abstract void balance();
	abstract void pinChange();
	abstract void mobileRegistration();

	void ministatement()
	{
		System.out.println("Mini Statement method is displayed");
	}
}
