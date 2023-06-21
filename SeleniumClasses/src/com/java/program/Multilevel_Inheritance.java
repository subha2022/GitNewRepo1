package com.java.program;

class Animal1
{
	public void display()
	{
		System.out.println("Eating.....");
		System.out.println("Animal Class is executed");
	}
}
class Cat extends Animal1
{
	public void display()//Redefined parent class method
	{
		System.out.println("Sleeping.....");
		System.out.println("Animal Class is executed in Cat class");
	}
	public void display1()
	{
		System.out.println("Meow.....");
		System.out.println("Cat Class is executed");
	}
}
class BabyCat extends Cat
{
	public void display()//Redefined parent class method
	{
		System.out.println("Dancing.....");
		System.out.println("Animal Class is executed in Baby Cat class");
	}
	public void display1()
	{
		System.out.println("Meooooooooow.....");
		System.out.println("Cat Class is executed in Baby Cat Class");
	}
	public void display2()
	{
		System.out.println("crying................");
		System.out.println("Baby Cat class is executed");
	}
}

public class Multilevel_Inheritance
{

	public static void main(String[] args)
	{
		Animal1 obj = new Animal1();
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
