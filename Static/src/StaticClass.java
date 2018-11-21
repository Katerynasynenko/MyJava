
public class StaticClass {

	public static void main(String[] args) {
		
		static_test static1 = new static_test("instance_1");
		System.out.println(static1.getName() + " is instance number "+ static1.getNumInstance());
		
		static_test static2 = new static_test("instance_2");
		System.out.println(static2.getName() + " is instance number "+ static2.getNumInstance());
		
		static_test static3 = new static_test("instance_3");
		System.out.println(static3.getName() + " is instance number "+ static3.getNumInstance());

	}

}
