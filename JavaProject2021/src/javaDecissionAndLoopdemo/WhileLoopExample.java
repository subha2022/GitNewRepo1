package javaDecissionAndLoopdemo;

public class WhileLoopExample {

	public static void main(String[] args) 
	{
		System.out.println("******************while*************");
		// while
		int num=15;
		while(num<=10)
		{
			System.out.println(num);//it will not print 15 bcz the statement is false
			num++;
		}
		
		
		//do while
		System.out.println("******************do while*************");
		
		int num1=15;
		do 
		{
			System.out.println(num1);  //it will print 15 bcz 1st it is print the number then it 
										//will check the condition.
			num1++;
		}while(num1<=10);
		
		
		
		
		
		
	}

}
