
public class account_main {

	public static void main(String[] args) {
		
		bank_account Customer1 = new bank_account();
		Customer1.setCustomer_name("Katya");
		Customer1.setAccount_number(125468752);
		Customer1.setBalance(500);
		
		Customer1.withdraw_funds(400);
		Customer1.withdraw_funds(1000);
		Customer1.deposite_funds(400);

	}

}
