
public abstract class Animal {

	private String name;
	

	public Animal(String name) {    //constructor 
		this.name = name;
	}

	public abstract void eat();    //abstract method
	public abstract void breath();

	public String getName() {  //Concrete methods
		return name;
	}
	
	
	
	
	
}
