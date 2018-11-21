
public class bank_account {

	private int account_number;
	private double balance;
	private String customer_name;
	private String email;
	private int phone_number;
	
	
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumber() {
		return phone_number;
	}
	public void setNumber(int number) {
		this.phone_number = number;
	}
	
	
	public double deposite_funds(double deposite) {
		this.balance = balance+deposite;
		System.out.println("Your new balance = $"+ this.balance);
		return this.balance;
	}
	
	public double withdraw_funds(double withdraw) {
		if(this.balance-withdraw<0) {
			System.out.println("You dont have this amount on your account. Your account balance is $"+ this.balance);
			return this.balance;
		}else {
			this.balance = this.balance-withdraw;
			System.out.println("Your remaining balance = $" + this.balance);
			return this.balance;
		}
	}
	
	
	
	
	
}
