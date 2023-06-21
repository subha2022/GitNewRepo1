package com.java.program;

public class Parameterized_Constructor 
{
	int empNo;
	String empName;
	float empSalary;
	
	Parameterized_Constructor(int no)//One parameterized Constructor
	{
		empNo=no;
	}
	Parameterized_Constructor(int no,String name)//Two parameterized Constructor
	{
		empNo=no;
		empName=name;
	}
	Parameterized_Constructor(int no,String name, float salary)//Three parameterized Constructor
	{
		empNo=no;
		empName=name;
		empSalary=salary;
	}
	
	public static void main(String[] args) 
	{
		Parameterized_Constructor obj = new Parameterized_Constructor(123,"Smita",1245.5f);
		System.out.println("The Employee Number is:"+obj.empNo);
		System.out.println("The Employee Name is:"+obj.empName);
		System.out.println("The Employee Salary is:"+obj.empSalary);
	}

}
