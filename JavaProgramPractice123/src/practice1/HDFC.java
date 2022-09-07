package practice1;
 interface RBI
 {
	 public void withdrawl();
	 public void deposit();
	 
 }

public class HDFC implements RBI
{

	public static void main(String[] args) 
	{
		HDFC obj = new HDFC();
		obj.withdrawl();
		obj.deposit();

	}

	@Override
	public void withdrawl() 
	{
		System.out.println("I am withdrawl method of RBI");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("I am deposit method of RBI");
		
	}

}
