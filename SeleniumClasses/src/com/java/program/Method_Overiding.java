package com.java.program;

class Bird
{
public void sing()
{
	System.out.println("Tweet Tweet Tweet...");
	System.out.println("Bird Class is Executed");
}
}
class Crow extends Bird
{
	public void sing()
	{
		System.out.println("Cheep Cheep Cheep...");
		System.out.println("Crow Class is Executed");
	}
}
class Pigeon extends Crow
{
	public void sing()
	{
		System.out.println("Ching Ching Ching...");
		System.out.println("Pigeon Class is Executed");
	}
}

public class Method_Overiding {

	public static void main(String[] args) 
	{
		Bird obj = new Bird();
		obj.sing();
		
		Crow obj1 = new Crow();
		obj1.sing();
		
		Pigeon obj2 = new Pigeon();
		obj2.sing();
		

	}

}
