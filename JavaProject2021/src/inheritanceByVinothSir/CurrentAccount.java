package inheritanceByVinothSir;

public class CurrentAccount extends SingleInheritanceAccount
{
	public float getRateOfInterest(float interest)
	{
		System.out.println("The rate of interest is: "+interest);
		System.out.println("Current Account class is executed");
		return interest;
	}

	public static void main(String[] args)
	{
		CurrentAccount person3 = new CurrentAccount();
		person3.deposit();
		person3.withdrawl();
		person3.getRateOfInterest(14.25f);
		

	}

}
