package com.java.program;

public class Local_Variable 
{
	public void empDetails()
	{
		int empNo=1245;
		String empName="Subha";
		String cName="Capgemin";
		float salary=145.56f;
		System.out.println(empNo);
		System.out.println(empName);
		System.out.println(cName);
		System.out.println(salary);
	}

	public static void main(String[] args) 
	{
		
		Local_Variable obj = new Local_Variable();
		obj.empDetails();
		
		int empRegNo=12457;
		System.out.println(empRegNo);
	}

}
