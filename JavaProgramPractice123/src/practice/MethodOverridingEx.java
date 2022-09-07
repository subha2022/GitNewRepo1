package practice;

class Parent1
{
	public void oldHouse() 
	{
		System.out.println("Parent: This is our old house");
	}
	public void give() 
	{
		System.out.println("We will gives this house to our Child");
	}
}


public class MethodOverridingEx extends Parent1
{
	public void oldHouse()
	{
		System.out.println("child: I want to New House");
	}
	public void reBuild()
	{
		System.out.println("child : I modified this House");
	}
	public static void main(String[] args)
	{
		MethodOverridingEx obj = new MethodOverridingEx();
		obj.oldHouse();
		obj.reBuild();
		obj.give();
	

	}

}
