package com.java.program;

public class Method_Invoking_Object 
{
	//Methods which returns value
	public int addition(int a,int b)
	{
		int result=a+b;
		return result;
	}
	public int subtraction(int a , int b)
	{
		int result=a-b;
		return result;
	}
	
	//Methods without returning value
	public void display(int val)
	{
		System.out.println("The value is:"+val);
	}
	
	public static void main(String[] args) 
	{
	
		Method_Invoking_Object obj=new Method_Invoking_Object();
		int add=obj.addition(10, 21);
		System.out.println(add);
		int sub=obj.subtraction(52, 42);
		System.out.println(sub);
		
		obj.display(add);
		obj.display(sub);
		
	}

}
