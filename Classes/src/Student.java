
public class Student {
    String name;
    String gender;
    int age;
    int year;
    String course;
    String university;
		
		
		public void setStudent (String name, int age, String gender, int year, String course, String university) {

			//this();
			this.name=name;
			this.age=age;
			this.gender=gender;
			this.year=year;
			this.course=course;
			this.university=university;
			
		}
		
		public void attendLecture() {
			System.out.println(name + age + " attended lecture");
		}
		public void submitAssignment() {
			System.out.println(name  + age + " submitted assignment");
		}
		public void attendLab() {
			System.out.println(name + age +  " attended lab");
		}
	}
