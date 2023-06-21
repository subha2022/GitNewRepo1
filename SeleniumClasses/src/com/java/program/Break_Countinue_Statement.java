package com.java.program;

public class Break_Countinue_Statement {

	public static void main(String[] args)
{

		//Break Statement means jump out of the loop
		for(int num=1;num<=10;num++)
		{
			if(num==5) {
				break;
			}
			System.out.println(num);
			
		}
		System.out.println("*************************");
		//Continue Statement means it will skip  the code below the continue statement
				for(int num=1;num<=10;num++)
				{
					if(num==5) {
						continue;
					}
					System.out.println(num);
				}

	}

}
