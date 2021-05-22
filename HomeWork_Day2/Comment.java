package oopHomeWork;

public class Comment {
	public Comment() {
		System.out.println("Yorum eklendi");
	}
	public Comment(int id, String traineeName,String comment) {
		this();
		this.id=id;
		this.traineeName=traineeName;
		this.comment=comment;
	}
	int id;
	String  traineeName;
	String comment;

}
