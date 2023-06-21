package com.testNG.Program;

public class Encapsulation_Implementation 
{
	

	public static void main(String[] args) 
	{
		Encapsulation_Example obj = new Encapsulation_Example();
		obj.setEmpName("Subhasmita");
		obj.setEmpNo(1234);
		obj.setEmpAge(28);
		obj.setMobNum(784562124);
		
		System.out.println(obj.getEmpName());
		System.out.println(obj.getEmpNo());
		System.out.println(obj.getEmpAge());
		System.out.println(obj.getmobNum());

	}

}
