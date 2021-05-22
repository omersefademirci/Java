package oopHomeWork;

public class Main {

	public static void main(String[] args) {
		Courses course1=new Courses();
		course1.id=1;
		course1.courseName="Yazýlým Geliþtirme Kampý";
		course1.courseDescription="C# - Angular";
		course1.courseInstructor="Engin Demiroð";
		
		Courses course2=new Courses();
		course2.id=2;
		course2.courseName="Java Programlama Kampý";
		course2.courseDescription="Java ve React ";
		course2.courseInstructor="Engin Demiroð";
		
		Courses[] courses= {course1,course2};
		CourseMenager courseMenager=new CourseMenager();
		
		for (Courses course : courses) {
			System.out.println();
			courseMenager.addToCourse(course);
			System.out.println(
						"Kurs ismi : "+course.courseName+"\n"+
						"Kurs Açýklamasý : "+course.courseDescription+"\n"+
						"Kursun Hocasý : "+course.courseInstructor
					);
			}
		System.out.println();
		Comment comment1 =new Comment();
		comment1.id=1;
		comment1.traineeName="Tarýk Demir";
		comment1.comment="Ders gerçekten çok güzeldi";
		
		CommentMenager commentMenager=new CommentMenager();
		commentMenager.addComment(comment1);
	}

}
