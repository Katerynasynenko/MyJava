
public class Switch_class {

	public static void main(String[] args) {

		int switchValue=3;
		switch(switchValue) {
		case 1:
			System.out.println("value was 1");
		case 2: 
			System.out.println("value was 2");
		case 3: 
			System.out.println("value was 3");
		case 4: case 5: case 6:
			System.out.println("value was 4, or 5, or 6");
			break;
		default:
			System.out.println("was not correct value");
			break;
	    }
		
    }
	
}	
