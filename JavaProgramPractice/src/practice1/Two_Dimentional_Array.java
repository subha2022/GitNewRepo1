package practice1;

public class Two_Dimentional_Array {

	public static void main(String[] args) {
		
		int a[][] = {{100,200},{300,400},{500,600}};
		
		System.out.println(a.length);// Row Length
		System.out.println(a[0].length); //Column length in a row
		
		//Print single value 
		System.out.println(a[0][1]);
		
		/*//Print all values using General for loop
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+ " ");
			}
			System.out.println();
		}
		*/
		//Print all values using for each loop
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
	}

}
