
public class Task_main_class {


	public static void main(String[] args) {
		
		Task_constructor Student1 = new Task_constructor("Mike", 23, 'M', 2018, "Java");
		System.out.println(Student1.name+ " is in "+ Student1.univercity );
		Student1.attendLab();
		Student1.attendLecture();
		Student1.submitAssignment();
		
		Task_constructor Student2 = new Task_constructor("Katya", 23, 'F', 2018, "JavaScript");
		Student2.attendLab();
		Student2.attendLecture();
		Student2.submitAssignment();
		

	}

	

}
