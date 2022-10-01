package accessModifierByVinoth;

public class Self {
	// public is access all level
	public void bankName() 
	{
		System.out.println("Having home loan in HDFC Bank");
	}
	// protected  is access with in the package and outside the package using inheritance only not using object instance
	protected void loanDetails()
	{
		System.out.println("50lakhs home loan");
	}
	// default has no keyword , it is access in within the package 
	 void atmPassword()
	{
		System.out.println("1245 is atm password");
	}
	 // private is access only within the class
	public void internetBanking()
	{
		System.out.println("Abc is internet banking password");
	}
	public static void main(String[] args) {
		Self obj = new Self();
		obj.bankName();
		obj.loanDetails();
		obj.atmPassword();
		obj.internetBanking();
				
	}
}
