package homework3;

public class InstructorManager extends UserManager{
	public void addCourses( Course course,Instructor instructor) {
		System.out.println("Kurs oluşturuldu : " + course.getCourseName() +" " + instructor.getFirstName());
	}

}
