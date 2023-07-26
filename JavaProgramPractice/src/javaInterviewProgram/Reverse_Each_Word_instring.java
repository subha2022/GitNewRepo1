package javaInterviewProgram;

public class Reverse_Each_Word_instring 
{

	public static void main(String[] args) 
	{
		String st = "Welcome To Java";
		String words[] =st.split(" ");
		
		String reverseString="";
		for(String w:words)
		{
			String reverseWord=" ";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseWord=reverseWord+w.charAt(i);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);
		

	}

}
