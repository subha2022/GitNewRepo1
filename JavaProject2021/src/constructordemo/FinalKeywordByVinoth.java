package constructordemo;

public class FinalKeywordByVinoth 
{
// Instance Variable
	 final String customerName ="Subha";
	final int SSN =124564;
	public void display()
	{
		 //customerName ="Smita";
		// SSN =445664;
		System.out.println("The customer name is:"+customerName);
		System.out.println("The SSN is:"+SSN);
	}
	public static void main(String[] args) 
	{
		FinalKeywordByVinoth obj = new FinalKeywordByVinoth();
				obj.display();

	}

}
