
public class Calculate_Sum {

	public static void main(String[] args) {	

		calculate_sum(4, 5);
		System.out.println(calculateSum(5,10));
	}
	
	public static void calculate_sum (int a, int b) {
		
		int sum = a+b; 
		System.out.println(sum);
	}
	
	public static int calculateSum(int x, int y) {
		
		int sum = x+y;
		return sum; 
	}
	
}


