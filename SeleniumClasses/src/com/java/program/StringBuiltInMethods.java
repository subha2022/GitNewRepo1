package com.java.program;

public class StringBuiltInMethods {

	public static void main(String[] args) 
	{
		String msg ="Selenium Training";
		//1 length()
		System.out.println(msg.length());
		//2 toLowerCase()
		System.out.println(msg.toLowerCase());
		//3 toUpperCase()
		System.out.println(msg.toUpperCase());
		//4 trim()
		String name = " Subha";
		System.out.println(name.trim());
		
		// Declaring
		String val1="Subha ";
		String val2="Smita ";
		String val3="Jena ";
		System.out.println(val1+val2+val3);
		
		//5 concat()
		System.out.println(val1.concat(val2).concat(val3));
		
		//String Comparison
		//Two way comparison
		//6 equals()
		String val4 = "A";
		String val5 = "a";
		System.out.println(val4==val5);
		System.out.println(val4.equals(val5));
		System.out.println(val4.equalsIgnoreCase(val5));
		
		// Three way comparison
		/*String1=String2----->0
		 * String1>String2-------->+ve value
		 * String1<String2-------->-ve value
		 */
		String val6 ="S";
		String val7 ="s";
		System.out.println(val6.compareTo(val7));
		System.out.println(val7.compareTo(val6));
		System.out.println(val6.compareToIgnoreCase(val7));
		
		// 7 charAt()
		String courseId = "Automation Course ID - 43452";
		System.out.println(courseId.charAt(4));
		// 8 indexOf()
		System.out.println(courseId.indexOf('u'));
		// 9 contains()
		System.out.println(courseId.contains("43452"));
		
		// 10 subString()
		
		String successfullMsg = "The Transaction Id: NXTGEN1937465.Thank You";
		System.out.println(successfullMsg.indexOf('N'));
		System.out.println(successfullMsg.substring(20));
		System.out.println(successfullMsg.substring(20, 33));
		
		//11 Replace()
		String updateMsg ="Welcome to ICICI bank";
		System.out.println(updateMsg.replace("ICICI", "SBI"));
		
		//12 Handling the special character
		String text ="Welcome to \"Selenium Class\"";
		System.out.println(text);
						
		//Split()
		String Cname="Subha smita Jena";
		String[]arrOfCname=Cname.split(" ", 3);
		
		for(String res:arrOfCname)
		{
			System.out.println(res);
		}
		
		
		
	}

}
