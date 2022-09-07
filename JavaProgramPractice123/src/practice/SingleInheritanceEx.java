package practice;

class Students
{
	int rollno, mark;
	String name;
	
	public void input()
	{
		System.out.println(" enter rolno, mark and name");
	}
}
class Subha extends Students
{
	public static void main(String[] args)
	{
		System.out.println("i am another class");
	}
}

public class SingleInheritanceEx extends Subha
{
	public void input()
	{
		System.out.println("Enter rolno, mark and name");
	}
	public void display()
	{
		rollno = 10;mark=78; name="subha";
		System.out.println("Display the details : "+ rollno +" " + mark+" " + name );
	}

	public static void main(String[] args) 
	{
		Students obj1= new Students();
		obj1.input();
		
		SingleInheritanceEx obj =new SingleInheritanceEx();
		obj.input();
		obj.display();
		
		
		
	}

}
