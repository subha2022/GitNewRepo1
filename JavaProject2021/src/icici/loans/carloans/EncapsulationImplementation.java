package icici.loans.carloans;

public class EncapsulationImplementation {

	public static void main(String[] args) 
	{
		EncapsulationExample obj = new EncapsulationExample();
		
		obj.setEmpID(1234);
		obj.setAge(28);
		obj.setName("Subha");
		obj.setMobNum(783860002);
		
		System.out.println(obj.getName());
		System.out.println(obj.getEmpID());
		System.out.println(obj.getAge());
		System.out.println(obj.getMobNum());
			

	}

}
