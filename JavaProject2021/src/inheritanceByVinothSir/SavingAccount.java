package inheritanceByVinothSir;

public class SavingAccount extends SingleInheritanceAccount
{
	
	public int viewAcc(int acc)
	{
		System.out.println("The account summary is displayed for:"+ acc);
		System.out.println("Saving account class is executed");
		return acc;
	}
public static void main (String [] args)
{
	SavingAccount person1 = new SavingAccount();
	person1.deposit();
	person1.withdrawl();
	person1.viewAcc(124578);
	
	
}
}
