package icici.loans.carloans;

public class FirstClass {
	//Data properties
	int a=30,b=20,result;
	//Behaviours
	public void add()
	{
		result=a+b;
		System.out.println("Add of a & b :"+result);
	}
	public void sub()
	{
		result=a-b;
		System.out.println("Sub of a & b :"+result);
	}
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		FirstClass obj=new FirstClass();
		obj.add();
		obj.sub();	


	}

}
