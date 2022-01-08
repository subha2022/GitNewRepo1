package inheritancedemo;

public class Ankit extends Student// Is a Relationship
{
	public void input()// redefined parent class
	{
		System.out.println("Enter Roll no  Name and Marks:  ");
		
	}
	public void disp()
	{
		roll=1; name="Ankit";marks=87;
		System.out.println(roll+ " "+ name+" "+marks);
		}
	public static void main (String[]args)
	{
		Student obj = new Student();// Has a Relationship
		obj.input();
		
		Ankit r=new Ankit();
		r.input();
		r.disp();
	
		// we can use parent class reference variable to refer / hold child class object
		Student obj1=new Ankit(); // up casting
		obj1.input();
		
		Ankit obj2=(Ankit) obj1;//type casting
		obj2.input();
		obj2.disp();
		
		/*// we can not use Child class reference variable to refer / hold parent class object
		 Ankit obj3=(Ankit) new Student();// down casting. it shows runtime error
		 obj3.input();
		 obj3.disp();*/
	
	}
}
	

