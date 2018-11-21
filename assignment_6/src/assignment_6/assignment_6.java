package assignment_6;

public class assignment_6 {

	public static void main(String[] args) {
		
		System.out.println(hasEqualSum(1, 1, 1));
		System.out.println(hasEqualSum(1, 1, 2));
		System.out.println(hasEqualSum(1, -1, 0));

	}
	
	public static boolean hasEqualSum (int num_1, int num_2, int num_3) {
		
		if(num_1+num_2==num_3) {
			return true;
		}else {
			return false;
		}
		
	}

}
