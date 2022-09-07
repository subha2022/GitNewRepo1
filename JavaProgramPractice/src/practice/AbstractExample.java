package practice;

 abstract class Parent
{
	int Rollno= 12;
	String Name ="Subha";
	String CollegeName = "SCS";
	
	public void Student()
	{
		System.out.println("Details about Student");
		System.out.println("Name of the College: " + CollegeName);
		System.out.println("Name of the Student: " + Name );
		System.out.println("Roll No:"+ Rollno);
	}
	public abstract void student1();
	
	
}

public class AbstractExample extends Parent 
{
	int Rollno= 13;
	String Name ="Smita";
	String CollegeName = "SCS";
	
	public static void main(String[] args) 
	{
		 AbstractExample obj = new AbstractExample();
		 obj.Student();
		 obj.student1();

	}

	@Override
	public void student1() {
		System.out.println(" I am the Existing Student of Parent Class");
		System.out.println("Name of the College: " + CollegeName);
		System.out.println("Name of the Student: " + Name );
		System.out.println("Roll No:"+ Rollno);
	}

}
