package polymorphisim;

class Bird{
	
	public void sing()
	{
		System.out.println("tweet tweet tweet");
	}
	
}
class Robin extends  Bird
{
	public void sing()
	{
		System.out.println("ching ching ching");
	}
}
class Pelican extends Robin
{
	public void sing()
	{
		System.out.println("chung chung chung");
	}
}

public class PolymorphismDemo {
	
	public static void main(String[] args) 
	{
	Bird obj = new Bird();
		obj.sing();

	Robin obj1 = new Robin();
		obj1.sing();
		
	Pelican obj2 = new Pelican();
	obj2.sing();

	}

}
