package assignment_15;

public class assignment_15 {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(257));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(5));
		System.out.println(sumFirstAndLastDigit(-10));

	}
	
	public static int sumFirstAndLastDigit (int number) {
		int last_number1 = number%10;
		int reverse = 0; 
		int first_number = 0;
		
		while (number != 0) {
			int lastDigit = number%10;
			reverse = reverse*10 + lastDigit;
			number = (number - lastDigit)/10;
			first_number = reverse%10;
			
		}
		if(number<0) {
			return -1;
		}else {
			return (first_number+last_number1);
		}
	}

}
