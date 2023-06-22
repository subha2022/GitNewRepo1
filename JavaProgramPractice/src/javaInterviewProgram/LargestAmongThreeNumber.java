package javaInterviewProgram;

public class LargestAmongThreeNumber {

	public static void main(String[] args) 
	{
		int a= 100;
		int b= 500;
		int c= 400;
		
		if(a>b && a>c)
		{
			System.out.println("The Largest Number is a:"+a);
		}else if(b>c)
		{
			System.out.println("The Largest Number is b: "+b);
		}else
		{
			System.out.println("The Largest Number is c: "+c);
		}
	}

}
