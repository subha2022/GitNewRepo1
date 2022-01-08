package abstractclassdemo;

import java.util.Date;

public abstract class FirstAbstract
{
	int x=100;
	public void m1()// this is concrete behaviour
	{
		System.out.println("I am m1 concrete from FirstAbstract");
	}
	public abstract void m2(); // this is abstract behaviour
	
	static
	{
	System.out.println("I am static block....");//this is the first priority
		
	}
	static
	{
	Date dt= new Date();
	System.out.println(dt);
			
	}
	
	public static void main(String[] args)
	{
		FirstAbstract obj=new ChildClass();
		obj.m1();
		obj.m2();
	}
}


