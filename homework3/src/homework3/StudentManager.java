package homework3;

public class StudentManager extends UserManager{
	public void registerCourse(Course course ,Student student) {
		System.out.println("Kursa katıldınız : " + course.getCourseName() +" "+ student.getFirstName()  );
	}
}
