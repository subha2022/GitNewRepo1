package practice;

public class TypeCastingExample
{
	public void m1()
	{
		int a =10;
		System.out.println(a);
		double d = a;
		System.out.println(d);
	}
	public static void m2()
	{
		float x = 15.0f;
		System.out.println(x);
		byte y =(byte)x;
		System.out.println(y);
	}
	
	

	public static void main(String[] args) 
	{
		TypeCastingExample obj = new TypeCastingExample();
		obj.m1();
		 m2();
	}

}
