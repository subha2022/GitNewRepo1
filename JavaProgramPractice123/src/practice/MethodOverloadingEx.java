package practice;

public class MethodOverloadingEx 
{
	public void m1(int x)
	{
		System.out.println(x);
	}
	public void m1(float x)
	{
		System.out.println(x);
	}
	public void m1(Integer y)
	{
		System.out.println(y);
	}
	public void m1(String x)
	{
		System.out.println(x);
	}
	public void m1(Number x)
	{
		System.out.println(x);
	}
	public void m1(Object x)
	{
		System.out.println(x);
	}

	public static void main(String[] args) 
	{
		
		MethodOverloadingEx obj = new MethodOverloadingEx();
		obj.m1(100);
		/*obj.m1(12.00f);
		obj.m1(65);
		obj.m1("subha");
		obj.m1(12.23);
		obj.m1(obj);*/
	}

}
