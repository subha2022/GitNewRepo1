package constructordemo;

public class EmployeeConstructor 
{
	int eno;
	String ename;
	float salary;
	
	/*public EmployeeConstructor()
	{
		System.out.println("i am default constructor");
	}*/
	
	public EmployeeConstructor(int eno)
	{
		//this();
		//super();// it is a constructor call will be placed in a constructor that will be first line
		this.eno = eno;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.salary);
	}

	public EmployeeConstructor(int eno, String ename) 
	{
		this(eno);
		this.eno=eno;
		this.ename=ename;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.salary);
	}
	
		
	public EmployeeConstructor(int eno, String ename, float salary) {
		this(eno,ename);
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.salary);
	}

	public static void main(String[] args) 
	{
		
		//EmployeeConstructor e1 = new EmployeeConstructor();
		/*e1.eno=1744;
		e1.ename="subha";*/ // to over come this problem we use the constructor
		
		//System.out.println(e1.eno);
		//System.out.println(e1.ename);
		
		/*EmployeeConstructor e2= new EmployeeConstructor(1744,"subha");
		System.out.println(e2.eno);
		System.out.println(e2.ename);*/
		
		EmployeeConstructor e3= new EmployeeConstructor(100,"pabitra",120.40f);
		System.out.println(e3.eno);
		System.out.println(e3.ename);
		System.out.println(e3.salary);
	}

}
