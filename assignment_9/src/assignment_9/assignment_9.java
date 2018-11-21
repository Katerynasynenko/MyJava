package assignment_9;

public class assignment_9 {

	public static void main(String[] args) {
		
		System.out.println(area(5.0));
		System.out.println(area(-1));
		System.out.println(area(5.0,4.0));
		System.out.println(area(-1.0,4.0));

	}
	
	public static double area (double radius) {
		if(radius<=0) {
			return -1.0;
		}else {
			double myArea1 = radius*radius*3.14159;
			return myArea1;
		}
	}
	
	
	public static double area (double x, double y) {
		if(x<=0 || y<=0) {
			return -1.0;
		}else {
			double myArea2 = x*y;
			return myArea2; 
		}
		
		
	}

}
