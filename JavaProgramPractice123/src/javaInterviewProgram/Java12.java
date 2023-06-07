package javaInterviewProgram;

import java.util.Scanner;

public class Java12 {

	public static void main(String[] args) 
	{
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year =sc.nextInt();*/
		String s="sag123";
		int len=s.length();
		String digit=s.replaceAll("[^0-9]", "");
		System.out.println(digit);
}
}



