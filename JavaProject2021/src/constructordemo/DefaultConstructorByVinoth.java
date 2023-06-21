package constructordemo;

public class DefaultConstructorByVinoth 
{
	// Instance Variable

	String empName;
	int empId;
	
	DefaultConstructorByVinoth()
	{
		System.out.println("Constructor is executing first");
	}
	public static void main(String[] args) 
	{
		DefaultConstructorByVinoth obj = new DefaultConstructorByVinoth();
		System.out.println(obj.empName);
		System.out.println(obj.empId);
	}

}
