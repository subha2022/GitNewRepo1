package javaInterviewProgram;

public class Search_Element_In_Array {

	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50};
		int search_element = 70;
		boolean status=false; 
		
		/*for(int i =0;i<a.length;i++)
		{
			if(a[i]==search_element) 
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}*/
		for(int x :a)
		{
			if(x==search_element) 
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		if(status==false) 
		{
			System.out.println("Element not found");
		}
		
	}

}
