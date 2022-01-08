package icici.loans.eduloans;

import icici.loans.carloans.A;

public class C extends A
{
	public void m3()
	{
		System.out.println("I am m3 in C");
	}

	/*public void m1()
	{
		System.out.println("I am overrdien m1 in C");
	}*/
	public static void main(String[] args) 
	{
		A obj1 = new A();
		obj1.m1();
		
		C obj = new C();
		obj.m3();
		obj.m1();
		//A obj2=new C();
	//	obj2.m1();
		
	}

}
