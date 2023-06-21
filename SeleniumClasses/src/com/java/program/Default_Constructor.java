package com.java.program;

public class Default_Constructor 
{
	//Instance Variable
	String empName;
	int empID;
	Default_Constructor()//This is Default Constructor
	{
		System.out.println("Constructor is executed first");
	}
	public static void main(String[] args) 
	{
		Default_Constructor obj = new Default_Constructor();
		System.out.println(obj.empName);
		System.out.println(obj.empID);

	}

}
