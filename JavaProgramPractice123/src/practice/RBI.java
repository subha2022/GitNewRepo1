package practice;

public interface RBI 
{
public void deposit();
public void withdrawl();

public static void main(String[] args) 
{
	RBI i;
	i= new SBI();
	i.deposit();
	i.withdrawl();
}

}
