package polymorphisim;

  class Parent
{
	 public void workhrd()
	 {
		 System.out.println("parent:wake up early , goto college");
				
	 }
	 public void care()
	 {
		 System.out.println("parent:atmost care");
	 }
	//public abstract void m4();
}

public class Child extends Parent
{
	 public  void workhrd()
	 {
		 System.out.println("child:wake up anytime , goto movie");
		
	 }
	public void love()
	{
		System.out.println("child:i am in love");
	}

	public static void main(String[] args)
	{
		Child obj = new Child();
		obj.workhrd();
		obj.care();
		obj.love();

	}
	/*@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}*/

}
