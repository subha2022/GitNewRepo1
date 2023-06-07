package javaInterviewProgram;

public class String_Number_Retrive {

	public static void main(String[] args) 
	{
		String str = "sgahkd12dh456";
		String digit = str.replaceAll("[^0-9]", "");
		System.out.println(digit);
		

	}

}
