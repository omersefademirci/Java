
public class UserMenager {
	public void add(User user) {
		System.out.println("Kullanýcý Kaydedildi : "+user.getFirstName()+" "+user.getLastName());
		
	}
	public void delete(User user) {
		System.out.println("Kullanýcý Silindi : "+user.getFirstName()+" "+user.getLastName());
	}

}
