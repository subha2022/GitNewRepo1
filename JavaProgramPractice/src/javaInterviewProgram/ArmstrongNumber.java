package javaInterviewProgram;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int n=153;
		int temp =n;
		int r,sum=0;
		
		while(n>0)
		{
			r=n%10; //153%10=3 ,15%10=5;1%10=1
			n=n/10; //153/10=15 ,15/10=1,1/10=1
			sum=sum+r*r*r; //0+27=27,27+125=152,152+1=153
		}
		if(temp==sum)
			System.out.println("Its a Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}

}
