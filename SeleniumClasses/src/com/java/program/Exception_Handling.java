package com.java.program;

import java.util.Scanner;

public class Exception_Handling
{

	public static void main(String[] args) 
	{
		//1. Arithmetic Exception
		int a=10;
		int b=0;
		try
		{
			int result = a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Do not devide any no by zero");
			System.out.println("The Error Message is:"+e);
		}
		
		//2. Array Index Out of Boundary
		int arr[] = new int[5];
		try {
			 arr[5]=100;
			 System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter the no with in the array size");
			System.out.println("The error message is:"+e);
		}
		
		//3. Number Format Exception
		Scanner sc = new Scanner(System.in);
		System.out.println("Read the two number");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		try {
			int c = Integer.parseInt(s1);
			int d = Integer.parseInt(s2);
			System.out.println("The Addition of two no is:"+(c+d));
		}catch(NumberFormatException e)
		{
			System.out.println("Enter the valid number");
			System.out.println("The Error message is:"+e);
		}
		
		//4.Null pointer Exception
		String name = "null";
		try {
			if(name.equals("Java"))
			{
				System.out.println("Both Strings are Same");
			}
		}catch(NullPointerException e)
		{
			System.out.println("The Error Message is:"+e);
		}

		System.out.println("This line is executed");
	}

}
