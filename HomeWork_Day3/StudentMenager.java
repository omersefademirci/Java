
public class StudentMenager extends UserMenager {
	@Override
	public void add(User user) {
		System.out.println("��renci Kaydedildi : "+user.getFirstName()+" "+user.getLastName());
		
	}
	@Override
	public void delete(User user) {
		System.out.println("��renci Silindi : "+user.getFirstName()+" "+user.getLastName());
	}

}
