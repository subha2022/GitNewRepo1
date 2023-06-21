package com.java.program;

import java.util.Scanner;

public class If_Else_Iflader {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Student mark:");
		int mark=sc.nextInt();
		
		if(mark>=80)
		{
			System.out.println("This is O Grade");
		}
		else if(mark>=75 && mark<=79)
		{
			System.out.println("This is A Grade");
		}
		else if(mark>=70 && mark<=74)
		{
			System.out.println("This is B Grade");
		}
		else if(mark>=60 && mark<=69)
		{
			System.out.println("This is C Grade");
		}
		else if(mark>=50 && mark<=59)
		{
			System.out.println("This is D Grade");
		}
		else if(mark>=45 && mark<=49)
		{
			System.out.println("This is E Grade");
		}
		else if(mark>=40 && mark<=44)
		{
			System.out.println("This is P Grade");
		}else
		{
			System.out.println("This is fail mark");
		}
	}

}
