package com.java.program;

public class MathMethods {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int num3=10;
		float num4=101.45f;
		System.out.println(num1==num2);
		System.out.println(num1==num3);
		
		
		System.out.println("*****************************");
		//Mathematical methods
		System.out.println("Maximum of two number is:"+Math.max(num1, num2));
		System.out.println("Manimum of two number is:"+Math.min(num2, num1));
		System.out.println("Absolute value of number is:"+Math.abs(num3));
		
		
		System.out.println("Round of a number: "+Math.round(num4));
		System.out.println("Random number is generated:"+Math.random());
		
		// To generate number between 1 to 1000
		
		int randomNumber=(int) (Math.random() * 1001);
		System.out.println("Random number is generated btwn 1 to 1000:" +randomNumber);
		
		// Integer Parsing= Converting  String to Integer
		int x = Integer.parseInt("10");
		System.out.println(x);
		int y = Integer.parseInt("20");
		System.out.println(y);
		
		System.out.println(x+y);
		System.out.println("10"+"20");
	}

}
