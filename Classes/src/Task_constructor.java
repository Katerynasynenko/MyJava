
public class Task_constructor {

	public String name;
	public int age;
	public char gender;
	public int year;
	public String cource;
	public static String univercity = "Cybertek";
	
	
	public Task_constructor(String name, int age, char gender, int year, String cource) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.cource = cource;
	}

	public void attendLecture() {
		System.out.println(name + " is attending lecture at "+ univercity);
	}
	
	public void submitAssignment() {
		System.out.println(name + " is submitting assignments at " + univercity);
	}
	
	public void attendLab() {
		System.out.println(name + " is attending lab at "+ univercity);
	}
	
	
	
}
