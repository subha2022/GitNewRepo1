package icici.loans.carloans;

import java.util.Scanner;

public class JavaUserInputByVinoth {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name:");
		String name = sc.nextLine(); // get the input
		System.out.println("The name of the person is :"+name);

		// get the input value
		System.out.println("Enter the age of the person:");
	int age = sc.nextInt();
	System.out.println("The age of the person is:"+age);
		
	// get the float value
			System.out.println("Enter the salary of the person:");
		float salary = sc.nextFloat();
		System.out.println("The salary of the person is:"+salary);
		
	// get the character value
		System.out.println("Enter a charcter:");
		char ch  = sc.next().charAt(0);
		System.out.println(ch);
		
		
	}

}
