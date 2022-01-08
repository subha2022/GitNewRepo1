package arraydemo;

public class TwoDimenssionArray {

	public static void main(String[] args)
	{
		//int [] a = {10,20,30,40};
		//int [] a = new int[4];
		
		/*int[][]a = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				
			   };*/
		
		int[][]a = {
				{1,2,3},
				{4,5,},
				{7,8,9,10,11},
				
			   };
		
		for(int i=0;i<a.length;i++)
		{
		//	for(int j=0;j<3;j++)
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] +"  ");
			}
			System.out.println();
		}
		for(int[] p:a)// for each loop
		{
			for(int q:p)
			{
				System.out.print(q + "  ");
			}
			System.out.println();
		}
 	}

}
