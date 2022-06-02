package javaInterviewProgram;

import java.util.Scanner;

public class PracticeJavaProgram {

	public static void main(String[] args) 
	{
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=sc.nextInt();*/
		
		String name="Subhasmita";
		String rev=" ";
		int len=name.length();
		System.out.println(len);
		for(int i=len-1;i>=0;i--)//9 8
		{
			rev=rev+name.charAt(i);// 9
		}
		System.out.println(rev);
		
		
		
		
			
		
		
		
	}
}