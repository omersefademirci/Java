
public class Main {

	public static void main(String[] args) {
		Student student1=new Student();
		student1.setFirstName("Metehan");
		student1.setLastName("Gokay");
		student1.setAge(22);
		student1.setNationality("T�rkiye");
		student1.setSuccessRate(60);
		student1.setGender("E");
		student1.setId(1);
		
		
		
		Student student2 =new Student();
		student2.setFirstName("�mer Sefa");
		student2.setLastName("Demirci");
		student2.setAge(20);
		student2.setSuccessRate(80);
		student2.setGender("E");
		student2.setId(2);
		
		Instructor �nstructor1=new Instructor();
		�nstructor1.setFirstName("Ilg�n");
		�nstructor1.setLastName("Yavuz");
		
		Instructor �nstructor2=new Instructor();
		�nstructor2.setFirstName("Merve");
		�nstructor2.setLastName("P�naro�lu");
		
		
		
		StudentMenager studentmenager=new StudentMenager();
		studentmenager.add(student1);
		studentmenager.delete(student2);
		
		System.out.println("*****************");
		
		InstructorMenager �nstructorMenager=new InstructorMenager();
		�nstructorMenager.add(�nstructor1);
		�nstructorMenager.delete(�nstructor2);
		
	}

}
