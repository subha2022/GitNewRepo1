package inheritanceByVinothSir;

public class PrivilegedAccount extends SavingAccount
{
	public String customerName(String name)
	{
		System.out.println("The name of the customer is: "+ name);
		System.out.println("Privileged Account class is executed");
		return name;
	}

	public static void main(String[] args) 
	{
		PrivilegedAccount person2 = new PrivilegedAccount();
		person2.deposit();
		person2.withdrawl();
		person2.viewAcc(12456);
		person2.customerName("Subhasmita");
	}

}
