package practice;


public class ThisKeywordDemo 
{
int a =2;

public ThisKeywordDemo()
{
	System.out.println("I am a default constructor");
}

public ThisKeywordDemo(int a)
{
	this();
	System.out.println(" I am a one parameter constructor");
}
public void getData()
{
	int a =3;
	// how to add this two variable
	int b=a+this.a;
	System.out.println(b);
	System.out.println(a);
	System.out.println(this.a); // getting the current instance variable in class level
			
}
	
	public static void main(String[] args)
	{
		ThisKeywordDemo obj = new ThisKeywordDemo(10);
		obj.getData();
	}




}


