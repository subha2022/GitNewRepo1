package polymorphisim;

public class HDFCbyVinoth extends RBIbyvinoth
{
	
	public float getHomeloan(float interest)
	 {
		 System.out.println("Homeloan interest is="+interest);
		 System.out.println("HDFC class is executed");
		return interest;
		 
	 }

	public static void main(String[] args) 
	{
		HDFCbyVinoth obj = new HDFCbyVinoth();
		obj.getHomeloan(7.80f);

	}

	
}
