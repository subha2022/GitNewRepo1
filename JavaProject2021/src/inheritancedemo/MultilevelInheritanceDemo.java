package inheritancedemo;
class Animal
{
	public void display()
	{
		System.out.println("Eating....");
	}
}

class Cat extends Animal
{
	public void display()
	{
		System.out.println("Sleeping....");// redefined of parent class method
	}
	public void display1()
	{
		System.out.println("Meow....");
	}
}
class BabyCat extends Cat
{
	public void display()
	{
		System.out.println("Danceing....");// redefined of parent class method
	}
	public void display1()
	{
		System.out.println("Meowoooooo....");
	}
	public void display2()
	{
		System.out.println("Crying....");
	}
}
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.display();
		
		Cat c=new Cat();
		 c.display();
		 c.display1();
		 
		 BabyCat bc=new BabyCat();
		 bc.display();
		bc.display1();
		bc.display2();
		

	}

}
