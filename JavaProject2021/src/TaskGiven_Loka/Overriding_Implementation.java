package TaskGiven_Loka;

public class Overriding_Implementation {

	public static void main(String[] args)
	{
		Grand_Parentproperty gp= new Grand_Parentproperty();
		gp.landProperty();
		gp.goldProperty();
		gp.vehicleProperty();
		 
		Parent_Property pp = new Parent_Property();
		pp.landProperty();
		pp.vehicleProperty();
		pp.goldProperty();
		pp.Factory();		
		
		Self_Property sp = new Self_Property();
		sp.landProperty();
		sp.goldProperty();
		sp.vehicleProperty();
		sp.Mutualfund();
		
		

	}

}
