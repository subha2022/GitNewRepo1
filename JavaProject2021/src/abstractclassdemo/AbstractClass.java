package abstractclassdemo;

public class AbstractClass extends AbstractPractice
{
	

	public static void main(String[] args) {
		AbstractClass obj = new AbstractClass();
		obj.add();
		obj.sub();
	}

	@Override
	void sub() {
		System.out.println("i am sub overriden in AbstractClass");
		
	}

}
