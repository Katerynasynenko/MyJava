import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
	 int counter =1;
	 int sum = 0;
	 
	 while (counter<11){
		System.out.println("Please enter the "+ counter + " number");
		boolean bool = scanner.hasNextInt();
		if(bool==false) {
			System.out.println("Please, enter valid number");
		}else {
			counter ++;
			int number = scanner.nextInt();
			sum = sum+number;
		}
		scanner.nextLine();
	}
	 System.out.println("The sum is " + sum);
	 scanner.close();

}
}

