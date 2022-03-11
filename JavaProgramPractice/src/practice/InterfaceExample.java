package practice;

 interface WaterBottle
{
	String color ="Blue";
	
	public void fillUp();
	public void addMoreColor();
}

public class InterfaceExample implements WaterBottle
{

	public static void main(String[] args)
	{
		InterfaceExample obj = new InterfaceExample();
		obj.fillUp();
		obj.addMoreColor();

	}

	@Override
	public void fillUp() 
	{
		System.out.println(" It is filled");
		
	}

	@Override
	public void addMoreColor() 
	{
		System.out.println("Add more color");
		
	}

}
