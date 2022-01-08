package interfacedemo;

public class SBI implements Rbi
{

	public static void main(String[] args) {
	SBI s = new SBI();
	s.deposit();
	s.withdrawl();
	}

	@Override
	public void withdrawl() {
	System.out.println("I am overriden Withdrawal in SBI");
		
	}

	@Override
	public void deposit() {
		System.out.println("I am overriden Deposite in SBI");
	}

}
