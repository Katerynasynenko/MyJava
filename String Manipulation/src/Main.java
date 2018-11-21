
public class Main {

	public static void main(String[] args) {
		
		// charAt (index) => returns char value for the particular index. 
		String str = "JavaScript";
		System.out.println(str.charAt(3));
		
		// length => returns string length 
		System.out.println(str.length());
		
		// substring (ind beginIndex) => returns substring for given begin index
		System.out.println(str.substring(5));
		
		// substring (int begin index, int end index) => returns substring for given begin index and end index
		System.out.println(str.substring(2, 6));
		
		// contains() => returns true or false after matching the sequence of char value
		System.out.println(str.contains("va"));
		
		// equals (Object another) => checks the equality of string with the given object
		System.out.println(str.equals("JavaScript")); // true 
		
		// isEmpty() => checks is string is empty 
		System.out.println(str.isEmpty()); // false
		
		//concat (string str) => concatinates the spec string 
		System.out.println(str.concat(" batch 9"));   //JavaScript batch 9
		
		//replace (char old, char new)
		System.out.println(str.replace("Script", ""));   // Java 
		
		//equalsIsIgnoreCase(string another) - compares another string. It does not check case
		System.out.println(str.equalsIgnoreCase("javascript"));  // true
		
		// split(String delimeter) - returns a split matching delimeter
		String str2 = "JavaScript is the best batch ever";
		String [] myArray = str2.split(" ");
		for(String word : myArray) {
			System.out.println(word);
		};
		
		//indexOf() => returns the specified char value index
		System.out.println(str.indexOf('v'));
		
		//indexOf(String substring, int fromIndex) => returns the specified substring index starting with given 
		System.out.println(str.indexOf('a', 4));  //-1
		
		//toLowerCase() => returns string in lower case 
		System.out.println(str.toLowerCase());
		
		//trim() => removes beginning and ending spaces 
		System.out.println(str.trim());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
