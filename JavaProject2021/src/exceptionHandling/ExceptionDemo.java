package exceptionHandling;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args)
	{
	//int nr=100, dr=0, result;
	int nr, dr, result;
	
	// ArithmeticException a  = new ArithmeticException("divided by zero);
	
	Scanner sc = new Scanner(System.in);
		
	while (true) //using while loop condition
	{
		System.out.println("Enter the nr value: ");
		nr = sc.nextInt(); 
		System.out.println("Enter the dr velue: ");
		dr = sc.nextInt();
		try 
		{
			result = nr / dr;
			System.out.println(result);
			break;
		}
		
		/*catch (Exception e) 
		{
			e.printStackTrace(); // parent class is not coming first 
		} */
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
		} 
		catch (NoSuchElementException e) 
		{
			e.printStackTrace();
		} 
		catch (NullPointerException e) 
		{
			e.printStackTrace();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		
	}

	}

}
