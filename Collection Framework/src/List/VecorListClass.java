package List;

import java.util.Vector;

public class VecorListClass {

	public static void main(String[] args) {
	
		//Vector has an initial size of 10; and the increase capacity is 100%
		// Vector is slow and not good for use 
		Vector <Integer> v = new Vector <Integer>();
		
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		
		v.add(2);
		
		System.out.println(v.capacity());
		

	}

}
