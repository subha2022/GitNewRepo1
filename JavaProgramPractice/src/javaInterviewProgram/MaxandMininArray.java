package javaInterviewProgram;

public class MaxandMininArray {

	public static void main(String[] args)
	{
		int arr[] = {10,56,48,52,75};
		/*
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Element in array is:"+max);*/
		
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum Element in array is:"+min);
	}

}
