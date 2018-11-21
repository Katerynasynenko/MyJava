
public class Task_1 {

	public static void main(String[] args) {
		
		System.out.println(calcFeetAndInchesToCentimeters(6, 0));
		System.out.println(calcFeetAndInchesToCentimeters(-10, 0));
		System.out.println(calcFeetAndInchesToCentimeters(0,1));
		System.out.println(calcFeetAndInchesToCentimeters(100));
		System.out.println(calcFeetAndInchesToCentimeters(156));
		
		
		}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		if(feet<0 || inches<0 || inches>=12) {
			System.out.println("Invalid feet or inches");
			return -1;
		}else {
			double part1 = 12*feet;
			double result = (part1+inches)*2.54;
			System.out.println(feet + " feet, "+ inches+ " inches=" + result + " centimeters");
			return result;
		}
		

	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches<=0) {
			return -1;
		}else {
			double feet = (int)inches /12;
			double remainingInches = (int)inches%12;
			System.out.println(inches + " inches = "+ feet + " feet and "+ remainingInches + " inches");
			return calcFeetAndInchesToCentimeters(feet, remainingInches);
			
			
		}
	}
	
}


