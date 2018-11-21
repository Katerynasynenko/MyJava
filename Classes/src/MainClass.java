public class MainClass {
    public static void main(String[] args) {
        
    	Student student1=new Student();
        student1.setStudent("Mike",25,"M",1980,"JavaScript", "Cybertek" );
        student1.attendLecture();
        student1.attendLab();
        student1.submitAssignment();
        
       
        Student student2=new Student();
        student2.setStudent("Jake",88,"F",1971,"JavaScript", "Cybertek" );
        student2.attendLecture();
        student2.attendLab();
        student2.submitAssignment();

        Student student3=new Student();
        student3.setStudent("Jane",125,"F",1990,"JavaScript", "Cybertek" );
        student3.attendLecture();
        student3.attendLab();
        student3.submitAssignment();

    }
}
