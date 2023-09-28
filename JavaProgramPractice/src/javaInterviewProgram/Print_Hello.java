package javaInterviewProgram;

import java.util.ArrayList;

public class Print_Hello {

	public static void main(String[] args) {
	/*	ArrayList <String> list = new ArrayList<String>();
		
		//Adding elements to array list
		list.add("H");
		list.add("e");
		list.add("l");
		list.add("l");
		list.add("o");
		
		//System.out.println(list.size()); //returns no. of elementsin array list
		
		for(String s:list) //Reading elements from array list
		{
			System.out.print(s);
		}
		System.out.println();*/
		
		String st ="LKJGFHLEUHILO";
		char ch1 = st.charAt(5);
		char ch2 = st.charAt(7);
		char ch3 = st.charAt(0);
		char ch4 = st.charAt(11);
		char ch5 = st.charAt(12);
		System.out.println("The extracted word is:"+ch1+ch2+ch3+ch4+ch5);
		
		//Another program
		System.out.println("Hi\nHello\nBye");
		
		String arr[] = {"Hi","Hello","Bye"};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
