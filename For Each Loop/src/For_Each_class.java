
public class For_Each_class {

	public static void main(String[] args) {
		
		int[] marks = {125, 132, 95, 116, 110};
		
		int highesMark=maximum(marks);
		System.out.println(highesMark);

	}
	
	public static int maximum(int[] array) {
		
		int max = array[0];
		for(int num: array) {
			if(num>max) {
				max=num;
			}
		}
		return max;
				
	}

}
