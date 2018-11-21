package assignment_16;

public class assignment_16 {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));

	}

	public static int getEvenDigitSum(int number) {
		int sum = 0; 
		if(number>0) {
			while (number != 0) {
				int num = number%10;
					if(num%2==0) {
						sum = sum + num;
					}
				number = (number-num)/10;
			}
			return sum;
		}else {
			return -1; 
		}
	}
}
