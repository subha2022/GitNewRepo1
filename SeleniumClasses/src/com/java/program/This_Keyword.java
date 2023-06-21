package com.java.program;

public class This_Keyword 
{
	String empName="Subha";
	int empId=1245;
	
	/*public This_Keyword(String empName, int empId)
	{
		empName=empName;
		empId=empId;
	}*/

	public This_Keyword(String empName, int empId)
	{
		this.empName=empName;
		this.empId=empId;
		
	}
	public void display()
	{
		System.out.println(empName+","+empId);
	}
	public static void main(String[] args)
	{
		This_Keyword obj = new This_Keyword("Pabitra",1456);
		obj.display();
			

	}

}
