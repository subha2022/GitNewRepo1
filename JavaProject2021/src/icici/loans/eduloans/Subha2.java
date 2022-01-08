package icici.loans.eduloans;

import inheritancedemo.Ankit;
import inheritancedemo.Student;

public class Subha2 extends Ankit
{
	public void display()
	{
		roll=2;name="Subha";marks=96;
		System.out.println(roll+" "+name+" "+marks);
		
	}

	public static void main(String[] args) {
		Subha2 obj = new Subha2();
		obj.input();
		obj.disp();
		obj.display();
		
		Ankit obj1 = new Ankit();
		obj1.disp();
		obj1.input();
		
		
		
	}
	
	

}
