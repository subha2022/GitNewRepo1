package inheritanceByVinothSir;

public class SingleInheritanceAccount 
{
	public void deposit()
	{
		System.out.println("Amount is diposited");
		System.out.println("Account class is executed");
	}
	public void withdrawl()
	{
		System.out.println("Amount is withdrawn");
		System.out.println("Account class is executed");
	}

	public static void main(String[] args)
	{
		SingleInheritanceAccount obj =new SingleInheritanceAccount();
		obj.deposit();
		obj.withdrawl();

	}

}
