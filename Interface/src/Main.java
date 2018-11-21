
public class Main {

	public static void main(String[] args) {
		
		//DeskPhone mikePhone = new DeskPhone(54845165, true);
		
		ITelephone mikePhone = new DeskPhone(4545454, true);
		
		mikePhone.powerOn();
		mikePhone.callPhone(4545454);
		mikePhone.answer();

	}

}
