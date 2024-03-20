package javaInterviewProgram;

import java.util.HashSet;

public class FindDuplicateInArray {

	public static void main(String[] args) 
	{
		int a[] = {100,200,452,100,400,500,100,452};
		int num=100;
		int count=0;
		
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
		}
		System.out.println(count);
				
		/*int a[] = {1,2,4,5,1,5};
		for(int i=0;i<a.length-1;i++)//1,1<6-1,2
		{
			for(int j=i+1;j<a.length;j++)//2,2<6,4
			{
		if(a[i]==a[j])
		{
			System.out.println("The duplicate element is:" +a[j]);
		}
	
	}
		}
		*/
		/*String str[] = {"Java","C","C++","Java"};
		for(int i=0;i<str.length-1;i++)// java ,c c,c++ c++,java
		{
			for(int j=i+1;j<str.length;j++) //c,c++ ,c++,java  java
			{
				if(str[i]==str[j])
				{
					System.out.println("The Duplicate String is:" +str[j]);
				}
			}
		}*/
		
		//approach=2
		
		/*String str[] = {"Java","C","C++","Java"};
		
		HashSet<String>langs = new HashSet();
		
		boolean flag = false;
		
		for(String l:str)
		{
			if(langs.add(l)==false);
			{
				System.out.println("Found duplicate element:"+ l);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Not found duplicates");
		}*/
		
		

	}
}
