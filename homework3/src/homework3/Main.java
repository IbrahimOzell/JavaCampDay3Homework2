package homework3;

public class Main {

	public static void main(String[] args) {
		
		Course course= new Course("java");
		
		Instructor instructor = new Instructor(1,"Engin","Demiroğ","abc@hotmail.com","Engind","java");  
		instructor.id=1;
		instructor.email="abc@hotmail.com";
		instructor.userName="Engind";
		instructor.course="java";
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourses(course,instructor);
		
		
		
		Student student = new Student(2,"Ahmet","Abc","cba@hotmail.com","Ahmeta","java");
		student.id=2;
		student.email="cba@hotmail.com";
		student.userName="Ahmeta";
		student.course="java";
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerCourse(course,student);
		
		
		UserManager userManager = new UserManager();
		userManager.logIn(student);
		userManager.logIn(instructor);
		
	}

}
