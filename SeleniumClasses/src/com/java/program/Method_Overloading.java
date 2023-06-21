package com.java.program;

public class Method_Overloading 
{
	//1. By changing no of argument
	public static int  multiply(int num1, int num2)
	{
		int result = num1*num2;
		return result;
	}
	
	public static int multiply(int num1, int num2, int num3)
	{
		int result =num1*num2*num3;
		return result;
		
	}
	//2. By changing the data type
	public static float multiply(float num1, float num2)
	{
		float result = num1*num2;
		return result;
		
	}

	public static void main(String[] args) 
	{
		
		System.out.println(multiply(45,78));
		System.out.println(multiply(45,78,47));
		System.out.println(multiply(45.4f,47.4f));

	}

}
