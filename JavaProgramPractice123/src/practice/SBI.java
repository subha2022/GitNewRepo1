package practice;

public class SBI implements RBI
{

	public static void main(String[] args)
	{
		 SBI obj1 = new SBI();
		 obj1.deposit();
		 obj1.withdrawl();
	}

	@Override
	public void deposit() 
	{
		System.out.println("I am a deposit method of RBI");
		
	}

	@Override
	public void withdrawl() 
	{
		System.out.println("I am a withdrawl method of RBI");
		
	}

}
