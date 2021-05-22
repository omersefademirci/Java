package oopHomeWork;

public class Courses {
	public Courses() {
		System.out.println("Tamamlandý");
	}
	public Courses(int id, String courseName,String courseInstructor, String courseDescription) {
		this();
		this.id = id;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseInstructor = courseInstructor;
		
		
	}
	int id;
	String courseName;
	String courseDescription;
	String courseInstructor;
	
	

}
