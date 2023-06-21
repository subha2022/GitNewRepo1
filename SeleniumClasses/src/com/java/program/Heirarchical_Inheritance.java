package com.java.program;

	class A
	{
		public void show()
		{
			System.out.println("I am Supper Class");
		}
	}
	class B extends A
	{
	public void show1()
	{
		System.out.println("B is the sub class of A ");
	}
	}
	class C extends A
	{
		public void show2()
		{
			System.out.println("C is the sub class of A");
		}
	}
	public class Heirarchical_Inheritance 
	{

	public static void main(String[] args) 
	{
		A obj = new A();
		obj.show();
		
		B obj1 = new B();
		obj1.show();
		obj1.show1();
		
		C obj2 = new C();
		obj2.show();
		obj2.show2();

	}

}
