package exercise3_1;

public class CourseStudent {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Ll Ll");
		s.setGrade1(3.5);
		s.setGrade2(4);
		System.out.println(s.getName() +" average " +s.average());
	}
 
}
