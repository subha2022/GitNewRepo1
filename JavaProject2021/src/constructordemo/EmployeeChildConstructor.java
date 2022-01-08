package constructordemo;

public class EmployeeChildConstructor extends EmployeeConstructor
{
	String City;

	public EmployeeChildConstructor(String city) {
		super(100,"Subha",12.54f);
		this.City = city;
		System.out.println(this.City);
	}

	public static void main(String[] args) 
	{
		EmployeeChildConstructor obj = new EmployeeChildConstructor("puri");
		
		
	}

}
 