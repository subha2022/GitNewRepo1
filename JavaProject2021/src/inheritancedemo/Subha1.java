package inheritancedemo;

  class Student1
{
	int Roll ,marks;
	String name;
	 public void input()
	{
		System.out.println("Enter Roll no, name and marks");
	}
	
	
}
   public class Subha1 extends Student1
{
	 public void disp()
	{
		Roll=1;name="Subha";marks=98;
		System.out.println(Roll+" "+name+" "+marks );
	}
	public static void main(String[] args) {
		Subha1 obj1 = new Subha1();
		obj1.disp();
		obj1.input();
		
		
		
}
}


