package arraydemo;

import java.util.Arrays;

public class ArrayExampleByVinoth {

	public static void main(String[] args) 
	{
		//1. Create an array
		//syn: datatype arrnum [];
		int arrnum[];
		
		//2.  allocate memory location
		//syn: arrnum = new datatype[size];
		arrnum = new int[4];
		
		//. assign the value
		arrnum[0]=10;
		arrnum[1]=20;
		arrnum[2]=30;
		arrnum[3]=40;
		
		
		System.out.println(arrnum[2]);
		
		// alternative way of aasign value
		
		 int arrnum1[]= {10,20,30,40};
		 // print all the array value
		 
		 for(int iArr : arrnum)
		 {
			 System.out.println(iArr);
		 }
		 
		 System.out.println("**************************************");
		 
		 String arrName[] = {"Subha","Smita","Sili","Pabi"};
		 // if u want to update the value 
		 arrName [3]="Mohan";
		 System.out.println(arrName[2]);
		 //System.out.println(arrName[4]);
		 
		 for(String iArr :arrName)
		 {
			 System.out.println(iArr);
		 }
		 
		 System.out.println("******************************************");
		 // value is present or not
		 System.out.println(Arrays.asList(arrName));
		 boolean word = Arrays.asList(arrName).contains("pabi");
		 System.out.println(word);
		 
		 
		 // split method
		 
		 String creditCardNum = "1234-4567-7894-4587";
		 String arrCC[] = creditCardNum.split("-");
		 for(String iArr:arrCC)
		 {
			 System.out.println(iArr);
		 }
		 System.out.println("************************************");
		 
		 String msg ="welcome to Selenium class. Selenium is easier to learn. I love Selenium. Thank you";
		 String arrWords[] =msg.split("Selenium");
		 for(String iArr : arrWords)
		 {
			 System.out.println(iArr);
		 }
		 System.out.println("The occurance of Selenium :"+(arrWords.length-1));
		
		
	}

}
