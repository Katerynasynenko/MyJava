
public class Calculateinterest {

	public static void main(String[] args) {
		//how much is the interest of the amount of $10000 and %2 interest rate
		//how much is the interest of the amount of $10000 and %3 interest rate
		//how much is the interest of the amount of $10000 and %4 interest rate
		//how much is the interest of the amount of $10000 and %5 interest rate
		
		System.out.println(calculateInterest(10000, 2));
		System.out.println(calculateInterest(10000, 3));
		System.out.println(calculateInterest(10000, 4));
		System.out.println(calculateInterest(10000, 5));
		
		System.out.println("------------");
		
		for (int i=2; i<6 ; i++) {
			System.out.println(calculateInterest(10000, i));
		}

	}
	
	public static double calculateInterest(double amount, double interest_rate) {
		return amount*(interest_rate/100);
	}

}
