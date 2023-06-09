package TaskGiven_Loka;

class Bank {
	int getRateofInterest() {
		return 7;

	}
}

class SBI extends Bank {
	int getRateofInterest() {
		return 10;

	}

	float getExtraBonus() {
		return 2.5f;

	}
}

class HDFC extends Bank {
	int getRateofInterest() {
		return 12;

	}

	float getExtraBonus() {
		return 3.5f;

	}

	int getShoppingBonus() {
		return 5;

	}
}

public class Method_Overriding {

	public static void main(String[] args) {
		Bank bobj = new Bank();
		System.out.println(bobj.getRateofInterest());
		System.out.println("__________________");
		SBI sobj = new SBI();
		System.out.println(sobj.getRateofInterest());
		System.out.println(sobj.getExtraBonus());
		System.out.println("__________________");
		HDFC hobj = new HDFC();
		System.out.println(hobj.getRateofInterest());
		System.out.println(hobj.getExtraBonus());
		System.out.println(hobj.getShoppingBonus());

	}

}
