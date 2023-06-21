package polymorphisim;

public class Overloading {
	public void m1(int i)
	{
		System.out.println("hello..");
		
	}
	public int m1(float i)
	{
		System.out.println("hi..");
		return 10; 
		
		
		
	}

	public static void main(String[] args) {
	Overloading obj=new Overloading();
		obj.m1(120);
		obj.m1(10.2f);
	}

}
