package interfacedemo;

public class ClassPrint implements InterfacePractice
{
public static void main(String[] args)
{
	ClassPrint obj = new ClassPrint();
	obj.input();
	obj.output();
}
	@Override
	public void input() {
		System.out.println("I am Input in ClassPrint");
	}

	@Override
	public void output() {
		System.out.println("I am Output in ClassPrint");
		
		
	}

	
}
