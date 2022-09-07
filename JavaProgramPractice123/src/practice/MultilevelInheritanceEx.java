package practice;

class Animal
{
	public void display()
	{
		System.out.println("Its a Cat.....");
	}
}

class Cat extends Animal
{
	public void display()
	{
		System.out.println("The Cat is Carying......");
	}
	public void display1()
	{
		System.out.println("The Cat is Laghing........");
	}
	
}
class BabyCat extends Cat
{
	public void display()
	{
		System.out.println("The Cat is Carying......");
	}
	public void display1()
	{
		System.out.println("The Cat is Laghing........");
	}
	public void display2() 
	{
		System.out.println("The cat is Mewoooooo.............");
	}
}
public class MultilevelInheritanceEx
{

	public static void main(String[] args) 
	{
		Animal obj = new Animal();
		obj.display();
		
		Cat obj1 = new Cat();
		obj1.display();
		obj1.display1();
		
		BabyCat obj2 = new BabyCat();
		obj2.display();
		obj2.display1();
		obj2.display2();

	}

}
