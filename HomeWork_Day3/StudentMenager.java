
public class StudentMenager extends UserMenager {
	@Override
	public void add(User user) {
		System.out.println("Öðrenci Kaydedildi : "+user.getFirstName()+" "+user.getLastName());
		
	}
	@Override
	public void delete(User user) {
		System.out.println("Öðrenci Silindi : "+user.getFirstName()+" "+user.getLastName());
	}

}
