
public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Ceaser");
		dog.eat();
		dog.breath();
		
		Parrot p1 = new Parrot("Australia Ringneck");
		p1.breath();
		p1.eat();
		p1.fly();  // run it from Bird 
		
		Penguin pen1 = new Penguin("Pigi");
		pen1.eat();
		pen1.fly();

	}

}
