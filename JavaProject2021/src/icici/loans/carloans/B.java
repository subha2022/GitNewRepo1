package icici.loans.carloans;

public class B extends A
	{
	public void m2()
	{
		System.out.println("I am m2 in B");
	}

	public static void main(String[] args)
	{
		A obj1 = new A();
		obj1.m1();
		
		B obj = new B();
		obj.m2();
		obj.m1();
	}

}
