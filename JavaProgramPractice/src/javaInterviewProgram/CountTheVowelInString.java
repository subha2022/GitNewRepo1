package javaInterviewProgram;

public class CountTheVowelInString {

	public static void main(String[] args) 
	{
		int count=0;
		String name= "Subhasmita";
		
		name=name.toLowerCase();
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
				count++;
			}
			
		}
		
		System.out.println("Number of the vowel in the string is:"+count);

	}

}
