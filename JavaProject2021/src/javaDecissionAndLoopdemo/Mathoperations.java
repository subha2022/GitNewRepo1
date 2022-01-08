package javaDecissionAndLoopdemo;

import java.util.Scanner;

public class Mathoperations 
{

	public static void main(String[] args)
	{
		int a,b, result;
		char choice;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter the choice:  ");
			choice = sc.next().charAt(0);
			switch(choice)
			{
			case '1' :System.out.println("Enter the value for Addition :");
			a=sc.nextInt();
			b=sc.nextInt();
			result = a+b;
			System.out.println("Addition result is : " + result);
			break;
			
			case '2' :System.out.println("Enter the value for Substraction :");
			a=sc.nextInt();
			b=sc.nextInt();
			result = a-b;
			System.out.println("Substraction result is : " + result);

				break;
			case '3' :System.out.println("Enter the value for Multiplication :");
			a=sc.nextInt();
			b=sc.nextInt();
			result = a*b;
			System.out.println("Multiplication result is : " + result);
				break;
			case '4' :System.out.println("Enter the value for Division :");
			a=sc.nextInt();
			b=sc.nextInt();
			result = a/b;
			System.out.println("Division result is : " + result);
				break;
			case '5' :System.exit(0);
				break;
				
			default :System.out.println("Wrong choice entered !!!!.please enter choice (1-5)");
				break;

			}

		}while(choice!=5);

		}
	}