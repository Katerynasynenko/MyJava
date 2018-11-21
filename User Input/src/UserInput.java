import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter a byte value");
//		byte b1 = scanner.nextByte();
//		System.out.println("My byte value is "+ b1);
//		
		System.out.println("Enter the short value");
		short s1 = scanner.nextShort();
//		System.out.println("My short vale is" + s1);
//		
//		System.out.println("Enter bollean");
//		boolean bu1 = scanner.hasNext();
//		System.out.println("This is my boolean "+ bu1);
//		
		scanner.nextLine();		
		System.out.println("Enter your name");
		String str = scanner.nextLine();
		System.out.println(str);
		
		scanner.close();

	}

}
