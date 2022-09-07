package practice;

public class VariableTypeExample 
{
int a = 10;
static String name = "Subha";

public void m1()
{
	int a = 20;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(name);
	
}
public static void m2()
{
	VariableTypeExample obj1 = new VariableTypeExample();
	System.out.println(obj1.a);
	System.out.println(name);
	
}

	public static void main(String[] args) 
	{
		VariableTypeExample obj = new VariableTypeExample();
		System.out.println(obj.a);
		System.out.println(name);
		obj.m1();
		m2();
		

	}

}
