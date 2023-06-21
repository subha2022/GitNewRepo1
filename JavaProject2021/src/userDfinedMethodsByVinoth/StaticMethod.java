package userDfinedMethodsByVinoth;

public class StaticMethod 
{

	// Method which returns value
	// syn: accessModfier  static returnType methodName (dataType variableName)

	public static int addition (int num1,int num2)
	{
		int result = num1+num2;
		return result;
	}
	public static int subtraction(int num1,int num2)
	{
		int result = num1-num2;
		return result;
	}
	public static int multiplication(int num1, int num2)
	{
		int result =num1*num2;
		return result;
	}

	// Methods which not returns any value

	public static void display(int value)
	{
		System.out.println("The value is:"+value);
	}

	public static void main(String[] args) 
	{
		int add = addition(10, 20);
	display(add);
	
	int sub = subtraction(56, 25);
	display(sub);
	int  mul = multiplication(25, 25);
	display(mul);
	
	
	
	}

}
