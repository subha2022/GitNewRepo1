package abstractclassdemo;

public class RBIBank extends BankATMScreen
{
// Implementation of the abstract class will be done n subclass
	@Override
	void deposit() {
		System.out.println("Deposit method is executed");
		
	}

	@Override
	void withdrawl() {
		System.out.println("Withdrawl method is executed");
		
	}

	@Override
	void balance() {
		System.out.println("Balance method is executed");
		
	}

	@Override
	void pinChange() {
		System.out.println("PinChange method is executed");
		
	}

	@Override
	void mobileRegistration() {
		// TODO Auto-generated method stub
		
	}

}
