package javaDecissionAndLoopdemo;

public class NestedIfSatatement {

	public static void main(String[] args) 
	{
		int age=34;
		int weight =45;
		
		if(age>=18)
		{
			if(weight>=50) 
			{
				System.out.println("you are eligible for blood donate");
			}else
			{
				System.out.println("You are not eligible for blood donate");
			}
				
		}else
		{
			System.out.println("The age must be 18");
		}

	}

}
