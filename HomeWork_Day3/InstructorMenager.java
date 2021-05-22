
public class InstructorMenager extends UserMenager {
	@Override
	public void add(User user) {
		
		System.out.println("Instructor Kaydedildi : "+user.getFirstName()+" "+user.getLastName());
		
	}
	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý Silindi : "+user.getFirstName()+" "+user.getLastName());
	}

}
