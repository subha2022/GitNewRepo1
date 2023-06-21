package com.java.program;

public class SavingAcc_SuperKeyword extends Account_SuperKeyword
{
	String name = "Saving Account Class (Child)";
	public void display()
	{
		//System.out.println("The Variable name is:"+name);
		//System.out.println("Saving Account class (Child) is executed");
		//Imlementing the super keyword
		System.out.println("The Variable name value is:"+super.name);
	}
	public void show()
	{
		//display();
		super.display();
	}

	public static void main(String[] args)
	{
		SavingAcc_SuperKeyword obj =new SavingAcc_SuperKeyword();
		obj.display();
		obj.show();
	}

}
