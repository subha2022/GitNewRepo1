package constructordemo;

public class SavingAccountByVinoth extends AccountByVinoth 
{
	String name = "SavingAccount class- Child";
	public void display()
	{
		System.out.println("Saving Account class(child) is executed");
		System.out.println("The variable value is:"+name);
		// Implementation of the super keyword for variable
		System.out.println("The variable value is:"+super.name);
	}
	
	// Implementation of the super keyword for method
	public void show()
	{
		display();
		super.display();
	}
	public static void main(String[] args) 
	{
		SavingAccountByVinoth obj = new SavingAccountByVinoth();
		obj.show();

	}

}
