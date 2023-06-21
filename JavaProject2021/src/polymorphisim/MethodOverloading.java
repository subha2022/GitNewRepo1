package polymorphisim;

public class MethodOverloading {
	
	public void m1(int x) 
	{
		System.out.println(x);// if int type is not found it will take next highest primitive type to execute. it will take float
	}

	public void m1(float x)//if float type is not found it will take Integer type
	{
		System.out.println(x);
	}

	public void m1(String x)//if String type is not found it will take object type
	{
		System.out.println(x);
	}
	public void m1(Number x)//if Number type is not found it will take object type
	{
		System.out.println(x);
	}
	public void m1(Integer x)//if Integer type is not found it will take Number type
	{
		System.out.println(x);
	}
	public void m1(Object x)
	{
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		MethodOverloading obj = new MethodOverloading();
		obj.m1(100);
		obj.m1(12.34f);
		obj.m1("Subha");
		obj.m1(1000);
		obj.m1(12.23);
		obj.m1(obj);
	}



}
