package assignment_7;

public class assignment_7 {

	public static void main(String[] args) {
		
		System.out.println(hasTeen(9,99,19));
		System.out.println(hasTeen(23,15,42));
		System.out.println(hasTeen(22,23,34));

	}
	
	public static boolean hasTeen(int num_1, int num_2, int num_3) {
		
		if((num_1>=13 && num_1<=19) || (num_2>=13 && num_2<=19) || (num_3>=13 && num_3<=19)) {
			return true;
		}else {
			return false;
		}
		
	}
}


