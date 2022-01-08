package javapractice;

public class JavaPractice {
	int x = 100,y = 200,Result;
	public void add()
	{
		Result=x+y;
		System.out.println(Result);
	}
	public void sub() 
	{
		Result=x-y;
		System.out.println(Result);
	}
	public void mul() 
	{
		Result=x*y;
		System.out.println(Result);
	}
	public void div() 
	{
		Result=x/y;
		System.out.println(Result);
	}
	 
	 
	public static void main(String[] args) {
	JavaPractice obj = new JavaPractice();
	obj.add();
	obj.sub();
	obj.mul();
	obj.div();
	}

}
