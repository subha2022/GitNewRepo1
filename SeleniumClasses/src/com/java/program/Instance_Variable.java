package com.java.program;

public class Instance_Variable 
{
	int empNo=14;
	int empID=45678;
	String name="Subhasmita";
	
	public static void main(String[] args)
	{
		Instance_Variable obj= new Instance_Variable ();
		System.out.println("Employee No is:"+obj.empNo);
		System.out.println("Employee Id is:"+obj.empID);
		System.out.println("Employee Name is:"+obj.name);
		
		
	
	}

}
