package Computer;

public class Main {

	public static void main(String[] args) {
		
		Dimensions theDimensions = new Dimensions(20, 20, 5);
		
		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
		
		Case theCase = new Case("2208", "Dell", "240", theDimensions);
		
		Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		thePC.getTheMonitor().drawPixaAt(1500, 1200, "red");
		
		thePC.getTheMotherboard().loadProgram("Windows 1.0");
		
		thePC.getTheCase().pressPowerButton();
	}

}
