package practice;

class SupaerChildDemo extends SuperKeywordemo
{
	String name="Pabitra";
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name); // for variable
	}
	
	public SupaerChildDemo()
	{
		super(); // it should be always be at 1st line 
		System.out.println("I am a child class constructor");
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am a child class method");//for method
	}
	
	public static void main(String[] args)
	{
		SupaerChildDemo obj = new SupaerChildDemo();
		obj.getStringData();
		obj.getData();
	}
}

public class SuperKeywordemo 
{
	String name = "Subha";
	
	public SuperKeywordemo()
	{
		System.out.println("I am a parent class constructor");
	}
	
	public void getData()
	{
		System.out.println("I am a parent class method");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
