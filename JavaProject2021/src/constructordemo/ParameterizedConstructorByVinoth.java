package constructordemo;

public class ParameterizedConstructorByVinoth 
{
	// Instance Variable

		String empName;
		int empId;
		ParameterizedConstructorByVinoth(String n , int i)
		{
			empName=n;
			empId=i;
		}

	public static void main(String[] args)
	{
		ParameterizedConstructorByVinoth obj = new ParameterizedConstructorByVinoth("HelloUser", 12457);
		System.out.println(obj.empName);
		System.out.println(obj.empId);

	}

}
