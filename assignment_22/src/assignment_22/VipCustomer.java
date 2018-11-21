package assignment_22;

public class VipCustomer {
	
	private String name;
	private int credit_limit;
	private String email;
	
	
	
	public VipCustomer(String name, int credit_limit, String email) {
		this.name = name;
		this.credit_limit = credit_limit;
		this.email = email;
		
		System.out.println("This constructor has 3 input fields: name - " + name + ", credit_limit - " + credit_limit + ", email - " + email);
		
	}
	
	
	public VipCustomer(String name, int credit_limit) {
//		this.name = name;
//		this.credit_limit = credit_limit;
		this();
		
		System.out.println("This constructor has 2 input fields and 1 by default: name - " + name + ", credit_limit - " + credit_limit + ", email - " + email);
	}
	
	public VipCustomer() {
		System.out.println("This constructor has 3 fields by default: name - " + name + ", credit_limit - " + credit_limit + ", email - " + email);
	};


	public String getName() {
		return name;
	}


	public int getCredit_limit() {
		return credit_limit;
	}


	public String getEmail() {
		return email;
	}
	
	
	
	

}
