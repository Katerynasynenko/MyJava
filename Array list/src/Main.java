import java.util.*;

public class Main {
	
	private static Scanner scanner = new Scanner (System.in);
	
	private static GroceryList groceryList = new GroceryList();
	
	public static void main(String[] args) {

		boolean quit = false;
		int choice = 0;
		printInstructions();
		while(!quit) {
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			scanner.nextLine();
			
			
			switch(choice) {
			case 0 :
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3: 
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6: 
				quit=true;
				break;
			}
		}

	}

	private static void searchForItem() {
		System.out.println("Enter your item you want to find");
		String item = scanner.nextLine();
		groceryList.findItem(item);
		
	}

	private static void removeItem() {
		System.out.println("Enter your item you want to remove");
		int item = scanner.nextInt();
		groceryList.removeGroceryItem(item); 
		
	}

	private static void modifyItem() {
		
		groceryList.printGroceryList();
		
		System.out.println("Enter your item which you want to replace");
		int replacement_item = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter your new item");
		String new_item = scanner.nextLine();
		
		groceryList.modityGroceryItem(replacement_item, new_item);
		
		
	}

	private static void printInstructions() {
		System.out.println("Press 0 - to open the instruction. \nPress 1 - to see the Grocery list. \nPress 2 - to add item to the list."
+ "\nPress 3 - to modify the grocery list.\nPress 4 - to remove item from Grocery list.\nPress 5 - to search for item.\nPress 6 - to exit the program.");
		
	}

	private static void addItem() {
		System.out.println("Enter your item you want to add");
		String item = scanner.nextLine();
		groceryList.addGroceryItem(item); 
		
	}

	

}
