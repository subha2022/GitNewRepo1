package com.java.program;

import java.util.Scanner;

public class UserInputInRunTime {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character :");
		// character input
		char ch=sc.next().charAt(0);
		System.out.println("The character is:"+ch);
		

	}

}
