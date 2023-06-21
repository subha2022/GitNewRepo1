package com.java.program;

import java.util.Arrays;

public class Array_Implementations {

	public static void main(String[] args) 
	{
		// Create an Array
		//Syn: dataType arrName
		int arrNum[];
		//Define Arrays-Allocate Memory
		//Syn: arrName = new dataType[Size]
		arrNum=new int[4];
		//Assign the value
		arrNum[0]=100;
		arrNum[1]=200;
		arrNum[2]=300;
		arrNum[3]=400;

		//Display (accessing)
		System.out.println(arrNum[2]);

		System.out.println("**********************Numbers**************************************");	
		
		//Alternative way
		int arrNum2[]= {10,20,30,40,50};
		System.out.println(arrNum2[3]);
		//Print all the array data
		for(int iArr:arrNum2)
		{
			System.out.println(iArr);
		}
		//Print as list using toString method
		String arrNumList=Arrays.toString(arrNum2);
		System.out.println(arrNumList);
		
		System.out.println("**********************Strings**************************************");	
		String arrNum3[]= {"Subha","Pabitra","Smita","Pabi"};
		//update the value during run time
		arrNum3[3]="Pabu";
		System.out.println(arrNum3[1]);
		
		//Print all the array data
		for(String iArr:arrNum3)
		{
			System.out.println(iArr);
		}
		//Print as list using toString Method
		String arrNumList1=Arrays.toString(arrNum3);
		System.out.println(arrNumList1);
		
		System.out.println("**********************Methods**************************************");	
		
		//Present or not
	 boolean word = Arrays.asList(arrNum3).contains("Pabi");
	 System.out.println(word);
	 
	 //split() method
	 String msg = "Welcome to NxtGen AI Academy. AI is called Artificical Intellience";
	 String arrWords[] = msg.split("AI");
	 for(String Iarr:arrWords)
	 {
		 System.out.println(Iarr);
	 }
	 
		}

}
