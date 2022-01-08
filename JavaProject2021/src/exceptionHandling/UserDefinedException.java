package exceptionHandling;

import java.util.Scanner;

public class UserDefinedException extends Exception
{

	public UserDefinedException(String string) //one parameter constructor
	{
		super(string);
	}

	public static void main(String[] args)
	{
		String str;
		Scanner sc = new Scanner(System.in);
		
		
		while (true) 
		{
			System.out.println("Enter the 10-digits String:  ");
			str = sc.nextLine();
			try 
			{
				if (str.length() != 10)
				{
					throw new UserDefinedException("string should be a 10 character String");
				}
				else
				{
					System.out.println(str);
					break;
				}
			} 
			catch (UserDefinedException e) 
			{

				e.printStackTrace();
			} 
			finally
			{
				System.out.println("I am final Block...........");
			}
		}
		
		
	}

}
