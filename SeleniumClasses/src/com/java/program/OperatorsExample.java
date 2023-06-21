package com.java.program;

public class OperatorsExample 
{

	public static void main(String[] args) 
	{
		//1. Assignment Operators
		int num1=100;
		int num2=200;
		int num3=300;
		
		//2. Arithmetic Operators
		//Addition +
		System.out.println("The addition value is :"+(num1+num2));
		//Subtraction -
		System.out.println("The Subtraction value is :"+(num2-num1));
		//Multiplication *
		System.out.println("The Multiplication value is :"+(num1*num2));
		//Division 
		System.out.println("The Division value is :"+(num2/num1));
		//Remainder 
		System.out.println("The Remainder value is:"+num3%num1);
		
		//3.Equality and Relational operators
		
		int num4=400;
		int num5=500;
		int num6=400;
		
		System.out.println(num4==num5);
		System.out.println(num5>=num4);
		System.out.println(num6<=num4);
		System.out.println(num4!=num5);
		System.out.println("*************************************");
		
		//4. Conditional Operators
		// And - && = if all the condition is true then the output is true
		System.out.println(num4==num6 && num4<=num6 && num5>=num6);
		System.out.println(num4==num6 && num4>num5);
		System.out.println("******************************************");
		
		/* OR - ||= if all the condition is false the out put is false . 
		 * if any one condition is true the output is true.
		 */
		System.out.println(num4==num6 || num4<=num6);
		System.out.println(num4==num6 || num4>num5);
		System.out.println(num4>num6 || num4>num5);
		
		// 5. unary operator
		int i=10;
		int j=++i; //++i=i=i+1 //pre increment
		System.out.println("Value of i:"+i);
		System.out.println("Value of j:"+j);
		
		int a=11;
		int b=a++; // a++ means first assign the value then increment
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		
		
		
		

	}

}
