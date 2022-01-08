package abstractclassdemo;

public class ChildClass extends FirstAbstract

{

	public static void main(String[] args)
	{
	ChildClass obj = new ChildClass();
	obj.m1();//this is m1 of FirstAbstract
	obj.m2();//this is m2 of ChildClass
	}
	/*public void m1() {
		System.out.println("I am m1 overriden in childclass");
	}*/
	
	@Override
	public void m2() {
		System.out.println("I am m2 overriden in childclass");
	}

}
