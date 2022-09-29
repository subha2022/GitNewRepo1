package userDfinedMethodsByVinoth;

public class MethodRulesForVariable 
{
	int a = 10; // instance variable
	static 	int b=20; // static variable
	
	// static method = we can use only static variable
	public static void display()
	{
		//System.out.println(a); //it will show the compile time error
		System.out.println(b);
	}
	
	// Non static method = we can use both instance and static variable
	public void display1()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		display();
		MethodRulesForVariable obj = new MethodRulesForVariable();
		obj.display1();

	}

}
