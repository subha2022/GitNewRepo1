package com.java.program;

import java.util.Scanner;

public class If_IfElse_NestedIf_Statements {

	public static void main(String[] args) 
	{
		/*Scanner sc = new Scanner (System.in);
		System.out.println("Enter the customer age:");
		int age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("This age is major age");
		}else
		{
			System.out.println("This is minor age");
		}*/
			
		System.out.println("********************Nested If*********************");
		int age1=19;
		int weight=29;
		if(age1>=18)
		{
			if(weight>=45)
			{
				System.out.println("You are elgible for blood donate");
			}else
			{
				System.out.println("You are not eligible for blood donate");
			}
		}else
		{
			System.out.println("Age must be 18");
		}
		
		
	}

}
