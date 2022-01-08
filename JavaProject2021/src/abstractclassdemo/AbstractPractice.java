package abstractclassdemo;

public abstract class AbstractPractice {
	int x=5, y=6, result;
	public void add()
	{
		result=x+y;
		System.out.println(result);
		
	}
 abstract void sub();
	

	public static void main(String[] args) {
		 AbstractPractice obj1 = new AbstractClass();
        obj1.add();
        obj1.sub();

	}

}
