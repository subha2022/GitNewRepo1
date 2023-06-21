package com.java.program;

class Animal
{
	public void getName(String name)
	{
		System.out.println("Name of the animal:"+name);
	}

}
class Dog extends Animal
{
	public void getBreedName(String breedName)
	{
		System.out.println("The Breed Name of the Dog is:"+breedName);
	}
}

public class Single_Inheritance
{

	public static void main(String[] args)
	{
		Animal obj = new Animal();
		obj.getName("Dog");

		Dog obj1 = new Dog();
		obj1.getName("Dog");
		obj1.getBreedName("Puppy");

	}

}
