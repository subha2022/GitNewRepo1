package practice1;

import practice.B;

public class C extends B
{
public void m3()
{
	System.out.println("I am m3 method in class C");
}
	public static void main(String[] args) 
	{
		 C obj3 = new C();
		 obj3.m3();
		 obj3.m1();
		 obj3.m2();
		
	}

}
