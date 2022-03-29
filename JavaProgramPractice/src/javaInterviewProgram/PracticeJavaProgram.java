package javaInterviewProgram;

import java.util.Scanner;

public class PracticeJavaProgram {

	public static void main(String[] args) 
	{
		int num=4;
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				count++;
			}
			if(count==2)
			{
				System.out.println("prime no");
			}else
			{
				System.out.println("not a prime no");
			}
		}
		else
		{
			System.out.println("not a prime no");
		}
		
}
}
