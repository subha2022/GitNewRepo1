package interfacedemo;

public interface Rbi {

	public void withdrawl();
	public void deposit();
	
	public static void main(String[] args) {
		Rbi i ;
		i= new SBI();
		i.deposit();
		i.withdrawl();
	}
}
