package javaInterviewProgram;

import java.util.Date;
import java.util.Scanner;

public class PracticeJavaProgram {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	 System.out.println("enter a no: ");
	 int num =sc.nextInt();
	 
	int ornum=num;
	int rev=0;
	while(num!=0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}
	System.out.println(rev);
	
	 }
	 
	
	}

