package inheritancedemo;
class A
{
	public void show()
	{
		System.out.println("I am Supper Class A");
	}
}
class B extends A
{
	public void show1()
	{
		System.out.println("B is sub class of A");
	}
}
class C extends A
{
	public void show2()
	{
		System.out.println("C is sub class of A");
	}
}
class D extends A
{
	public void show3()
	{
		System.out.println("D is sub class of A");
	}
	}
public class HeirarchicalInheritanceDemo {

	public static void main(String[] args) {
		B obj1= new B();
		obj1.show();
		obj1.show1();
		
		C obj2=new C();
		obj2.show();
		obj2.show2();
		
		D obj3=new D();
		obj3.show();
		obj3.show3();
		
	}

}
