package javaDecissionAndLoopdemo;

public class Ifstatement {

	public static void main(String[] args) 
	{
		int age =22;
		if(age>=18) // if the condition is true if statement is executed
		{
			System.out.println("This is the major age:"+age);
		}
		else 	// if the condition is false else statement is executed
		{
			System.out.println("Ths is the minorage:"+age);
		}
		
		
		System.out.println("******************else if else***********************");
		
		int mark = 91;
		if(mark==35)
		{
			System.out.println("It is a pass mark:"+mark);
		}
		else if(mark>35 && mark<90)
		{
			System.out.println("It is a good mark:"+mark);
		}else if(mark>=90)
		{
			System.out.println("It is a very good mark:"+mark);
		}else
		{
			System.out.println("It is a fail mark:"+mark);
		}
		
		
		
		
		
		
		
		
		
	}

}
