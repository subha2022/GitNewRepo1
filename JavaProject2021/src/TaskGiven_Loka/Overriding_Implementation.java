package TaskGiven_Loka;

public class Overriding_Implementation {

	public static void main(String[] args)
	{
		Grand_Parentproperty gp= new Grand_Parentproperty();
		System.out.println(gp.landNo);
		gp.landProperty();
		gp.goldProperty();
		gp.vehicleProperty();
		System.out.println("*************************"); 
		
		Parent_Property pp = new Parent_Property();
		System.out.println(pp.landNo);
		pp.landProperty();
		System.out.println("***************************");
		pp.vehicleProperty();//Sell that Vehicle and Buy Nexon
		System.out.println("***************************");
		pp.goldProperty();
		System.out.println("***************************");
		pp.Factory();	//Make a Factory
		Parent_Property.myMethod();
		
		System.out.println("***************************");
		Self_Property sp = new Self_Property();
		System.out.println(sp.landNo);
		sp.landProperty();
		sp.goldProperty();
		sp.vehicleProperty();
		sp.Mutualfund();
		
		Grand_Parentproperty gp1 = new Parent_Property();
		
		gp1.landProperty();
		
	//	Grand Parents property Renovation
		

	}

}
