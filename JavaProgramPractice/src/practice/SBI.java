package practice;

public class SBI implements RBI
{

	public void main(String[] args)
	{
		 SBI obj1 = new SBI();
		 obj1.deposit();
		 obj1.withdrawl();
	}

	public void deposit() {
		System.out.println("I am Deposit method of RBI");
		
	}

	public void withdrawl() {
		System.out.println("I am Withdrawl method of RBI");
		
	}

	
}
