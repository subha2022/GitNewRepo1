package interfacedemo;

public interface InterfacePractice {
	
	public void input();
	public void output();
	
	public static void main(String[] args) {
		
		InterfacePractice i;
		i=new ClassPrint();
		i.input();
		i.output();
	}
	
	
}
