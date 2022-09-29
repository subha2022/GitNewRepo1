package exceptionHandling;

import java.util.Scanner;

public class ExceptionSampleByVinoth {

	public static void main(String[] args) 
	{
		//1. Arithmetic Exception

		int a=10;
		int b=0;

		try {
			int result = a/b;
			System.out.println("The result of the division is:"+result);
		} catch (ArithmeticException e) {
			System.out.println("Do not devide number by zero");			
			System.out.println("The error message is "+e);
		}
		
		System.out.println("******************************************8");
		//2. Array index out of boundary value exception
		int num[] = new int [5];
		try
		{
			num[8] = 100;
			System.out.println(num[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The error message is :"+e);
			System.out.println("Mention the value with in the array limit");
		}
		
		System.out.println("******************************************8");
		// 3. Number format exception
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Read two numbers");
		
		String s1 =sc.nextLine();
		String s2 =sc.nextLine();
		
		try
		{
			int c =Integer.parseInt(s1);
			int d =Integer.parseInt(s2);
			System.out.println(c+d);
		}
		catch(NumberFormatException err)
		{
			System.out.println("The error message is:"+err);
			System.out.println("Mention valid number");
		}
		
		//4. Null pointer Exception
		
		String name = null;
		try
		{
			if(name.equals("java"))
			{
				System.out.println("Strings are same");
			}
		}catch(NullPointerException err1)
		{
			System.out.println("The error message:"+err1);
		}
		
		
	}

}
