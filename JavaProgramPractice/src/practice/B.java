package practice;

public class B extends A
{
	public void m2()
	{
		System.out.println("I am m2 method in class B");
	}

	public static void main(String[] args)
	{

		B obj1 = new B();
		obj1.m2();
		obj1.m1();
	}

}
