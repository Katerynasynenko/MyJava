package assignment_21;

public class A {

	public String str = "JAVA";
	public double val;
	
	public A() {
	};
	
	public A(String str) {
		this.str = str;
	};
	
	public A(String str , double val ) {
		this.str = str;
		this.val = val;
	};
	
	public A(double val ) {
		this.val = val;
	};
	
	
	public void print() {
		System.out.println("str: "+ str + " ,val "+ val);
	};
	
	
}
