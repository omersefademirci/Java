
public class UserMenager {
	public void add(User user) {
		System.out.println("Kullan�c� Kaydedildi : "+user.getFirstName()+" "+user.getLastName());
		
	}
	public void delete(User user) {
		System.out.println("Kullan�c� Silindi : "+user.getFirstName()+" "+user.getLastName());
	}

}
