package assignment_4;

public class assignment_4 {

	public static void main(String[] args) {
		
		System.out.println(dogThatLikesToBark(true,1));
		System.out.println(dogThatLikesToBark(false,2));
		System.out.println(dogThatLikesToBark(true,8));
		System.out.println(dogThatLikesToBark(true,-1));
		
	}
	
	public static boolean dogThatLikesToBark(boolean barking, int hourOfDay) {
		if(barking == true && (hourOfDay<8 || hourOfDay>22 ) && hourOfDay>0 ) {
			return true; 
		}else {
			return false;
		}

	}
}
