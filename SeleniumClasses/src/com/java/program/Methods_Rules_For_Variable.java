package com.java.program;

public class Methods_Rules_For_Variable 
{
	int a =10;//Instance Variable
	static int b=20;//Static Variable
	public static void display()
	{
		//System.out.println(a);//compile time error bcz we can not use instance variable inside the static method
		System.out.println(b);
	}
	public void display1()
	{
		//We can use both instance and static variable inside the non static method
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		display();
		Methods_Rules_For_Variable obj = new Methods_Rules_For_Variable();
		obj.display1();

	}

}
