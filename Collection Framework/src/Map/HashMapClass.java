package Map;

import java.util.*;

public class HashMapClass {

	public static void main(String[] args) {
		
//		Map map = new HashMap();
		Map <String, String> map = new HashMap <> ();
		
		map.put("myName", "Mike");
		map.put("myJob", "Deleloper");
		map.put("myAge", "25");
		
		System.out.println(map);
	       System.out.println(map.get("myName"));
	       System.out.println(map.get("myName2"));

	       Set <String> keys=map.keySet();//is collecting all the keys
	       for(String key:keys) {
	           map.get(keys);
	           System.out.println(key+" "+map.get(key));
	       }
		
	}

}
