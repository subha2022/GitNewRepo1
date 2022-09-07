package practice;

public class ConstructorEx 
{
	int eno;
	String name;
	float salary;
		
	
	public ConstructorEx() 
	{
		super();
		System.out.println(" I am default Constructor");
	}

	public ConstructorEx(int eno) 
	{
		super();
		this.eno = eno;
	}

	public ConstructorEx(int eno, String name)
	{
		super();
		this.eno = eno;
		this.name = name;
	}

	public ConstructorEx(int eno, String name, float salary)
	{
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}


	public static void main(String[] args) 
	{
		ConstructorEx obj = new ConstructorEx();
		
		ConstructorEx obj1 = new ConstructorEx(124,"subha");
		System.out.println(obj1.eno);
		System.out.println(obj1.name);
		
		

	}

}
