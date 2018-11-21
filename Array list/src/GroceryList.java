import java.util.*;


public class GroceryList {

private static final String Null = null;
//	List groceryList = new ArrayList();
	
	List <String> groceryList = new ArrayList<String>();
	
	public void addGroceryItem (String item) {
		groceryList.add(item);         // adding the item to the list 
	}
	
	public void printGroceryList () {
		System.out.println("You have " + groceryList.size() + " items in your Grocery List");
		for (int i=0; i<groceryList.size(); i++) {
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
	}
	
	public void modityGroceryItem(int position, String newItem) {
		groceryList.set(position - 1, newItem);   // to change the item in list by replacement 
		
	}
	
	public void removeGroceryItem(int position) {
		groceryList.remove(position -1 );
	}
	
	
	
	public void findItem(String searchItem) {
//		boolean exists = groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		if (position >= 0) {
			System.out.println("Your item is " + groceryList.get(position) + " on the list.");
		}else {
			System.out.println("You do not have this item in your list");
		}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
