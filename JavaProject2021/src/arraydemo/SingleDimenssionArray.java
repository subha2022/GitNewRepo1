package arraydemo;

import java.util.Scanner;

public class SingleDimenssionArray {

	public static void main(String[] args)
	{
		/*int[] a= {10,20,30,40};
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);//10,20,30,40
			System.out.println("a["+i+"]="+a[i]);
		}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size: ");
		int asize =sc.nextInt();
		int[]a=new int[asize];
		int sum=0;
		/*a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;*/
		System.out.println("enter th array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum=sum+a[i];
		}
		System.out.println("sum of array is : "+ sum);
	}

}
