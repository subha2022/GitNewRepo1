package javaInterviewProgram;

public class SubString_examples {

	public static void main(String[] args)
	{
		String name="Subha Smita";
		int space = name.indexOf(" ");
		String first= name.substring(0 , space);
		System.out.println(first);
		String last = name.substring(space+1);
		System.out.println(last);
		name =last+" "+first;
		System.out.println(name);
		
		//Q-Find strings in java
		
		String s= "the quick brown fox jumped over the lazy dog";
		int position = s.indexOf("the",1);
		System.out.println("Found s at:"+position);
		
		String s1="Hello";
		s1=s1+"World";
		System.out.println(s1);
		s1=s1+";"+"World";
		System.out.println(s1);
		s1="Hello"+ " ,"+"World"+";";
		System.out.println(s1);
		
		
		
	}

}
