package assignment_14;

public class assignment_14 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(12321));
		System.out.println(isPalindrome(1001));
		System.out.println(isPalindrome(10011));

	}
	
	public static boolean isPalindrome (int number) {
		
		int reverse =0;
		int input_number = number;
		while (number!=0) {
			int lastDigit = number%10;
			reverse = reverse*10 + lastDigit;
			number = (number - lastDigit)/10;
			
		}
		
		
		if(input_number==reverse) {
			return true;
		}else {
			return false;
		}
		
	}

}
