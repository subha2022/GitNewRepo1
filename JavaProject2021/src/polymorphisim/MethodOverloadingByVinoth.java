package polymorphisim;

public class MethodOverloadingByVinoth 
{
	//1. By changing no of argument
	public static int  multiply(int num1, int num2)
	{
		int result = num1*num2;
		return result;
	}
	public static int  multiply(int num1, int num2, int num3)
	{
		int result = num1*num2*num3;
		return result;
	}
	//2. By changing of data type
	public static float  multiply(float num1, float num2)
	{
		float result = num1*num2;
		return result;
	}

	public static void main(String[] args)
	{
		System.out.println(multiply(40,10));
		System.out.println(multiply(40,10,10));
		System.out.println(multiply(15.23f,45.12f));

	}

}
