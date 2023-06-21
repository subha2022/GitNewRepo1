package com.java.program;

public class Final_Keyword 
{
	final String empName="Subhasmita";
	final int empId=1245;
	public void display()
	{
		//empName="Smita";
		//empId=145;
		System.out.println("The Employee Name is:"+empName);
		System.out.println("The Employee Id is:"+empId);
		
	}

	public static void main(String[] args) 
	{
		Final_Keyword obj = new Final_Keyword();
		obj.display();

	}

}
