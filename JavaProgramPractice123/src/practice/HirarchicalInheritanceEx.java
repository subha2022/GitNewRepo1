package practice;

class A1
{
	public void show()
	{
		System.out.println(" I am supper class A");
	}
}

class B1 extends A1
{
	public void show1()
	{
		System.out.println("B is the sub class of A");
	}
}

class C1 extends A1
{
	public void show2()
	{
		System.out.println("C is the sub class of A");
	}
	
}
public class HirarchicalInheritanceEx 
{

	public static void main(String[] args)
	{
		A1 obj = new A1();
		obj.show();
		
		B1 obj1 = new B1();
		obj1.show();
		obj1.show1();
		
		C1 obj2 = new C1();
		obj2.show();
		obj2.show2();
	}

}
