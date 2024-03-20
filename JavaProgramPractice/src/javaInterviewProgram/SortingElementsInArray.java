package javaInterviewProgram;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args)
	{
		//int a[]= {200,500,600,400,100};
		String s[]= {"Sili","Lali","Badal"};
		System.out.println("Before Sorting..");
		
		System.out.println(Arrays.toString(s));//To print all array values
		Arrays.sort(s);
		System.out.println("After Sorting..");
		System.out.println(Arrays.toString(s));

	}

}
