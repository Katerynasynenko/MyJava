package assignment_17;

import java.util.*;

public class assignment_17 {

	public static void main(String[] args) {
		
		
		 int min, max;

		    Scanner s = new Scanner(System.in);
		    System.out.println("Enter a Value: ");
		    int val = s.nextInt();
		    min = max = val;

		    while (val != 0) {
		        if (val < min) {
		            min = val;
		        }
		        if (val > max) {
		            max = val;
		        }
		        System.out.println("Enter a Value: ");
		        val = s.nextInt();
		        if (val < min) {
		            min = val;
		        }
		        if (val > max) {
		            max = val;
		        }

		    }
		    System.out.println("Min: " + min);
		    System.out.println("Max: " + max);
		}
	}
	
	
