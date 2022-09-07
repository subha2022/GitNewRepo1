package practice;

public class ArraysDemo {

	public static void main(String[] args) 
	{
		/*	int b[]= {12,45,78,45};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i] + " ");
		}*/
	
		int a[][] = {
					{12,45,47},
					{74,47,78},
					{45,48,87} 
					};
		
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}

	}

}
