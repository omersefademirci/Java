package oopHomeWork;

public class Main {

	public static void main(String[] args) {
		Courses course1=new Courses();
		course1.id=1;
		course1.courseName="Yaz�l�m Geli�tirme Kamp�";
		course1.courseDescription="C# - Angular";
		course1.courseInstructor="Engin Demiro�";
		
		Courses course2=new Courses();
		course2.id=2;
		course2.courseName="Java Programlama Kamp�";
		course2.courseDescription="Java ve React ";
		course2.courseInstructor="Engin Demiro�";
		
		Courses[] courses= {course1,course2};
		CourseMenager courseMenager=new CourseMenager();
		
		for (Courses course : courses) {
			System.out.println();
			courseMenager.addToCourse(course);
			System.out.println(
						"Kurs ismi : "+course.courseName+"\n"+
						"Kurs A��klamas� : "+course.courseDescription+"\n"+
						"Kursun Hocas� : "+course.courseInstructor
					);
			}
		System.out.println();
		Comment comment1 =new Comment();
		comment1.id=1;
		comment1.traineeName="Tar�k Demir";
		comment1.comment="Ders ger�ekten �ok g�zeldi";
		
		CommentMenager commentMenager=new CommentMenager();
		commentMenager.addComment(comment1);
	}

}
