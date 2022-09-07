package practice;

public class HelloWorld 
{
int a= 20, b=10, result;

public void add()
{
	result= a+b;
	System.out.println("The Addition result is :" + result);
	
}
public void sub()
{
	result= a-b;
	System.out.println("The Subtraction result is :" + result);
	
}
public void mul()
{
	result= a*b;
	System.out.println("The Multiplication result is :" + result);
	
}
public void div()
{
	result= a/b;
	System.out.println("The Division result is :" + result);
	
}
	public static void main(String[] args)
	{
		HelloWorld obj = new HelloWorld();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
 
	}

}
