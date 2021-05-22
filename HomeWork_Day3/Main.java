
public class Main {

	public static void main(String[] args) {
		Student student1=new Student();
		student1.setFirstName("Metehan");
		student1.setLastName("Gokay");
		student1.setAge(22);
		student1.setNationality("Türkiye");
		student1.setSuccessRate(60);
		student1.setGender("E");
		student1.setId(1);
		
		
		
		Student student2 =new Student();
		student2.setFirstName("Ömer Sefa");
		student2.setLastName("Demirci");
		student2.setAge(20);
		student2.setSuccessRate(80);
		student2.setGender("E");
		student2.setId(2);
		
		Instructor ınstructor1=new Instructor();
		ınstructor1.setFirstName("Ilgın");
		ınstructor1.setLastName("Yavuz");
		
		Instructor ınstructor2=new Instructor();
		ınstructor2.setFirstName("Merve");
		ınstructor2.setLastName("Pınaroğlu");
		
		
		
		StudentMenager studentmenager=new StudentMenager();
		studentmenager.add(student1);
		studentmenager.delete(student2);
		
		System.out.println("*****************");
		
		InstructorMenager ınstructorMenager=new InstructorMenager();
		ınstructorMenager.add(ınstructor1);
		ınstructorMenager.delete(ınstructor2);
		
	}

}
