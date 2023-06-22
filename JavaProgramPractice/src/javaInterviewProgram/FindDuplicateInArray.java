package javaInterviewProgram;

public class FindDuplicateInArray {

	public static void main(String[] args) 
	{
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
		}*/
		
		String str[] = {"Java","C","C++","Java"};
		for(int i=0;i<str.length-1;i++)// java ,c c,c++ c++,java
		{
			for(int j=i+1;j<str.length;j++) //c,c++ ,c++,java  java
			{
				if(str[i]==str[j])
				{
					System.out.println("The Duplicate String is:" +str[j]);
				}
			}
		}
		

	}
}
