package homework3;

public class User {
	int id;
	String course;
	String email;
	String userName;
	
	public User() {
		
	}
	
	
	public User(int id, String email, String userName, String course) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.course = course;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
