package userDfinedMethodsByVinoth;

public class InstanceMethod {

	// Method which returns value
	// syn: accessModfier returnType methodName (dataType variableName)

	public int addition (int num1,int num2)
	{
		int result = num1+num2;
		return result;
	}
	public int subtraction(int num1,int num2)
	{
		int result = num1-num2;
		return result;
	}
	public float multiplication(float num1, float num2)
	{
		float result =num1*num2;
		return result;
	}
	
	// Methods which not returns any value
	
	public  void display(int value)
	{
		System.out.println("The output value is:"+value);
	}

	public static void main(String[] args)
	{
		InstanceMethod obj = new InstanceMethod();
		int add = obj.addition(20, 60);
		//System.out.println("Adition of two numbers:"+add);
		obj.display(add);

		int sub = obj.subtraction(50, 30);
		//System.out.println(sub);
		obj.display(sub);

		float mul = obj.multiplication(25.5f, 25.45f);
		System.out.println(mul);
	}

}
