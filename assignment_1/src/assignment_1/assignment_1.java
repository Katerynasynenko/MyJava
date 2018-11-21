package assignment_1;

public class assignment_1 {

	public static void main(String[] args) {
		
		
		int income = 700_000_000;
		double tax; 
		if(income<=150000000) {
			tax = income*0.25;
			System.out.println(tax);
		}else if(income>150000000 && income<=300000000) {
			tax = income*0.3;
			System.out.println(tax);
		}else if(income>300000000 && income<=600000000) {
			tax = income*0.35;
			System.out.println(tax);
		}else if(income>600000000 && income<=1200000000) {
			tax = income*0.4;
			System.out.println(tax);
		}else if(income>1200000000) {
			tax = income*0.5;
			System.out.println(tax);
		}

	}

}
