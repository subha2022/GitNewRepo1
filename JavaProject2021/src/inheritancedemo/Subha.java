package inheritancedemo;

public class Subha extends Ankit // single inheritance
{
	public void disp()// reconstruct the parent class data in child class
	{
		roll=3; name="Pabitra";marks=77;
		System.out.println(roll+ " "+ name+" "+marks);
		}
	public void disp1()
	{
		roll=2;name="Subha";marks=96;
		System.out.println(roll+" "+name+" "+marks);
		
	}

	public static void main(String[] args) {
		Subha obj = new Subha();
		obj.input();
		obj.disp();
		obj.disp1();
		
		Ankit obj1 = new Ankit();
		obj1.disp();
		obj1.input();
		
		Student obj2 = new Student();
		obj2.input();
		
		// we use parent class variable to hold child class object
		 Ankit obj3=new Subha();
		obj3.disp();
		
		// Type casting in Inheritance 
		 Subha obj4=(Subha) obj3;
		 obj4.input();
		 obj4.disp();
		 obj4.disp1();
	}
	
	

}
