
public class Static_Methods {

	public static void main(String[] args) {
		
		Abc x = new Abc();
		
		Abc.show1();
		
		x.show2();
		

	}

}


class Abc {
	
	public static void show1 () {
		System.out.println("hi");
		show2();
		show4();
	}
	
	public void show2() {
		System.out.println("hi");
	}
	
	public void show3() {
		System.out.println("hi");
		show2();
		show1();
	}
	
	public static void show4() {
		System.out.println("hi");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
