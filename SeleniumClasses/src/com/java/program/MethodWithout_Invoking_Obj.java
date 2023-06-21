package com.java.program;

public class MethodWithout_Invoking_Obj 
{
	// Methods without returning the value
 
	public static void add()
	{
		int a=10,b=6,res;
		res=a+b;
		System.out.println(res);
	}
	public static void sub()
	{
		int a=10,b=6,res;
		res=a-b;
		System.out.println(res);
	}
	public static void mul()
	{
		int a=10,b=6,res;
		res=a*b;
		System.out.println(res);
	}
	

	public static void main(String[] args)
	{
		add();
		sub();
		mul();
		
	}

}
