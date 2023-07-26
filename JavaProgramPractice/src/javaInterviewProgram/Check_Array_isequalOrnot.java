package javaInterviewProgram;

public class Check_Array_isequalOrnot {

	public static void main(String[] args) {
		
		int a1[]= {10,20,30,40};
		int a2[]= {10,20,30,40};
		
		boolean status= true;
		
		if(a1.length == a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
					status=false;
				}
			}
		}else
		{
			status=false;
		}
		if(status==true)
		{
			System.out.println("Arrays are Equal");
		}else
		{
			System.out.println("Arrays are not Equal");
		}

	}

}
