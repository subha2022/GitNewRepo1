package javaInterviewProgram;

public class VowelAndConsonant {

	public static void main(String[] args) 
	{
		// a,e.,i,o,u
		
		char ch ='*';
		
		/*if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("This is vowel: "+ch);
		}else
		{
			System.out.println("This is consonant: "+ch);
		}*/
		

		if((ch>='a'&& ch<='z')|| (ch>='A'&&ch<='Z'))
		{
			System.out.println("This is an Alphabet");
		}else
		{
			System.out.println("This is not an Alphabet");
		}
		}

}
