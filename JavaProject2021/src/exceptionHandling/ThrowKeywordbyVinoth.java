package exceptionHandling;

public class ThrowKeywordbyVinoth
{

	public static void main(String[] args) 
	{
		int age=16;
		if(age<18)
		{
			throw new ArithmeticException("Not valid age to register");
			
		}else
		{
			System.out.println("valid Age");
		}
	}

}
