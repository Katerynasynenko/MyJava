
public class static_test {
	
	private static int numInstance=0;
	private String name;
	
	public static_test(String name) {
		this.name=name;
		numInstance++;
	}
	
	public int getNumInstance() {
		return numInstance;
	}
	
	public String getName() {
		return name;
	}

}
